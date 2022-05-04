/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.vonq.api.marketplacesandbox.http.client.HttpContext;
import com.vonq.api.marketplacesandbox.models.OrderedProductsSpecModel;
import com.vonq.api.marketplacesandbox.models.PostingDetailsErrorsModel;
import com.vonq.api.marketplacesandbox.models.RecruiterInfoErrorsModel;
import java.util.List;

/**
 * This is a model class for OrderCampaignErrorResponseException type.
 */
public class OrderCampaignErrorResponseException
        extends ApiException {
    private static final long serialVersionUID = -2974833660507047195L;
    private List<String> companyId;
    private PostingDetailsErrorsModel postingDetails;
    private List<String> targetGroup;
    private RecruiterInfoErrorsModel recruiterInfo;
    private List<String> orderedProducts;
    private List<OrderedProductsSpecModel> orderedProductsSpecs;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public OrderCampaignErrorResponseException(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for CompanyId.
     * @return Returns the List of String
     */
    @JsonGetter("companyId")
    public List<String> getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for CompanyId.
     * @param companyId Value for List of String
     */
    @JsonSetter("companyId")
    private void setCompanyId(List<String> companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for PostingDetails.
     * @return Returns the PostingDetailsErrorsModel
     */
    @JsonGetter("postingDetails")
    public PostingDetailsErrorsModel getPostingDetails() {
        return this.postingDetails;
    }

    /**
     * Setter for PostingDetails.
     * @param postingDetails Value for PostingDetailsErrorsModel
     */
    @JsonSetter("postingDetails")
    private void setPostingDetails(PostingDetailsErrorsModel postingDetails) {
        this.postingDetails = postingDetails;
    }

    /**
     * Getter for TargetGroup.
     * @return Returns the List of String
     */
    @JsonGetter("targetGroup")
    public List<String> getTargetGroup() {
        return this.targetGroup;
    }

    /**
     * Setter for TargetGroup.
     * @param targetGroup Value for List of String
     */
    @JsonSetter("targetGroup")
    private void setTargetGroup(List<String> targetGroup) {
        this.targetGroup = targetGroup;
    }

    /**
     * Getter for RecruiterInfo.
     * @return Returns the RecruiterInfoErrorsModel
     */
    @JsonGetter("recruiterInfo")
    public RecruiterInfoErrorsModel getRecruiterInfo() {
        return this.recruiterInfo;
    }

    /**
     * Setter for RecruiterInfo.
     * @param recruiterInfo Value for RecruiterInfoErrorsModel
     */
    @JsonSetter("recruiterInfo")
    private void setRecruiterInfo(RecruiterInfoErrorsModel recruiterInfo) {
        this.recruiterInfo = recruiterInfo;
    }

    /**
     * Getter for OrderedProducts.
     * @return Returns the List of String
     */
    @JsonGetter("orderedProducts")
    public List<String> getOrderedProducts() {
        return this.orderedProducts;
    }

    /**
     * Setter for OrderedProducts.
     * @param orderedProducts Value for List of String
     */
    @JsonSetter("orderedProducts")
    private void setOrderedProducts(List<String> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    /**
     * Getter for OrderedProductsSpecs.
     * @return Returns the List of OrderedProductsSpecModel
     */
    @JsonGetter("orderedProductsSpecs")
    public List<OrderedProductsSpecModel> getOrderedProductsSpecs() {
        return this.orderedProductsSpecs;
    }

    /**
     * Setter for OrderedProductsSpecs.
     * @param orderedProductsSpecs Value for List of OrderedProductsSpecModel
     */
    @JsonSetter("orderedProductsSpecs")
    private void setOrderedProductsSpecs(List<OrderedProductsSpecModel> orderedProductsSpecs) {
        this.orderedProductsSpecs = orderedProductsSpecs;
    }
}
