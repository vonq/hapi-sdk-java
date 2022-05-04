/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.vonq.api.marketplacesandbox.ApiHelper;
import com.vonq.api.marketplacesandbox.HAPIClient;
import com.vonq.api.marketplacesandbox.exceptions.ApiException;
import com.vonq.api.marketplacesandbox.models.AcceptLanguageEnum;
import com.vonq.api.marketplacesandbox.models.ListChannelsResponseModel;
import com.vonq.api.marketplacesandbox.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContractsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static HAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ContractsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getContractsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This endpoint exposes a list of channels with support for contracts. For all of the required
     * details for creating a contract or a campaign for each channel, please call the "Retrieve
     * details for channel with support for contracts".
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListChannels() throws Exception {
        // Parameters for the API call
        String search = null;
        Integer limit = null;
        Integer offset = null;
        AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.fromString(
                "en");

        // Set callback and perform API call
        ListChannelsResponseModel result = null;
        try {
            result = controller.listChannels(search, limit, offset, acceptLanguage);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"count\":0,\"next\":\"string\",\"previous\":\"string\",\"results\":[{\"mc_enable"
                + "d\":true,\"id\":0,\"name\":\"string\",\"url\":\"string\",\"type\":\"string\"}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
