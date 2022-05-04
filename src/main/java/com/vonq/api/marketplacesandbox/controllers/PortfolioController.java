/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.controllers;

import com.vonq.api.marketplacesandbox.ApiHelper;
import com.vonq.api.marketplacesandbox.AuthManager;
import com.vonq.api.marketplacesandbox.Configuration;
import com.vonq.api.marketplacesandbox.exceptions.ApiException;
import com.vonq.api.marketplacesandbox.http.Headers;
import com.vonq.api.marketplacesandbox.http.client.HttpCallback;
import com.vonq.api.marketplacesandbox.http.client.HttpClient;
import com.vonq.api.marketplacesandbox.http.client.HttpContext;
import com.vonq.api.marketplacesandbox.http.request.HttpRequest;
import com.vonq.api.marketplacesandbox.http.response.HttpResponse;
import com.vonq.api.marketplacesandbox.http.response.HttpStringResponse;
import com.vonq.api.marketplacesandbox.models.AcceptLanguageEnum;
import com.vonq.api.marketplacesandbox.models.ProductModel;
import com.vonq.api.marketplacesandbox.models.ProductsDeliveryTimeModel;
import com.vonq.api.marketplacesandbox.models.SortByEnum;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class PortfolioController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public PortfolioController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public PortfolioController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * For a detailed tutorial on how to get started with portfolio search v2, check out our
     * [Quickstart Tutorial](https://pkb.stoplight.io/docs/search/docs/Tutorial.md). For an
     * implementation demo of the product search experience, check out our [Developer
     * Portal](http://vonq.io/pkb). This endpoint exposes a list of Products with the options to
     * search by Location, Job Title, Job Function and Industry. Products are ranked by their
     * relevancy to the search terms. Optionally, products can filtered by Location. Values for each
     * parameter can be fetched by calling the other endpoints in this section. Calling this
     * endpoint will guarantee that the Products you see are configured for you as our Partner.
     * Besides the default English, German and Dutch result translations can be requested by
     * specifying an `Accept-Language: [de|nl]` header.
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  includeLocationId  Optional parameter: Id for a Location to search products against.
     *         If no exact matches exist, search will be expanded to the Location's region and
     *         country. Optionally, a (comma-separated) array of values can be passed. Passing
     *         multiple values increases the number of search results.
     * @param  exactLocationId  Optional parameter: Match only products specifically assigned to a
     *         Location.
     * @param  jobFunctionId  Optional parameter: Job Function id. Not to be used in conjunction
     *         with a Job Title id.
     * @param  jobTitleId  Optional parameter: Job title id
     * @param  industryId  Optional parameter: Industry Id
     * @param  durationFrom  Optional parameter: Match only products with a duration more or equal
     *         than a certain number of days
     * @param  durationTo  Optional parameter: Match only products with a duration up to a certain
     *         number of days
     * @param  name  Optional parameter: Search text for a product name
     * @param  currency  Optional parameter: ISO-4217 code for a currency
     * @param  sortBy  Optional parameter: Which products to show first. Defaults to 'relevant'
     * @param  recommended  Optional parameter: Whether to display a list of recommended products
     *         for the search parameters. If true, returns a limited list of products for the types:
     *         Job board, social media, publication and community.
     * @param  mcEnabled  Optional parameter: Can be used to filter for products that are linked to
     *         a channel enabled for My Contracts orders
     * @param  acceptLanguage  Optional parameter: Example:
     * @param  excludeRecommended  Optional parameter: Exclude recommended products from search
     *         results. Cannot be used in combination with 'recommended'.
     * @return    Returns the List of ProductModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductModel> searchProducts(
            final Integer limit,
            final Integer offset,
            final List<String> includeLocationId,
            final String exactLocationId,
            final String jobFunctionId,
            final String jobTitleId,
            final List<String> industryId,
            final String durationFrom,
            final String durationTo,
            final String name,
            final String currency,
            final SortByEnum sortBy,
            final Boolean recommended,
            final Boolean mcEnabled,
            final AcceptLanguageEnum acceptLanguage,
            final Boolean excludeRecommended) throws ApiException, IOException {
        HttpRequest request = buildSearchProductsRequest(limit, offset, includeLocationId,
                exactLocationId, jobFunctionId, jobTitleId, industryId, durationFrom, durationTo,
                name, currency, sortBy, recommended, mcEnabled, acceptLanguage, excludeRecommended);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchProductsResponse(context);
    }

    /**
     * For a detailed tutorial on how to get started with portfolio search v2, check out our
     * [Quickstart Tutorial](https://pkb.stoplight.io/docs/search/docs/Tutorial.md). For an
     * implementation demo of the product search experience, check out our [Developer
     * Portal](http://vonq.io/pkb). This endpoint exposes a list of Products with the options to
     * search by Location, Job Title, Job Function and Industry. Products are ranked by their
     * relevancy to the search terms. Optionally, products can filtered by Location. Values for each
     * parameter can be fetched by calling the other endpoints in this section. Calling this
     * endpoint will guarantee that the Products you see are configured for you as our Partner.
     * Besides the default English, German and Dutch result translations can be requested by
     * specifying an `Accept-Language: [de|nl]` header.
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  includeLocationId  Optional parameter: Id for a Location to search products against.
     *         If no exact matches exist, search will be expanded to the Location's region and
     *         country. Optionally, a (comma-separated) array of values can be passed. Passing
     *         multiple values increases the number of search results.
     * @param  exactLocationId  Optional parameter: Match only products specifically assigned to a
     *         Location.
     * @param  jobFunctionId  Optional parameter: Job Function id. Not to be used in conjunction
     *         with a Job Title id.
     * @param  jobTitleId  Optional parameter: Job title id
     * @param  industryId  Optional parameter: Industry Id
     * @param  durationFrom  Optional parameter: Match only products with a duration more or equal
     *         than a certain number of days
     * @param  durationTo  Optional parameter: Match only products with a duration up to a certain
     *         number of days
     * @param  name  Optional parameter: Search text for a product name
     * @param  currency  Optional parameter: ISO-4217 code for a currency
     * @param  sortBy  Optional parameter: Which products to show first. Defaults to 'relevant'
     * @param  recommended  Optional parameter: Whether to display a list of recommended products
     *         for the search parameters. If true, returns a limited list of products for the types:
     *         Job board, social media, publication and community.
     * @param  mcEnabled  Optional parameter: Can be used to filter for products that are linked to
     *         a channel enabled for My Contracts orders
     * @param  acceptLanguage  Optional parameter: Example:
     * @param  excludeRecommended  Optional parameter: Exclude recommended products from search
     *         results. Cannot be used in combination with 'recommended'.
     * @return    Returns the List of ProductModel response from the API call
     */
    public CompletableFuture<List<ProductModel>> searchProductsAsync(
            final Integer limit,
            final Integer offset,
            final List<String> includeLocationId,
            final String exactLocationId,
            final String jobFunctionId,
            final String jobTitleId,
            final List<String> industryId,
            final String durationFrom,
            final String durationTo,
            final String name,
            final String currency,
            final SortByEnum sortBy,
            final Boolean recommended,
            final Boolean mcEnabled,
            final AcceptLanguageEnum acceptLanguage,
            final Boolean excludeRecommended) {
        return makeHttpCallAsync(() -> buildSearchProductsRequest(limit, offset, includeLocationId,
                exactLocationId, jobFunctionId, jobTitleId, industryId, durationFrom, durationTo,
                name, currency, sortBy, recommended, mcEnabled, acceptLanguage, excludeRecommended),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSearchProductsResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchProducts.
     */
    private HttpRequest buildSearchProductsRequest(
            final Integer limit,
            final Integer offset,
            final List<String> includeLocationId,
            final String exactLocationId,
            final String jobFunctionId,
            final String jobTitleId,
            final List<String> industryId,
            final String durationFrom,
            final String durationTo,
            final String name,
            final String currency,
            final SortByEnum sortBy,
            final Boolean recommended,
            final Boolean mcEnabled,
            final AcceptLanguageEnum acceptLanguage,
            final Boolean excludeRecommended) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/search/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("limit", limit);
        queryParameters.put("offset", offset);
        queryParameters.put("includeLocationId", includeLocationId);
        queryParameters.put("exactLocationId", exactLocationId);
        queryParameters.put("jobFunctionId", jobFunctionId);
        queryParameters.put("jobTitleId", jobTitleId);
        queryParameters.put("industryId", industryId);
        queryParameters.put("durationFrom", durationFrom);
        queryParameters.put("durationTo", durationTo);
        queryParameters.put("name", name);
        queryParameters.put("currency", currency);
        queryParameters.put("sortBy",
                (sortBy != null) ? sortBy.value() : "relevant");
        queryParameters.put("recommended", recommended);
        queryParameters.put("mcEnabled", mcEnabled);
        queryParameters.put("excludeRecommended",
                (excludeRecommended != null) ? excludeRecommended : false);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language",
                (acceptLanguage != null) ? acceptLanguage.value() : null);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for searchProducts.
     * @return An object of type List of ProductModel
     */
    private List<ProductModel> handleSearchProductsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ApiException("", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<ProductModel> result = ApiHelper.deserializeArray(responseBody,
                ProductModel[].class);
        return result;
    }

    /**
     * Sometimes you already have access to the Identification code of any particular Product and
     * you want to retrieve the most up-to-date information about it. Besides the default English,
     * German and Dutch result translations can be requested by specifying an `Accept-Language:
     * [de|nl]` header.
     * @param  productId  Required parameter: Example:
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the ProductModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductModel retrieveSingleProduct(
            final String productId,
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildRetrieveSingleProductRequest(productId, acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveSingleProductResponse(context);
    }

    /**
     * Sometimes you already have access to the Identification code of any particular Product and
     * you want to retrieve the most up-to-date information about it. Besides the default English,
     * German and Dutch result translations can be requested by specifying an `Accept-Language:
     * [de|nl]` header.
     * @param  productId  Required parameter: Example:
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the ProductModel response from the API call
     */
    public CompletableFuture<ProductModel> retrieveSingleProductAsync(
            final String productId,
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildRetrieveSingleProductRequest(productId, acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveSingleProductResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveSingleProduct.
     */
    private HttpRequest buildRetrieveSingleProductRequest(
            final String productId,
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/single/{product_id}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("product_id",
                new SimpleEntry<Object, Boolean>(productId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language",
                (acceptLanguage != null) ? acceptLanguage.value() : null);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for retrieveSingleProduct.
     * @return An object of type ProductModel
     */
    private ProductModel handleRetrieveSingleProductResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ProductModel result = ApiHelper.deserialize(responseBody,
                ProductModel.class);

        return result;
    }

    /**
     * Sometimes you already have access to the Identification codes of more than one Product and
     * you want to retrieve the most up-to-date information about them. Besides the default English,
     * German and Dutch result translations can be requested by specifying an `Accept-Language:
     * [de|nl]` header.
     * @param  productsIds  Required parameter: Example:
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of ProductModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductModel> retrieveMultipleProducts(
            final List<String> productsIds,
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildRetrieveMultipleProductsRequest(productsIds, acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveMultipleProductsResponse(context);
    }

    /**
     * Sometimes you already have access to the Identification codes of more than one Product and
     * you want to retrieve the most up-to-date information about them. Besides the default English,
     * German and Dutch result translations can be requested by specifying an `Accept-Language:
     * [de|nl]` header.
     * @param  productsIds  Required parameter: Example:
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of ProductModel response from the API call
     */
    public CompletableFuture<List<ProductModel>> retrieveMultipleProductsAsync(
            final List<String> productsIds,
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildRetrieveMultipleProductsRequest(productsIds,
                acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveMultipleProductsResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveMultipleProducts.
     */
    private HttpRequest buildRetrieveMultipleProductsRequest(
            final List<String> productsIds,
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/multiple/{products_ids}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("products_ids",
                new SimpleEntry<Object, Boolean>(productsIds, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language",
                (acceptLanguage != null) ? acceptLanguage.value() : null);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for retrieveMultipleProducts.
     * @return An object of type List of ProductModel
     */
    private List<ProductModel> handleRetrieveMultipleProductsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<ProductModel> result = ApiHelper.deserializeArray(responseBody,
                ProductModel[].class);
        return result;
    }

    /**
     * This endpoint calculates total number of days to process and setup a campaign containing a
     * list of Products, given a comma-separated list of their ids.
     * @param  productsIds  Required parameter: Example:
     * @return    Returns the List of ProductsDeliveryTimeModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductsDeliveryTimeModel> calculateOrderDeliveryTime(
            final List<String> productsIds) throws ApiException, IOException {
        HttpRequest request = buildCalculateOrderDeliveryTimeRequest(productsIds);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCalculateOrderDeliveryTimeResponse(context);
    }

    /**
     * This endpoint calculates total number of days to process and setup a campaign containing a
     * list of Products, given a comma-separated list of their ids.
     * @param  productsIds  Required parameter: Example:
     * @return    Returns the List of ProductsDeliveryTimeModel response from the API call
     */
    public CompletableFuture<List<ProductsDeliveryTimeModel>> calculateOrderDeliveryTimeAsync(
            final List<String> productsIds) {
        return makeHttpCallAsync(() -> buildCalculateOrderDeliveryTimeRequest(productsIds),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCalculateOrderDeliveryTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for calculateOrderDeliveryTime.
     */
    private HttpRequest buildCalculateOrderDeliveryTimeRequest(
            final List<String> productsIds) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/delivery-time/{products_ids}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("products_ids",
                new SimpleEntry<Object, Boolean>(productsIds, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for calculateOrderDeliveryTime.
     * @return An object of type List of ProductsDeliveryTimeModel
     */
    private List<ProductsDeliveryTimeModel> handleCalculateOrderDeliveryTimeResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<ProductsDeliveryTimeModel> result = ApiHelper.deserializeArray(responseBody,
                ProductsDeliveryTimeModel[].class);
        return result;
    }

}