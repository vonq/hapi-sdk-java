/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.http.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class for holding logging configuration.
 */
public class LoggingConfiguration implements ReadonlyLoggingConfiguration {

    /**
     * Level enum to use with level in {@link LoggingConfiguration.Builder}.
     */
    public enum Level {
        /**
         * To log with logging level 'INFO'.
         */
        INFO,
        
        /**
         * To log with logging level 'Error'.
         */
        ERROR,
        
        /**
         * To log with logging level 'WARN'.
         */
        WARN,
        
        /**
         * To log with logging level 'DEBUG'.
         */
        DEBUG,
        
        /**
         * To log with logging level 'TRACE'.
         */
        TRACE
    }

    /**
     * HeaderLoggingPolicy enum to use with headerLoggingPolicy 
     * in {@link LoggingConfiguration.Builder}.
     * It is either used to exclude or include headers provided in header filters,
     * for various security reasons.
     */
    public enum HeaderLoggingPolicy {
        /**
         * Policy that only include the headerFilters as headers.
         * So all the headers that are not provided in header filters
         * will be excluded.
         */
        INCLUDE,
        
        /**
         * Policy that only exclude the headerFilters from headers.
         * So all the headers that are not provided in header filters
         * will be included.
         */
        EXCLUDE
    }
    
    private boolean logRequestInfo;
    private boolean logResponseInfo;
    private boolean logRequestHeaders;
    private boolean logResponseHeaders;
    private boolean logRequestBody;
    private boolean logResponseBody;
    private boolean prettyPrintLogs;
    private Level level;
    private HeaderLoggingPolicy headerLoggingPolicy;
    private Set<String> headerFilters;

    /**
     * Default Constructor.
     */
    private LoggingConfiguration(boolean logRequestInfo, boolean logResponseInfo,
            boolean logRequestHeaders, boolean logResponseHeaders, boolean logRequestBody,
            boolean logResponseBody, boolean prettyPrintLogs, Level level,
            HeaderLoggingPolicy headerLoggingPolicy, TreeSet<String> headerFilters) {
        this.logRequestInfo = logRequestInfo;
        this.logResponseInfo = logResponseInfo;
        this.logRequestHeaders = logRequestHeaders;
        this.logResponseHeaders = logResponseHeaders;
        this.logRequestBody = logRequestBody;
        this.logResponseBody = logResponseBody;
        this.prettyPrintLogs = prettyPrintLogs;
        this.level = level;
        this.headerLoggingPolicy = headerLoggingPolicy;
        this.headerFilters = Collections.unmodifiableSet(headerFilters);
    }

    /**
     * Is logging request info enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestInfo() {
        return logRequestInfo;
    }

    /**
     * Is logging response info enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseInfo() {
        return logResponseInfo;
    }

    /**
     * Is logging request headers enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestHeaders() {
        return logRequestHeaders;
    }

    /**
     * Is logging response headers enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseHeaders() {
        return logResponseHeaders;
    }

    /**
     * Is logging request body enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestBody() {
        return logRequestBody;
    }

    /**
     * Is logging response body enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseBody() {
        return logResponseBody;
    }

    /**
     * Is pretty printing log message enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isPrettyPrinting() {
        return prettyPrintLogs;
    }

    /**
     * Getter for level.
     * @return Level of logging.
     */
    public Level getLevel() {
        return level;
    }
    
    /**
     * Getter for header logging policy.
     * @return Logging policy for headers.
     */
    public HeaderLoggingPolicy getHeaderLoggingPolicy() {
        return headerLoggingPolicy;
    }

    /**
     * Getter for headers' filters.
     * @return Set of string headers to filter.
     */
    public Set<String> getHeaderFilters() {
        return headerFilters;
    }

    /**
     * Converts this LoggingConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LoggingConfiguration [logRequestInfo=" + logRequestInfo + ", logResponseInfo="
                + logResponseInfo + ", logRequestHeaders=" + logRequestHeaders
                + ", logResponseHeaders=" + logResponseHeaders + ", logRequestBody="
                + logRequestBody + ", logResponseBody=" + logResponseBody + ", prettyPrintLogs="
                + prettyPrintLogs + ", level=" + level + ", headerLoggingPolicy="
                + headerLoggingPolicy + ", headerFilters=" + headerFilters + "]";
    }
    
    /**
     * Builds a new {@link LoggingConfiguration.Builder} object.
     * Creates the instance with the current state.
     * @return a new {@link LoggingConfiguration.Builder} object
     */
    public Builder newBuilder() {
        return new Builder()
                .logRequestInfo(logRequestInfo)
                .logRequestHeaders(logRequestHeaders)
                .logRequestBody(logRequestBody)
                .logResponseInfo(logResponseInfo)
                .logResponseHeaders(logResponseHeaders)
                .logResponseBody(logResponseBody)
                .prettyPrintLogs(prettyPrintLogs)
                .level(level)
                .headerLoggingPolicy(headerLoggingPolicy)
                .headerFilters(headerFilters);
    }
    
