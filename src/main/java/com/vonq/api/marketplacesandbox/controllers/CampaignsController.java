/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vonq.api.marketplacesandbox.ApiHelper;
import com.vonq.api.marketplacesandbox.AuthManager;
import com.vonq.api.marketplacesandbox.Configuration;
import com.vonq.api.marketplacesandbox.exceptions.ApiException;
import com.vonq.api.marketplacesandbox.exceptions.OrderCampaignErrorResponseException;
import com.vonq.api.marketplacesandbox.exceptions.TakeCampaignOfflineErrorResponse2Exception;
import com.vonq.api.marketplacesandbox.exceptions.TakeCampaignOfflineErrorResponseException;
import com.vonq.api.marketplacesandbox.http.Headers;
import com.vonq.api.marketplacesandbox.http.client.HttpCallback;
import com.vonq.api.marketplacesandbox.http.client.HttpClient;
import com.vonq.api.marketplacesandbox.http.client.HttpContext;
import com.vonq.api.marketplacesandbox.http.request.HttpRequest;
import com.vonq.api.marketplacesandbox.http.response.HttpResponse;
import com.vonq.api.marketplacesandbox.http.response.HttpStringResponse;
import com.vonq.api.marketplacesandbox.models.CampaignOrderModel;
import com.vonq.api.marketplacesandbox.models.CheckCampaignStatusresponseModel;
import com.vonq.api.marketplacesandbox.models.ListCampaignResponseModel;
import com.vonq.api.marketplacesandbox.models.OrderCampaignSuccessResponseModel;
import com.vonq.api.marketplacesandbox.models.ResultSet1Model;
import com.vonq.api.marketplacesandbox.models.TakeCampaignOfflineRequestModel;
import com.vonq.api.marketplacesandbox.models.TakeCampaignOfflineResponseModel;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CampaignsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public CampaignsController(Configuration config, HttpClient httpClient,
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
    public CampaignsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Once your Customer has decided on a list of Channels they would like to buy, you can send the
     * list along with publishing information as a `POST` request in order to create a `Campaign`.
     * In return, you'll receive the id of the newly created `Campaign` along with the URL where you
     * can access that Campaign information. For "My Contracts" type of Products, there is no
     * expiration. The vacancy can be taken offline either by the job board or manually, by calling
     * the "[Take a campaign
     * offline](https://vonq.stoplight.io/docs/hapi/b3A6MzM0NDA3MzQ-take-a-campaign-offline)"
     * endpoint. #### Target group You should use the following endpoints for the target group
     * information: - [**`Industry`**](b3A6MzM0NDA3Mzg-industry-names) - [**`Job
     * Function`**](b3A6MzM0NDA3MzU-job-functions) - [**`Education
     * Level`**](b3A6MzM0NDA3Mzk-retrieve-education-level-taxonomy) -
     * [**`Seniority`**](b3A6MzM0NDA3NDA-retrieve-seniority-taxonomy).
     * @param  body  Required parameter: Example:
     * @param  companyId  Optional parameter: Example:
     * @param  limit  Optional parameter: Example:
     * @param  offset  Optional parameter: Example:
     * @param  xCustomerId  Optional parameter: The ID of the end-user creating the order. Only
     *         required if you are using HAPI Job Post and creating orders with contracts.
     * @return    Returns the OrderCampaignSuccessResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OrderCampaignSuccessResponseModel orderCampaign(
            final CampaignOrderModel body,
            final String companyId,
            final String limit,
            final String offset,
            final String xCustomerId) throws ApiException, IOException {
        HttpRequest request = buildOrderCampaignRequest(body, companyId, limit, offset,
                xCustomerId);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleOrderCampaignResponse(context);
    }

    /**
     * Once your Customer has decided on a list of Channels they would like to buy, you can send the
     * list along with publishing information as a `POST` request in order to create a `Campaign`.
     * In return, you'll receive the id of the newly created `Campaign` along with the URL where you
     * can access that Campaign information. For "My Contracts" type of Products, there is no
     * expiration. The vacancy can be taken offline either by the job board or manually, by calling
     * the "[Take a campaign
     * offline](https://vonq.stoplight.io/docs/hapi/b3A6MzM0NDA3MzQ-take-a-campaign-offline)"
     * endpoint. #### Target group You should use the following endpoints for the target group
     * information: - [**`Industry`**](b3A6MzM0NDA3Mzg-industry-names) - [**`Job
     * Function`**](b3A6MzM0NDA3MzU-job-functions) - [**`Education
     * Level`**](b3A6MzM0NDA3Mzk-retrieve-education-level-taxonomy) -
     * [**`Seniority`**](b3A6MzM0NDA3NDA-retrieve-seniority-taxonomy).
     * @param  body  Required parameter: Example:
     * @param  companyId  Optional parameter: Example:
     * @param  limit  Optional parameter: Example:
     * @param  offset  Optional parameter: Example:
     * @param  xCustomerId  Optional parameter: The ID of the end-user creating the order. Only
     *         required if you are using HAPI Job Post and creating orders with contracts.
     * @return    Returns the OrderCampaignSuccessResponseModel response from the API call
     */
    public CompletableFuture<OrderCampaignSuccessResponseModel> orderCampaignAsync(
            final CampaignOrderModel body,
            final String companyId,
            final String limit,
            final String offset,
            final String xCustomerId) {
        return makeHttpCallAsync(() -> buildOrderCampaignRequest(body, companyId, limit, offset,
                xCustomerId),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleOrderCampaignResponse(context));
    }

    /**
     * Builds the HttpRequest object for orderCampaign.
     */
    private HttpRequest buildOrderCampaignRequest(
            final CampaignOrderModel body,
            final String companyId,
            final String limit,
            final String offset,
            final String xCustomerId) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/campaigns/order");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("companyId", companyId);
        queryParameters.put("limit", limit);
        queryParameters.put("offset", offset);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("X-Customer-Id", xCustomerId);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for orderCampaign.
     * @return An object of type OrderCampaignSuccessResponseModel
     */
    private OrderCampaignSuccessResponseModel handleOrderCampaignResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new OrderCampaignErrorResponseException("", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        OrderCampaignSuccessResponseModel result = ApiHelper.deserialize(responseBody,
                OrderCampaignSuccessResponseModel.class);

        return result;
    }

    /**
     * Displays all the existing Campaigns already ordered for this Partner is as simple as
     * executing a `GET` request against the endpoint `/campaigns`.
     * @param  companyId  Required parameter: CompanyId to filter the results on
     * @param  limit  Optional parameter: Amount of products returned
     * @param  offset  Optional parameter: Starting point
     * @return    Returns the ResultSet1Model response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResultSet1Model listCampaigns(
            final String companyId,
            final Double limit,
            final Double offset) throws ApiException, IOException {
        HttpRequest request = buildListCampaignsRequest(companyId, limit, offset);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListCampaignsResponse(context);
    }

    /**
     * Displays all the existing Campaigns already ordered for this Partner is as simple as
     * executing a `GET` request against the endpoint `/campaigns`.
     * @param  companyId  Required parameter: CompanyId to filter the results on
     * @param  limit  Optional parameter: Amount of products returned
     * @param  offset  Optional parameter: Starting point
     * @return    Returns the ResultSet1Model response from the API call
     */
    public CompletableFuture<ResultSet1Model> listCampaignsAsync(
            final String companyId,
            final Double limit,
            final Double offset) {
        return makeHttpCallAsync(() -> buildListCampaignsRequest(companyId, limit, offset),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListCampaignsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listCampaigns.
     */
    private HttpRequest buildListCampaignsRequest(
            final String companyId,
            final Double limit,
            final Double offset) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/campaings");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("companyId", companyId);
        queryParameters.put("limit", limit);
        queryParameters.put("offset", offset);

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
     * Processes the response for listCampaigns.
     * @return An object of type ResultSet1Model
     */
    private ResultSet1Model handleListCampaignsResponse(
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
        ResultSet1Model result = ApiHelper.deserialize(responseBody,
                ResultSet1Model.class);

        return result;
    }

    /**
     * Retrieve the details of a specific Campaign. Only Campaigns created by the calling Partner
     * can be retrieved.
     * @param  campaignId  Required parameter: Id of the Campaign that you want to retrieve
     * @return    Returns the ListCampaignResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListCampaignResponseModel retrieveCampaign(
            final UUID campaignId) throws ApiException, IOException {
        HttpRequest request = buildRetrieveCampaignRequest(campaignId);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveCampaignResponse(context);
    }

    /**
     * Retrieve the details of a specific Campaign. Only Campaigns created by the calling Partner
     * can be retrieved.
     * @param  campaignId  Required parameter: Id of the Campaign that you want to retrieve
     * @return    Returns the ListCampaignResponseModel response from the API call
     */
    public CompletableFuture<ListCampaignResponseModel> retrieveCampaignAsync(
            final UUID campaignId) {
        return makeHttpCallAsync(() -> buildRetrieveCampaignRequest(campaignId),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveCampaignResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveCampaign.
     */
    private HttpRequest buildRetrieveCampaignRequest(
            final UUID campaignId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/campaigns/{campaignId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("campaignId",
                new SimpleEntry<Object, Boolean>(campaignId, true));
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
     * Processes the response for retrieveCampaign.
     * @return An object of type ListCampaignResponseModel
     */
    private ListCampaignResponseModel handleRetrieveCampaignResponse(
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
        ListCampaignResponseModel result = ApiHelper.deserialize(responseBody,
                ListCampaignResponseModel.class);

        return result;
    }

    /**
     * This is a specialized endpoint for Campaign statuses only. Although the Campaign Details
     * endpoint also returns the status of a campaign, if you only need to get the specific status
     * of a Campaign, this endpoint is optimized for that.
     * @param  campaignId  Required parameter: Id of the Campaign you want the status of
     * @return    Returns the CheckCampaignStatusresponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CheckCampaignStatusresponseModel checkCampaignStatus(
            final UUID campaignId) throws ApiException, IOException {
        HttpRequest request = buildCheckCampaignStatusRequest(campaignId);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCheckCampaignStatusResponse(context);
    }

    /**
     * This is a specialized endpoint for Campaign statuses only. Although the Campaign Details
     * endpoint also returns the status of a campaign, if you only need to get the specific status
     * of a Campaign, this endpoint is optimized for that.
     * @param  campaignId  Required parameter: Id of the Campaign you want the status of
     * @return    Returns the CheckCampaignStatusresponseModel response from the API call
     */
    public CompletableFuture<CheckCampaignStatusresponseModel> checkCampaignStatusAsync(
            final UUID campaignId) {
        return makeHttpCallAsync(() -> buildCheckCampaignStatusRequest(campaignId),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCheckCampaignStatusResponse(context));
    }

    /**
     * Builds the HttpRequest object for checkCampaignStatus.
     */
    private HttpRequest buildCheckCampaignStatusRequest(
            final UUID campaignId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/campaigns/{campaignId}/status");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("campaignId",
                new SimpleEntry<Object, Boolean>(campaignId, true));
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
     * Processes the response for checkCampaignStatus.
     * @return An object of type CheckCampaignStatusresponseModel
     */
    private CheckCampaignStatusresponseModel handleCheckCampaignStatusResponse(
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
        CheckCampaignStatusresponseModel result = ApiHelper.deserialize(responseBody,
                CheckCampaignStatusresponseModel.class);

        return result;
    }

    /**
     * Specific endpoint to take a campaign offline. Keep in mind that processing this might take
     * some time and it only has an effect if the campaign's status is "online".
     * @param  campaignId  Required parameter: Id of the Campaign you want to take offline
     * @param  body  Required parameter: Example:
     * @return    Returns the TakeCampaignOfflineResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TakeCampaignOfflineResponseModel takeCampaignOffline(
            final UUID campaignId,
            final TakeCampaignOfflineRequestModel body) throws ApiException, IOException {
        HttpRequest request = buildTakeCampaignOfflineRequest(campaignId, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleTakeCampaignOfflineResponse(context);
    }

    /**
     * Specific endpoint to take a campaign offline. Keep in mind that processing this might take
     * some time and it only has an effect if the campaign's status is "online".
     * @param  campaignId  Required parameter: Id of the Campaign you want to take offline
     * @param  body  Required parameter: Example:
     * @return    Returns the TakeCampaignOfflineResponseModel response from the API call
     */
    public CompletableFuture<TakeCampaignOfflineResponseModel> takeCampaignOfflineAsync(
            final UUID campaignId,
            final TakeCampaignOfflineRequestModel body) {
        return makeHttpCallAsync(() -> buildTakeCampaignOfflineRequest(campaignId, body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleTakeCampaignOfflineResponse(context));
    }

    /**
     * Builds the HttpRequest object for takeCampaignOffline.
     */
    private HttpRequest buildTakeCampaignOfflineRequest(
            final UUID campaignId,
            final TakeCampaignOfflineRequestModel body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/campaigns/{campaignId}/cancellation");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("campaignId",
                new SimpleEntry<Object, Boolean>(campaignId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for takeCampaignOffline.
     * @return An object of type TakeCampaignOfflineResponseModel
     */
    private TakeCampaignOfflineResponseModel handleTakeCampaignOfflineResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new TakeCampaignOfflineErrorResponse2Exception("", context);
        }
        if (responseCode == 404) {
            throw new TakeCampaignOfflineErrorResponseException("", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        TakeCampaignOfflineResponseModel result = ApiHelper.deserialize(responseBody,
                TakeCampaignOfflineResponseModel.class);

        return result;
    }

}