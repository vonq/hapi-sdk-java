/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.http.client;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.vonq.api.marketplacesandbox.ApiHelper;
import com.vonq.api.marketplacesandbox.http.Headers;
import com.vonq.api.marketplacesandbox.http.client.LoggingConfiguration.Level;
import com.vonq.api.marketplacesandbox.http.request.HttpBodyRequest;
import com.vonq.api.marketplacesandbox.http.request.HttpMethod;
import com.vonq.api.marketplacesandbox.http.request.HttpRequest;
import com.vonq.api.marketplacesandbox.http.request.MultipartFileWrapper;
import com.vonq.api.marketplacesandbox.http.request.MultipartWrapper;
import com.vonq.api.marketplacesandbox.http.response.HttpResponse;
import com.vonq.api.marketplacesandbox.http.response.HttpStringResponse;
import com.vonq.api.marketplacesandbox.utilities.FileWrapper;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

/**
 * Class to log {@link HttpRequest} and {@link HttpResponse}.
 */
class HttpLogger {

    private final ConcurrentHashMap<HttpRequest, RequestEntry> requestQueue;
    private Logger logger;
    private ReadonlyLoggingConfiguration config;
    private ObjectWriter writer;

    /**
     * Default Constructor.
     * @param logger Logger instance for logging.
     * @param config {@link ReadonlyHttpClientConfiguration} as logging properties.
     */
    HttpLogger(Logger logger, ReadonlyLoggingConfiguration config) {
        this.requestQueue = new ConcurrentHashMap<HttpRequest, RequestEntry>();
        this.logger = logger;
        this.config = config;
        @SuppressWarnings("serial")
        ObjectMapper mapper = new ObjectMapper(ApiHelper.mapper) {};
        mapper.addMixIn(FileWrapper.class, LoggingMixIn.class);
        mapper.addMixIn(MultipartWrapper.class, LoggingMixIn.class);
        mapper.addMixIn(MultipartFileWrapper.class, LoggingMixIn.class);
        mapper.addMixIn(Headers.class, LoggingMixIn.class);
        this.writer = !config.isPrettyPrinting() ? mapper.writer()
                : mapper.writerWithDefaultPrettyPrinter();
    }

    /**
     * Log requests.
     * @param request HttpRequest to be logged.
     * @param url String request URL.
     */
    void logRequest(HttpRequest request, String url) {
        this.logRequest(request, url, null);
    }

    /**
     * Log requests.
     * @param request HttpRequest to be logged.
     * @param url String request URL.
     * @param additionalMessage Any additional message to be logged.
     */
    void logRequest(HttpRequest request, String url, String additionalMessage) {
        String requestId = UUID.randomUUID().toString();
        RequestEntry requestEntry = new RequestEntry(requestId, System.nanoTime(), url);
        requestQueue.put(request, requestEntry);

        if (!config.isLoggingRequestInfo() && !config.isLoggingRequestHeaders()
                && !config.isLoggingRequestBody()) {
            // if log request disabled
            return;
        }
        
        RequestMessage message = new RequestMessage();
        message.type = "Request";
        message.requestId = requestId;
        if (config.isLoggingRequestInfo()) {
            message.method = request.getHttpMethod();
            message.url = url;
            message.additionalMessage = additionalMessage;
        }

        if (config.isLoggingRequestHeaders()) {
            message.headers = getFilteredHeaders(request.getHeaders());
        }

        if (config.isLoggingRequestBody()) {
            if (request instanceof HttpBodyRequest) {
                // As request.getBody() is always a non null serialized string.
                // Hence we are calling getBody().toString().
                message.body = ApiHelper.deserializeAsObject(
                        ((HttpBodyRequest) request).getBody().toString());
            } else if (request.getParameters() != null && !request.getParameters().isEmpty()) {
                message.body = request.getParameters();
            }
        }
        
        log(message, config.getLevel(), true);
    }

    /**
     * Set error for failed requests.
     * @param request HttpRequest that failed.
     * @param error   Throwable occurred.
     */
    void setError(HttpRequest request, Throwable error) {
        RequestEntry requestEntry = requestQueue.get(request);
        if (requestEntry != null) {
            requestEntry.error = error;
            requestQueue.put(request, requestEntry);
        }
    }

    /**
     * Log Responses.
     * @param request  HttpRequest that completed.
     * @param response HttpResponse to be logged.
     */
    void logResponse(HttpRequest request, HttpResponse response) {
        this.logResponse(request, response, null);
    }

