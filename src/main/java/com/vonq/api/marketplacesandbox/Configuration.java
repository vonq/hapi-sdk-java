/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox;

import com.vonq.api.marketplacesandbox.http.client.ReadonlyHttpClientConfiguration;
import com.vonq.api.marketplacesandbox.http.client.ReadonlyLoggingConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * Logging Configuration instance.
     * @return a copy of loggingConfig
     */
    ReadonlyLoggingConfiguration getLoggingConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
