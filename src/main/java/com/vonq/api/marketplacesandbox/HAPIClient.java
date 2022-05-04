/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox;

import com.vonq.api.marketplacesandbox.controllers.CampaignsController;
import com.vonq.api.marketplacesandbox.controllers.ContractsController;
import com.vonq.api.marketplacesandbox.controllers.PortfolioController;
import com.vonq.api.marketplacesandbox.controllers.TaxonomyController;
import com.vonq.api.marketplacesandbox.http.client.HttpCallback;
import com.vonq.api.marketplacesandbox.http.client.HttpClient;
import com.vonq.api.marketplacesandbox.http.client.HttpClientConfiguration;
import com.vonq.api.marketplacesandbox.http.client.LoggingConfiguration;
import com.vonq.api.marketplacesandbox.http.client.OkClient;
import com.vonq.api.marketplacesandbox.http.client.ReadonlyHttpClientConfiguration;
import com.vonq.api.marketplacesandbox.http.client.ReadonlyLoggingConfiguration;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class HAPIClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private PortfolioController portfolio;
    private ContractsController contracts;
    private CampaignsController campaigns;
    private TaxonomyController taxonomy;

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Logging Configuration instance.
     */
    private final ReadonlyLoggingConfiguration loggingConfig;

    /**
     * Map of authentication Managers.
     */
    private Map<String, AuthManager> authManagers;

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private HAPIClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig,
            ReadonlyLoggingConfiguration loggingConfig, Map<String, AuthManager> authManagers,
            HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.loggingConfig = loggingConfig;
        this.httpCallback = httpCallback;

        this.authManagers = (authManagers == null) ? new HashMap<>() : new HashMap<>(authManagers);


        portfolio = new PortfolioController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        contracts = new ContractsController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        campaigns = new CampaignsController(this, this.httpClient, this.authManagers,
                this.httpCallback);
        taxonomy = new TaxonomyController(this, this.httpClient, this.authManagers,
                this.httpCallback);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of PortfolioController.
     * @return portfolio
     */
    public PortfolioController getPortfolioController() {
        return portfolio;
    }

    /**
     * Get the instance of ContractsController.
     * @return contracts
     */
    public ContractsController getContractsController() {
        return contracts;
    }

    /**
     * Get the instance of CampaignsController.
     * @return campaigns
     */
    public CampaignsController getCampaignsController() {
        return campaigns;
    }

    /**
     * Get the instance of TaxonomyController.
     * @return taxonomy
     */
    public TaxonomyController getTaxonomyController() {
        return taxonomy;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * Logging Configuration instance.
     * @return loggingConfig
     */
    public ReadonlyLoggingConfiguration getLoggingConfig() {
        return loggingConfig;
    }

    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }

    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.SANDBOX)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://marketplace-sandbox.api.vonq.com/";
            }
        }
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://marketplace.api.vonq.com/";
            }
        }
        return "https://marketplace-sandbox.api.vonq.com/";
    }

    /**
     * Converts this HAPIClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HAPIClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", loggingConfig=" + loggingConfig + ", authManagers="
                + authManagers + "]";
    }

    /**
     * Builds a new {@link HAPIClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link HAPIClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.authManagers = authManagers;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        builder.loggingConfig(configBldr -> configBldr =
                ((LoggingConfiguration) loggingConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link HAPIClient}.
     */
    public static class Builder {

        private Environment environment = Environment.SANDBOX;
        private HttpClient httpClient;
        private Map<String, AuthManager> authManagers = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();
        private LoggingConfiguration.Builder loggingConfigBuilder =
                new LoggingConfiguration.Builder();


        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * Setter for the Builder of LoggingConfiguration, takes in an operation to be
         * performed on the builder instance of logging configuration.
         * @param action Consumer for the builder of LoggingConfiguration.
         * @return Builder
         */
        public Builder loggingConfig(Consumer<LoggingConfiguration.Builder> action) {
            action.accept(loggingConfigBuilder);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new HAPIClient object using the set fields.
         * @return HAPIClient
         */
        public HAPIClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();

            LoggingConfiguration loggingConfig = loggingConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig, loggingConfig);

            return new HAPIClient(environment, httpClient, httpClientConfig, loggingConfig,
                    authManagers, httpCallback);
        }
    }
}