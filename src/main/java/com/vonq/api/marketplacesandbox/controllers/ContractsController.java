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
import com.vonq.api.marketplacesandbox.http.Headers;
import com.vonq.api.marketplacesandbox.http.client.HttpCallback;
import com.vonq.api.marketplacesandbox.http.client.HttpClient;
import com.vonq.api.marketplacesandbox.http.client.HttpContext;
import com.vonq.api.marketplacesandbox.http.request.HttpRequest;
import com.vonq.api.marketplacesandbox.http.response.HttpResponse;
import com.vonq.api.marketplacesandbox.http.response.HttpStringResponse;
import com.vonq.api.marketplacesandbox.models.AcceptLanguageEnum;
import com.vonq.api.marketplacesandbox.models.AutocompleteValuesResponseModel;
import com.vonq.api.marketplacesandbox.models.ChannelModel;
import com.vonq.api.marketplacesandbox.models.ContractModel;
import com.vonq.api.marketplacesandbox.models.CreateContractResponseModel;
import com.vonq.api.marketplacesandbox.models.FacetAutocompleteModel;
import com.vonq.api.marketplacesandbox.models.ListChannelsResponseModel;
import com.vonq.api.marketplacesandbox.models.ListContractsResponseModel;
import com.vonq.api.marketplacesandbox.models.MultipleContractsResponseModel;
import com.vonq.api.marketplacesandbox.models.PostContractModel;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ContractsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public ContractsController(Configuration config, HttpClient httpClient,
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
    public ContractsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * This endpoint exposes a list of channels with support for contracts. For all of the required
     * details for creating a contract or a campaign for each channel, please call the "Retrieve
     * details for channel with support for contracts".
     * @param  search  Optional parameter: A search term.
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  acceptLanguage  Optional parameter: The language the client prefers.
     * @return    Returns the ListChannelsResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListChannelsResponseModel listChannels(
            final String search,
            final Integer limit,
            final Integer offset,
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildListChannelsRequest(search, limit, offset, acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListChannelsResponse(context);
    }

    /**
     * This endpoint exposes a list of channels with support for contracts. For all of the required
     * details for creating a contract or a campaign for each channel, please call the "Retrieve
     * details for channel with support for contracts".
     * @param  search  Optional parameter: A search term.
     * @param  limit  Optional parameter: Number of results to return per page.
     * @param  offset  Optional parameter: The initial index from which to return the results.
     * @param  acceptLanguage  Optional parameter: The language the client prefers.
     * @return    Returns the ListChannelsResponseModel response from the API call
     */
    public CompletableFuture<ListChannelsResponseModel> listChannelsAsync(
            final String search,
            final Integer limit,
            final Integer offset,
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildListChannelsRequest(search, limit, offset,
                acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListChannelsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listChannels.
     */
    private HttpRequest buildListChannelsRequest(
            final String search,
            final Integer limit,
            final Integer offset,
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/channels/mocs/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("search", search);
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
     * Processes the response for listChannels.
     * @return An object of type ListChannelsResponseModel
     */
    private ListChannelsResponseModel handleListChannelsResponse(
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
        ListChannelsResponseModel result = ApiHelper.deserialize(responseBody,
                ListChannelsResponseModel.class);

        return result;
    }

    /**
     * This endpoint exposes the details of a channel with support for contracts,as well as all the
     * required details for creating a contract or a campaign for each channel.
     * @param  channelId  Required parameter: ID of the channel
     * @param  acceptLanguage  Optional parameter: The language the client prefers.
     * @return    Returns the ChannelModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ChannelModel retrieveChannel(
            final String channelId,
            final AcceptLanguageEnum acceptLanguage) throws ApiException, IOException {
        HttpRequest request = buildRetrieveChannelRequest(channelId, acceptLanguage);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveChannelResponse(context);
    }

    /**
     * This endpoint exposes the details of a channel with support for contracts,as well as all the
     * required details for creating a contract or a campaign for each channel.
     * @param  channelId  Required parameter: ID of the channel
     * @param  acceptLanguage  Optional parameter: The language the client prefers.
     * @return    Returns the ChannelModel response from the API call
     */
    public CompletableFuture<ChannelModel> retrieveChannelAsync(
            final String channelId,
            final AcceptLanguageEnum acceptLanguage) {
        return makeHttpCallAsync(() -> buildRetrieveChannelRequest(channelId, acceptLanguage),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveChannelResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveChannel.
     */
    private HttpRequest buildRetrieveChannelRequest(
            final String channelId,
            final AcceptLanguageEnum acceptLanguage) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/products/channels/mocs/{channel_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("channel_id",
                new SimpleEntry<Object, Boolean>(channelId, true));
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
     * Processes the response for retrieveChannel.
     * @return An object of type ChannelModel
     */
    private ChannelModel handleRetrieveChannelResponse(
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
        ChannelModel result = ApiHelper.deserialize(responseBody,
                ChannelModel.class);

        return result;
    }

    /**
     * This endpoint exposes a list of contract available to a particular customer.
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @param  limit  Optional parameter: Amount of contracts returned
     * @param  offset  Optional parameter: Starting point
     * @return    Returns the ListContractsResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListContractsResponseModel listContracts(
            final String xCustomerId,
            final Double limit,
            final Double offset) throws ApiException, IOException {
        HttpRequest request = buildListContractsRequest(xCustomerId, limit, offset);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListContractsResponse(context);
    }

    /**
     * This endpoint exposes a list of contract available to a particular customer.
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @param  limit  Optional parameter: Amount of contracts returned
     * @param  offset  Optional parameter: Starting point
     * @return    Returns the ListContractsResponseModel response from the API call
     */
    public CompletableFuture<ListContractsResponseModel> listContractsAsync(
            final String xCustomerId,
            final Double limit,
            final Double offset) {
        return makeHttpCallAsync(() -> buildListContractsRequest(xCustomerId, limit, offset),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListContractsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listContracts.
     */
    private HttpRequest buildListContractsRequest(
            final String xCustomerId,
            final Double limit,
            final Double offset) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/contracts/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("limit", limit);
        queryParameters.put("offset", offset);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-Customer-Id", xCustomerId);
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
     * Processes the response for listContracts.
     * @return An object of type ListContractsResponseModel
     */
    private ListContractsResponseModel handleListContractsResponse(
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
        ListContractsResponseModel result = ApiHelper.deserialize(responseBody,
                ListContractsResponseModel.class);

        return result;
    }

    /**
     * This endpoint creates a new customer contract. It requires a reference to a channel, a
     * credential payload, and the facets set for the contracted product. HAPI doesn't support
     * contract editing, because job boards require the same credentials to be able to delete
     * already posted jobs via that contract at a later moment. Otherwise, deleting jobs would not
     * be possible. To edit contract credentials, the credentials need to be deleted first, and then
     * recreated. When deleted, all corresponding jobs can't be deleted anymore.
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @param  body  Required parameter: Example:
     * @return    Returns the CreateContractResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CreateContractResponseModel createContract(
            final String xCustomerId,
            final PostContractModel body) throws ApiException, IOException {
        HttpRequest request = buildCreateContractRequest(xCustomerId, body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateContractResponse(context);
    }

    /**
     * This endpoint creates a new customer contract. It requires a reference to a channel, a
     * credential payload, and the facets set for the contracted product. HAPI doesn't support
     * contract editing, because job boards require the same credentials to be able to delete
     * already posted jobs via that contract at a later moment. Otherwise, deleting jobs would not
     * be possible. To edit contract credentials, the credentials need to be deleted first, and then
     * recreated. When deleted, all corresponding jobs can't be deleted anymore.
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @param  body  Required parameter: Example:
     * @return    Returns the CreateContractResponseModel response from the API call
     */
    public CompletableFuture<CreateContractResponseModel> createContractAsync(
            final String xCustomerId,
            final PostContractModel body) {
        return makeHttpCallAsync(() -> buildCreateContractRequest(xCustomerId, body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCreateContractResponse(context));
    }

    /**
     * Builds the HttpRequest object for createContract.
     */
    private HttpRequest buildCreateContractRequest(
            final String xCustomerId,
            final PostContractModel body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/contracts/");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-Customer-Id", xCustomerId);
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createContract.
     * @return An object of type CreateContractResponseModel
     */
    private CreateContractResponseModel handleCreateContractResponse(
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
        CreateContractResponseModel result = ApiHelper.deserialize(responseBody,
                CreateContractResponseModel.class);

        return result;
    }

    /**
     * This endpoint deletes a contract. HAPI doesn't support contract editing, because job boards
     * require the same credentials to be able to delete already posted jobs via that contract at a
     * later moment. Otherwise, deleting jobs would not be possible. To edit contract credentials,
     * the credentials need to be deleted first, and then recreated. When deleted, all corresponding
     * jobs can't be deleted anymore.
     * @param  contractId  Required parameter: Example:
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteContract(
            final String contractId,
            final String xCustomerId) throws ApiException, IOException {
        HttpRequest request = buildDeleteContractRequest(contractId, xCustomerId);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleDeleteContractResponse(context);
    }

    /**
     * This endpoint deletes a contract. HAPI doesn't support contract editing, because job boards
     * require the same credentials to be able to delete already posted jobs via that contract at a
     * later moment. Otherwise, deleting jobs would not be possible. To edit contract credentials,
     * the credentials need to be deleted first, and then recreated. When deleted, all corresponding
     * jobs can't be deleted anymore.
     * @param  contractId  Required parameter: Example:
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> deleteContractAsync(
            final String contractId,
            final String xCustomerId) {
        return makeHttpCallAsync(() -> buildDeleteContractRequest(contractId, xCustomerId),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDeleteContractResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteContract.
     */
    private HttpRequest buildDeleteContractRequest(
            final String contractId,
            final String xCustomerId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/contracts/{contract_id}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("contract_id",
                new SimpleEntry<Object, Boolean>(contractId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-Customer-Id", xCustomerId);
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for deleteContract.
     * @return An object of type void
     */
    private Void handleDeleteContractResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        return null;
    }

    /**
     * This endpoint retrieves the detail for a customer contract. It contains a reference to a
     * channel, an (encrypted) credential payload, and the facets set for the My Contracts product.
     * @param  contractId  Required parameter: Example:
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @return    Returns the ContractModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ContractModel retrieveContract(
            final String contractId,
            final String xCustomerId) throws ApiException, IOException {
        HttpRequest request = buildRetrieveContractRequest(contractId, xCustomerId);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveContractResponse(context);
    }

    /**
     * This endpoint retrieves the detail for a customer contract. It contains a reference to a
     * channel, an (encrypted) credential payload, and the facets set for the My Contracts product.
     * @param  contractId  Required parameter: Example:
     * @param  xCustomerId  Required parameter: An identifier for the remote customer
     * @return    Returns the ContractModel response from the API call
     */
    public CompletableFuture<ContractModel> retrieveContractAsync(
            final String contractId,
            final String xCustomerId) {
        return makeHttpCallAsync(() -> buildRetrieveContractRequest(contractId, xCustomerId),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveContractResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveContract.
     */
    private HttpRequest buildRetrieveContractRequest(
            final String contractId,
            final String xCustomerId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/contracts/single/{contract_id}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("contract_id",
                new SimpleEntry<Object, Boolean>(contractId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("X-Customer-Id", xCustomerId);
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
     * Processes the response for retrieveContract.
     * @return An object of type ContractModel
     */
    private ContractModel handleRetrieveContractResponse(
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
        ContractModel result = ApiHelper.deserialize(responseBody,
                ContractModel.class);

        return result;
    }

    /**
     * This endpoint exposes a list of multiple contracts, if available to a specific customer.
     * @param  contractsIds  Required parameter: Example:
     * @param  limit  Optional parameter: Amount of contracts returned
     * @param  offset  Optional parameter: Starting point
     * @return    Returns the MultipleContractsResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MultipleContractsResponseModel retrieveMultipleContracts(
            final List<String> contractsIds,
            final Double limit,
            final Double offset) throws ApiException, IOException {
        HttpRequest request = buildRetrieveMultipleContractsRequest(contractsIds, limit, offset);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRetrieveMultipleContractsResponse(context);
    }

    /**
     * This endpoint exposes a list of multiple contracts, if available to a specific customer.
     * @param  contractsIds  Required parameter: Example:
     * @param  limit  Optional parameter: Amount of contracts returned
     * @param  offset  Optional parameter: Starting point
     * @return    Returns the MultipleContractsResponseModel response from the API call
     */
    public CompletableFuture<MultipleContractsResponseModel> retrieveMultipleContractsAsync(
            final List<String> contractsIds,
            final Double limit,
            final Double offset) {
        return makeHttpCallAsync(() -> buildRetrieveMultipleContractsRequest(contractsIds, limit,
                offset),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRetrieveMultipleContractsResponse(context));
    }

    /**
     * Builds the HttpRequest object for retrieveMultipleContracts.
     */
    private HttpRequest buildRetrieveMultipleContractsRequest(
            final List<String> contractsIds,
            final Double limit,
            final Double offset) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/contracts/multiple/{contracts_ids}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("contracts_ids",
                new SimpleEntry<Object, Boolean>(contractsIds, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
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
     * Processes the response for retrieveMultipleContracts.
     * @return An object of type MultipleContractsResponseModel
     */
    private MultipleContractsResponseModel handleRetrieveMultipleContractsResponse(
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
        MultipleContractsResponseModel result = ApiHelper.deserialize(responseBody,
                MultipleContractsResponseModel.class);

        return result;
    }

    /**
     * This endpoint exposes autocomplete items given a `channel_id` and a posting requirement name.
     * @param  channelId  Required parameter: channel_id (number, required)
     * @param  postingRequirementName  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the List of AutocompleteValuesResponseModel response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<AutocompleteValuesResponseModel> listAutocompleteValues(
            final double channelId,
            final String postingRequirementName,
            final FacetAutocompleteModel body) throws ApiException, IOException {
        HttpRequest request = buildListAutocompleteValuesRequest(channelId, postingRequirementName,
                body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListAutocompleteValuesResponse(context);
    }

    /**
     * This endpoint exposes autocomplete items given a `channel_id` and a posting requirement name.
     * @param  channelId  Required parameter: channel_id (number, required)
     * @param  postingRequirementName  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the List of AutocompleteValuesResponseModel response from the API call
     */
    public CompletableFuture<List<AutocompleteValuesResponseModel>> listAutocompleteValuesAsync(
            final double channelId,
            final String postingRequirementName,
            final FacetAutocompleteModel body) {
        return makeHttpCallAsync(() -> buildListAutocompleteValuesRequest(channelId,
                postingRequirementName, body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListAutocompleteValuesResponse(context));
    }

    /**
     * Builds the HttpRequest object for listAutocompleteValues.
     */
    private HttpRequest buildListAutocompleteValuesRequest(
            final double channelId,
            final String postingRequirementName,
            final FacetAutocompleteModel body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/contracts/posting-requirements/{channel_id}/{posting-requirement-name}/");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("channel_id",
                new SimpleEntry<Object, Boolean>(channelId, true));
        templateParameters.put("posting-requirement-name",
                new SimpleEntry<Object, Boolean>(postingRequirementName, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listAutocompleteValues.
     * @return An object of type List of AutocompleteValuesResponseModel
     */
    private List<AutocompleteValuesResponseModel> handleListAutocompleteValuesResponse(
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
        List<AutocompleteValuesResponseModel> result = ApiHelper.deserializeArray(responseBody,
                AutocompleteValuesResponseModel[].class);
        return result;
    }

}