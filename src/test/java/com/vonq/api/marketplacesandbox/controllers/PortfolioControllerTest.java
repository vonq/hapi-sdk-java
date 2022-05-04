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
import com.vonq.api.marketplacesandbox.models.SortByEnum;
import com.vonq.api.marketplacesandbox.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PortfolioControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static HAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static PortfolioController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getPortfolioController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
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
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestSearchProducts() throws Exception {
        // Parameters for the API call
        Integer limit = null;
        Integer offset = null;
        List<String> includeLocationId = null;
        String exactLocationId = null;
        String jobFunctionId = null;
        String jobTitleId = null;
        List<String> industryId = null;
        String durationFrom = null;
        String durationTo = null;
        String name = null;
        String currency = null;
        SortByEnum sortBy = SortByEnum.fromString(
                "relevant");
        Boolean recommended = null;
        Boolean mcEnabled = null;
        AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.fromString(
                "en");
        Boolean excludeRecommended = false;

        // Set callback and perform API call
        try {
            controller.searchProducts(limit, offset, includeLocationId, exactLocationId, jobFunctionId, jobTitleId, industryId, durationFrom, durationTo, name, currency, sortBy, recommended, mcEnabled, acceptLanguage, excludeRecommended);
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

    }

}
