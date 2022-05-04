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
import com.vonq.api.marketplacesandbox.models.EducationLevelModel;
import com.vonq.api.marketplacesandbox.models.JobFunctionModel;
import com.vonq.api.marketplacesandbox.models.SeniorityModel;
import com.vonq.api.marketplacesandbox.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaxonomyControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static HAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static TaxonomyController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getTaxonomyController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This endpoint returns a tree-like structure of supported Job Functions that can be used to
     * search for Products. Use the `id` key of any Job Function in the response to search for a
     * Product. Each Job Function is associated with [**`Job Titles`**](b3A6MzM0NDA3MzY-job-titles)
     * in a one-to-many fashion. Besides the default English, German and Dutch result translations
     * can be requested by specifying an `Accept-Language: [de|nl]` header.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveJobFunctionsTree() throws Exception {
        // Parameters for the API call
        AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.fromString(
                "en");

        // Set callback and perform API call
        List<JobFunctionModel> result = null;
        try {
            result = controller.retrieveJobFunctionsTree(acceptLanguage);
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
                TestHelper.isArrayOfJsonObjectsProperSubsetOf(
                "[{\"id\":8,\"name\":\"Education\",\"children\":[{\"id\":5,\"name\":\"Teaching\","
                + "\"children\":[]}]}]",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * This endpoint returns a list of supported industry names that can be used to search for
     * products. Results are ordered alphabetically. Use the `id` key of any Industry in the
     * response to search for a product. Besides the default English, German and Dutch result
     * translations can be requested by specifying an `Accept-Language: [de|nl]` header.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListIndustries() throws Exception {
        // Parameters for the API call
        Double limit = null;
        Double offset = null;
        AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.fromString(
                "en");

        // Set callback and perform API call
        try {
            controller.listIndustries(limit, offset, acceptLanguage);
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

    /**
     * Retrieve all Education Level possible values.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveEducationLevels() throws Exception {

        // Set callback and perform API call
        List<EducationLevelModel> result = null;
        try {
            result = controller.retrieveEducationLevels();
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
                TestHelper.isArrayOfJsonObjectsProperSubsetOf(
                "[{\"id\":1,\"name\":[{\"languageCode\":\"nl_NL\",\"value\":\"Master / Postdoctoraa"
                + "l\"}]}]",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve all Seniority possible values.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveSeniorities() throws Exception {

        // Set callback and perform API call
        List<SeniorityModel> result = null;
        try {
            result = controller.retrieveSeniorities();
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
                TestHelper.isArrayOfJsonObjectsProperSubsetOf(
                "[{\"id\":3,\"name\":[{\"languageCode\":\"en_GB\",\"value\":\"Manager\"}]}]",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