    /**
     * Class to build instances of {@link LoggingConfiguration}.
     */
    public static class Builder {
        private boolean logRequestInfo = false;
        private boolean logResponseInfo = false;
        private boolean logRequestHeaders = false;
        private boolean logResponseHeaders = false;
        private boolean logRequestBody = false;
        private boolean logResponseBody = false;
        private boolean prettyPrintLogs = false;
        private Level level = Level.INFO;
        private HeaderLoggingPolicy headerLoggingPolicy = HeaderLoggingPolicy.EXCLUDE;
        private TreeSet<String> headerFilters = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

        /**
         * Default Constructor to initiate builder with default properties.
         */
        public Builder() {
            // Adding default header filters, which will be
            // excluded/included from/into headers logging.
            headerFilters.addAll(Arrays.asList("authorization"));
        }
        
        /**
         * Enable or disable logging of request info.
         * Request info contains "url" and "method"
         * @param logRequestInfo Whether to enable logging.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logRequestInfo(boolean logRequestInfo) {
            this.logRequestInfo = logRequestInfo;
            return this;
        }

        /**
         * Enable or disable logging of response info.
         * Response info contains "statusCode", "url", and "timeTaken"
         * @param logResponseInfo Whether to enable logging.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logResponseInfo(boolean logResponseInfo) {
            this.logResponseInfo = logResponseInfo;
            return this;
        }

        /**
         * Enable or disable logging of headers for requests.
         * @param logRequestHeaders Whether to enable logging.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logRequestHeaders(boolean logRequestHeaders) {
            this.logRequestHeaders = logRequestHeaders;
            return this;
        }

        /**
         * Enable or disable logging of headers for responses.
         * @param logResponseHeaders Whether to enable logging.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logResponseHeaders(boolean logResponseHeaders) {
            this.logResponseHeaders = logResponseHeaders;
            return this;
        }

        /**
         * Enable or disable logging of request body or form parameters.
         * @param logRequestBody Whether to enable logging.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logRequestBody(boolean logRequestBody) {
            this.logRequestBody = logRequestBody;
            return this;
        }

        /**
         * Enable or disable logging of response body.
         * @param logResponseBody Whether to enable logging.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logResponseBody(boolean logResponseBody) {
            this.logResponseBody = logResponseBody;
            return this;
        }

        /**
         * Enable all logs.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logEverything() {
            logRequestInfo = true;
            logResponseInfo = true;
            logRequestHeaders = true;
            logResponseHeaders = true;
            logRequestBody = true;
            logResponseBody = true;
            return this;
        }

        /**
         * Disable all logs.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder logNothing() {
            logRequestInfo = false;
            logResponseInfo = false;
            logRequestHeaders = false;
            logResponseHeaders = false;
            logRequestBody = false;
            logResponseBody = false;
            return this;
        }

        /**
         * Enable or disable pretty printing for logging.
         * @param prettyPrintLogs Boolean value to enable or disable.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder prettyPrintLogs(boolean prettyPrintLogs) {
            this.prettyPrintLogs = prettyPrintLogs;
            return this;
        }

        /**
         * Set level for logging.
         * @param level specify level of all logs.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder level(Level level) {
            this.level = level;
            return this;
        }

        /**
         * Set logging policy for headers.
         * @param headerLoggingPolicy specify logging policy for headers.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder headerLoggingPolicy(HeaderLoggingPolicy headerLoggingPolicy) {
            this.headerLoggingPolicy = headerLoggingPolicy;
            return this;
        }
        
        /**
         * Copy all from given collection to replace and set filters for headers.
         * @param headerFilters Set of string headers.
         * @return {@link LoggingConfiguration.Builder}
         */
        private Builder headerFilters(Set<String> headerFilters) {
            this.headerFilters.clear();
            this.headerFilters.addAll(headerFilters);
            return this;
        }
        
        /**
         * Clear all filters for headers.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder clearHeaderFilter() {
            headerFilters.clear();
            return this;
        }
        
        /**
         * Add given header as a filter for logging headers.
         * @param header String header to be added as filter.
         * @return {@link LoggingConfiguration.Builder}
         */
        public Builder addHeaderFilter(String header) {
            headerFilters.add(header);
            return this;
        }
        
        /**
         * Builds a new LoggingConfiguration object using the set fields.
         * @return {@link LoggingConfiguration}
         */
        public LoggingConfiguration build() {
            return new LoggingConfiguration(logRequestInfo, logResponseInfo, logRequestHeaders,
                    logResponseHeaders, logRequestBody, logResponseBody, prettyPrintLogs, level,
                    headerLoggingPolicy, headerFilters);
        }
    }
}