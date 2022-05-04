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
import com.vonq.api.marketplacesandbox.models.EducationLevelModel;
import com.vonq.api.marketplacesandbox.models.IndustryModel;
import com.vonq.api.marketplacesandbox.models.JobFunctionModel;
import com.vonq.api.marketplacesandbox.models.JobTitleModel;
import com.vonq.api.marketplacesandbox.models.LocationModel;
import com.vonq.api.marketplacesandbox.models.SeniorityModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class TaxonomyController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public TaxonomyController(Configuration config, HttpClient httpClient,
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
    public TaxonomyController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * This endpoint returns a tree-like structure of supported Job Functions that can be used to
     * search for Products. Use the `id` key of any Job Function in the response to search for a
     * Product. Each Job Function is associated with [**`Job Titles`**](b3A6MzM0NDA3MzY-job-titles)
     * in a one-to-many fashion. Besides the default English, German and Dutch result translations
     * can be requested by specifying an `Accept-Language: [de|nl]` header.
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of JobFunctionModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<JobFunctionModel> retrieveJobFunctionsTree(
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildRetrieveJobFunctionsTreeRequest(acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveJobFunctionsTreeResponse(context);
    }

    /**
     * This endpoint returns a tree-like structure of supported Job Functions that can be used to
     * search for Products. Use the `id` key of any Job Function in the response to search for a
     * Product. Each Job Function is associated with [**`Job Titles`**](b3A6MzM0NDA3MzY-job-titles)
     * in a one-to-many fashion. Besides the default English, German and Dutch result translations
     * can be requested by specifying an `Accept-Language: [de|nl]` header.
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of JobFunctionModel response from the API call
     */
    public CompletableFuture<List<JobFunctionModel>> retrieveJobFunctionsTreeAsync(
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildRetrieveJobFunctionsTreeRequest(acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveJobFunctionsTreeResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveJobFunctionsTree.
     */
    private HttpRequest buildRetrieveJobFunctionsTreeRequest(
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/job-functions/");

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
     * Processes the response for retrieveJobFunctionsTree.
     * @return An object of type List of JobFunctionModel
     */
    private List<JobFunctionModel> handleRetrieveJobFunctionsTreeResponse(
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
        List<JobFunctionModel> result = ApiHelper.deserializeArray(responseBody,
                JobFunctionModel[].class);
        return result;
    }

    /**
     * This endpoint takes any text as input and returns a list of supported Job Titles matching the
     * query, ordered by popularity. Use the `id` key of each object in the response to search for a
     * Product. Currently, we support 4,000 job titles for each of the following languages: English,
     * Dutch and German. Each Job Title is associated with a [**`Job
     * Function`**](b3A6MzM0NDA3MzU-job-functions) in a many-to-one fashion. Besides the default
     * English, German and Dutch result translations can be requested by specifying an
     * `Accept-Language: [de|nl]` header.
     * @param  text  Required parameter: Search text for a job title name
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of JobTitleModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<JobTitleModel> searchJobTitles(
            final String text,
            final Double limit,
            final Double offset,
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildSearchJobTitlesRequest(text, limit, offset, acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchJobTitlesResponse(context);
    }

    /**
     * This endpoint takes any text as input and returns a list of supported Job Titles matching the
     * query, ordered by popularity. Use the `id` key of each object in the response to search for a
     * Product. Currently, we support 4,000 job titles for each of the following languages: English,
     * Dutch and German. Each Job Title is associated with a [**`Job
     * Function`**](b3A6MzM0NDA3MzU-job-functions) in a many-to-one fashion. Besides the default
     * English, German and Dutch result translations can be requested by specifying an
     * `Accept-Language: [de|nl]` header.
     * @param  text  Required parameter: Search text for a job title name
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of JobTitleModel response from the API call
     */
    public CompletableFuture<List<JobTitleModel>> searchJobTitlesAsync(
            final String text,
            final Double limit,
            final Double offset,
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildSearchJobTitlesRequest(text, limit, offset,
                acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSearchJobTitlesResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchJobTitles.
     */
    private HttpRequest buildSearchJobTitlesRequest(
            final String text,
            final Double limit,
            final Double offset,
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/job-titles/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("text", text);
        queryParameters.put("limit", limit);
        queryParameters.put("offset", offset);

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
     * Processes the response for searchJobTitles.
     * @return An object of type List of JobTitleModel
     */
    private List<JobTitleModel> handleSearchJobTitlesResponse(
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
        List<JobTitleModel> result = ApiHelper.deserializeArray(responseBody,
                JobTitleModel[].class);
        return result;
    }

    /**
     * This endpoint takes any text as input and returns a list of Locations matching the query,
     * ordered by popularity. Each response will include the entire world as a Location, even no
     * Locations match the text query. Use the `id` key of each object in the response to search for
     * a Product. Supports text input in English, Dutch and German.
     * @param  text  Required parameter: Search text for a location name in either English, Dutch,
     *         German, French and Italian. Partial recognition of 20 other languages.
     * @return    Returns the List of LocationModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocationModel> searchLocations(
            final String text) throws ApiException, IOException {
        HttpRequest request = buildSearchLocationsRequest(text);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSearchLocationsResponse(context);
    }

    /**
     * This endpoint takes any text as input and returns a list of Locations matching the query,
     * ordered by popularity. Each response will include the entire world as a Location, even no
     * Locations match the text query. Use the `id` key of each object in the response to search for
     * a Product. Supports text input in English, Dutch and German.
     * @param  text  Required parameter: Search text for a location name in either English, Dutch,
     *         German, French and Italian. Partial recognition of 20 other languages.
     * @return    Returns the List of LocationModel response from the API call
     */
    public CompletableFuture<List<LocationModel>> searchLocationsAsync(
            final String text) {
        return makeHttpCallAsync(() -> buildSearchLocationsRequest(text),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSearchLocationsResponse(context));
    }

    /**
     * Builds the HttpRequest object for searchLocations.
     */
    private HttpRequest buildSearchLocationsRequest(
            final String text) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/location/search/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("text", text);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
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
     * Processes the response for searchLocations.
     * @return An object of type List of LocationModel
     */
    private List<LocationModel> handleSearchLocationsResponse(
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
        List<LocationModel> result = ApiHelper.deserializeArray(responseBody,
                LocationModel[].class);
        return result;
    }

    /**
     * This endpoint returns a list of supported industry names that can be used to search for
     * products. Results are ordered alphabetically. Use the `id` key of any Industry in the
     * response to search for a product. Besides the default English, German and Dutch result
     * translations can be requested by specifying an `Accept-Language: [de|nl]` header.
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of IndustryModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<IndustryModel> listIndustries(
            final Double limit,
            final Double offset,
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildListIndustriesRequest(limit, offset, acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListIndustriesResponse(context);
    }

    /**
     * This endpoint returns a list of supported industry names that can be used to search for
     * products. Results are ordered alphabetically. Use the `id` key of any Industry in the
     * response to search for a product. Besides the default English, German and Dutch result
     * translations can be requested by specifying an `Accept-Language: [de|nl]` header.
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  acceptLanguage  Optional parameter: Example:
     * @return    Returns the List of IndustryModel response from the API call
     */
    public CompletableFuture<List<IndustryModel>> listIndustriesAsync(
            final Double limit,
            final Double offset,
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildListIndustriesRequest(limit, offset, acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListIndustriesResponse(context));
    }

    /**
     * Builds the HttpRequest object for listIndustries.
     */
    private HttpRequest buildListIndustriesRequest(
            final Double limit,
            final Double offset,
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/industries/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("limit", limit);
        queryParameters.put("offset", offset);

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
     * Processes the response for listIndustries.
     * @return An object of type List of IndustryModel
     */
    private List<IndustryModel> handleListIndustriesResponse(
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
        List<IndustryModel> result = ApiHelper.deserializeArray(responseBody,
                IndustryModel[].class);
        return result;
    }

    /**
     * Retrieve all Education Level possible values.
     * @return    Returns the List of EducationLevelModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<EducationLevelModel> retrieveEducationLevels() throws ApiException, IOException {
        HttpRequest request = buildRetrieveEducationLevelsRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveEducationLevelsResponse(context);
    }

    /**
     * Retrieve all Education Level possible values.
     * @return    Returns the List of EducationLevelModel response from the API call
     */
    public CompletableFuture<List<EducationLevelModel>> retrieveEducationLevelsAsync() {
        return makeHttpCallAsync(() -> buildRetrieveEducationLevelsRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveEducationLevelsResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveEducationLevels.
     */
    private HttpRequest buildRetrieveEducationLevelsRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/taxonomy/education-levels");

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
     * Processes the response for retrieveEducationLevels.
     * @return An object of type List of EducationLevelModel
     */
    private List<EducationLevelModel> handleRetrieveEducationLevelsResponse(
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
        List<EducationLevelModel> result = ApiHelper.deserializeArray(responseBody,
                EducationLevelModel[].class);
        return result;
    }

    /**
     * Retrieve all Seniority possible values.
     * @return    Returns the List of SeniorityModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SeniorityModel> retrieveSeniorities() throws ApiException, IOException {
        HttpRequest request = buildRetrieveSenioritiesRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveSenioritiesResponse(context);
    }

    /**
     * Retrieve all Seniority possible values.
     * @return    Returns the List of SeniorityModel response from the API call
     */
    public CompletableFuture<List<SeniorityModel>> retrieveSenioritiesAsync() {
        return makeHttpCallAsync(() -> buildRetrieveSenioritiesRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveSenioritiesResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveSeniorities.
     */
    private HttpRequest buildRetrieveSenioritiesRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/taxonomy/seniority");

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
     * Processes the response for retrieveSeniorities.
     * @return An object of type List of SeniorityModel
     */
    private List<SeniorityModel> handleRetrieveSenioritiesResponse(
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
        List<SeniorityModel> result = ApiHelper.deserializeArray(responseBody,
                SeniorityModel[].class);
        return result;
    }

}