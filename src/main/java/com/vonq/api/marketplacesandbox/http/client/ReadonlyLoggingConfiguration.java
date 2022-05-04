/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.http.client;

import com.vonq.api.marketplacesandbox.http.client.LoggingConfiguration.HeaderLoggingPolicy;
import com.vonq.api.marketplacesandbox.http.client.LoggingConfiguration.Level;
import java.util.Set;

/**
 * Interface for holding logging configuration.
 */
public interface ReadonlyLoggingConfiguration {

    /**
     * Is logging request info enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestInfo();

    /**
     * Is logging response info enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseInfo();

    /**
     * Is logging request headers enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestHeaders();

    /**
     * Is logging response headers enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseHeaders();

    /**
     * Is logging request body enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingRequestBody();

    /**
     * Is logging response body enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isLoggingResponseBody();

    /**
     * Is pretty printing log message enabled.
     * @return true if enabled, false otherwise.
     */
    public boolean isPrettyPrinting();

    /**
     * Getter for level.
     * @return Level of logging.
     */
    public Level getLevel();

    /**
     * Getter for header logging policy.
     * @return Logging policy for headers.
     */
    public HeaderLoggingPolicy getHeaderLoggingPolicy();

    /**
     * Getter for headers' filters.
     * @return Set of string headers to filter.
     */
    public Set<String> getHeaderFilters();
}