    /**
     * Log Responses.
     * @param request  HttpRequest that completed.
     * @param response HttpResponse to be logged.
     * @param additionalMessage Any additional message to be logged.
     */
    void logResponse(HttpRequest request, HttpResponse response, String additionalMessage) {
        RequestEntry requestEntry = requestQueue.get(request);
        if (requestEntry == null) {
            return;
        }
        requestQueue.remove(request);
        if (!config.isLoggingResponseInfo() && !config.isLoggingResponseHeaders()
                && !config.isLoggingResponseBody()) {
            // if log response disabled
            return;
        }
        ResponseMessage message = new ResponseMessage();
        message.type = "Response";
        message.requestId = requestEntry.requestId;
        long timeTaken = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - requestEntry.startTime);
        if (response == null) {
            message.success = false;
            message.failureReason = "HTTP REQUEST FAILED: " + requestEntry.error;
            message.url = requestEntry.url;
            message.timeTakenMillis = timeTaken;
            message.additionalMessage = additionalMessage;
        } else {
            if (config.isLoggingResponseInfo()) {
                message.statusCode = response.getStatusCode();
                message.url = requestEntry.url;
                message.timeTakenMillis = timeTaken;
                message.additionalMessage = additionalMessage;
            }

            if (config.isLoggingResponseHeaders()) {
                message.headers = getFilteredHeaders(response.getHeaders());
            }

            if (config.isLoggingResponseBody()) {
                if (response instanceof HttpStringResponse) {
                    message.body = ApiHelper.deserializeAsObject(
                            ((HttpStringResponse) response).getBody());
                }
            }
        }

        log(message, config.getLevel(), true);
    }

    private Map<String, List<String>> getFilteredHeaders(Headers headers) {
        Map<String, List<String>> filteredHeders = headers.asMultimap();
        headers.names().forEach(name -> {
            boolean isNameInFilter = config.getHeaderFilters().contains(name);
            switch (config.getHeaderLoggingPolicy()) {
                case EXCLUDE:
                    if (isNameInFilter) {
                        filteredHeders.remove(name);
                    }
                    break;
                case INCLUDE:
                    if (!isNameInFilter) {
                        filteredHeders.remove(name);
                    }
                    break;
                default:
                    break;
            }
        });
        return filteredHeders.isEmpty() ? null : filteredHeders;
    }

    /**
     * Log provided message according to logging level.
     * @param message Message instance to be logged as JSON.
     */
    private void log(Message message, Level level, boolean logException) {
        try {
            String structuredMessage = writer.writeValueAsString(message);
            
            switch (level) {
                case ERROR:
                    logger.error(structuredMessage);
                    break;
                case WARN:
                    logger.warn(structuredMessage);
                    break;
                case INFO:
                    logger.info(structuredMessage);
                    break;
                case DEBUG:
                    logger.debug(structuredMessage);
                    break;
                case TRACE:
                    logger.trace(structuredMessage);
                    break;
                default:
                    break;
            }
        } catch (JsonProcessingException e) {
            if (logException) {
                // Log as error if an exception occurs while serialization
                // i.e. converting body of message into a JSON string.
                message.body = "Unable to log body: " + e.toString();
                log(message, Level.ERROR, false);
            }
        }
    }

    /**
     * MixIn interface to update how certain fields are shown in the logs.
     */
    private interface LoggingMixIn {
        @JsonUnwrapped 
        String getHeaders();
        
        @JsonGetter("headers")
        String asMultimap();
        
        @JsonIgnore
        String getFile();
        
        @JsonGetter("file")
        String getLoggableFile();
        
        @JsonIgnore
        String getByteArray();
        
        @JsonGetter("object")
        String getLoggableObject();
    }

    /**
     * Class to hold and write request message.
     */
    private class RequestMessage extends Message {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty HttpMethod method;
    }

    /**
     * Class to hold and write response message.
     */
    private class ResponseMessage extends Message {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty boolean success = true;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty String failureReason;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty Integer statusCode;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty Long timeTakenMillis;
    }

    /**
     * Base class to hold and write message.
     */
    private class Message {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty String loggingError;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty String type;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty String requestId;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty String url;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty Map<String, List<String>> headers;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty Object body;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty String additionalMessage;
    }

    /**
     * Class to hold the request info until request completes.
     */
    private class RequestEntry {
        String requestId;
        long startTime;
        String url;
        Throwable error;

        /**
         * Default Constructor.
         * @param requestId String id assigned to the request.
         * @param startTime long start time of the request.
         * @param url       String request URI.
         */
        public RequestEntry(String requestId, long startTime, String url) {
            this.requestId = requestId;
            this.startTime = startTime;
            this.url = url;
        }
    }
}