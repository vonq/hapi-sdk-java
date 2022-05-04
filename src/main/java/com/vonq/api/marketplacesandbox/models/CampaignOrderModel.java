/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CampaignOrderModel type.
 */
public class CampaignOrderModel
        extends BaseModel {
    private String companyId;
    private String orderReference;
    private String currency;
    private RecruiterInfoModel recruiterInfo;
    private String campaignName;
    private PostingDetailsModel postingDetails;
    private TargetGroupModel targetGroup;
    private List<String> orderedProducts;
    private List<OrderedProductsPostElementModel> orderedProductsSpecs;

    /**
     * Default constructor.
     */
    public CampaignOrderModel() {
    }

    /**
     * Initialization constructor.
     * @param  companyId  String value for companyId.
     * @param  recruiterInfo  RecruiterInfoModel value for recruiterInfo.
     * @param  postingDetails  PostingDetailsModel value for postingDetails.
     * @param  targetGroup  TargetGroupModel value for targetGroup.
     * @param  orderedProducts  List of String value for orderedProducts.
     * @param  orderReference  String value for orderReference.
     * @param  currency  String value for currency.
     * @param  campaignName  String value for campaignName.
     * @param  orderedProductsSpecs  List of OrderedProductsPostElementModel value for
     *         orderedProductsSpecs.
     */
    public CampaignOrderModel(
            String companyId,
            RecruiterInfoModel recruiterInfo,
            PostingDetailsModel postingDetails,
            TargetGroupModel targetGroup,
            List<String> orderedProducts,
            String orderReference,
            String currency,
            String campaignName,
            List<OrderedProductsPostElementModel> orderedProductsSpecs) {
        this.companyId = companyId;
        this.orderReference = orderReference;
        this.currency = currency;
        this.recruiterInfo = recruiterInfo;
        this.campaignName = campaignName;
        this.postingDetails = postingDetails;
        this.targetGroup = targetGroup;
        this.orderedProducts = orderedProducts;
        this.orderedProductsSpecs = orderedProductsSpecs;
    }

    /**
     * Getter for CompanyId.
     * A vendor-related unique identification for the Company that's making the order. Doesn't
     * affect the order process at all, but provides a method for later filtering by this
     * identification. It's also used when creating a unified report of Campaign orders made in a
     * period of time.
     * @return Returns the String
     */
    @JsonGetter("companyId")
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Setter for CompanyId.
     * A vendor-related unique identification for the Company that's making the order. Doesn't
     * affect the order process at all, but provides a method for later filtering by this
     * identification. It's also used when creating a unified report of Campaign orders made in a
     * period of time.
     * @param companyId Value for String
     */
    @JsonSetter("companyId")
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * Getter for OrderReference.
     * A vendor-related Reference number for the order. This could be a PO number or an Invoice
     * number. Doesn't affect the order process at all, but provides a way for the ATS to identify
     * the specific order for their internal billing process Maximum length of this field is 80
     * symbols
     * @return Returns the String
     */
    @JsonGetter("orderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderReference() {
        return orderReference;
    }

    /**
     * Setter for OrderReference.
     * A vendor-related Reference number for the order. This could be a PO number or an Invoice
     * number. Doesn't affect the order process at all, but provides a way for the ATS to identify
     * the specific order for their internal billing process Maximum length of this field is 80
     * symbols
     * @param orderReference Value for String
     */
    @JsonSetter("orderReference")
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    /**
     * Getter for Currency.
     * An ISO 4217 code for a currency to use for order invoicing. Currently only GBP and USD are
     * supported. Default currency is EUR.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * An ISO 4217 code for a currency to use for order invoicing. Currently only GBP and USD are
     * supported. Default currency is EUR.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for RecruiterInfo.
     * Recruiter is the user creating the campaign and you may want to use this to provide filtering
     * by recruiter for groups sharing an account.
     * @return Returns the RecruiterInfoModel
     */
    @JsonGetter("recruiterInfo")
    public RecruiterInfoModel getRecruiterInfo() {
        return recruiterInfo;
    }

    /**
     * Setter for RecruiterInfo.
     * Recruiter is the user creating the campaign and you may want to use this to provide filtering
     * by recruiter for groups sharing an account.
     * @param recruiterInfo Value for RecruiterInfoModel
     */
    @JsonSetter("recruiterInfo")
    public void setRecruiterInfo(RecruiterInfoModel recruiterInfo) {
        this.recruiterInfo = recruiterInfo;
    }

    /**
     * Getter for CampaignName.
     * Campaign name as it's going to be listed. Doesn't have to resemble the Posting Title. For
     * example, the Campaign name could be **Software Development Manager** while the Posting title
     * could be **Want to lead a Team of Software Developers? Join us**
     * @return Returns the String
     */
    @JsonGetter("campaignName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Setter for CampaignName.
     * Campaign name as it's going to be listed. Doesn't have to resemble the Posting Title. For
     * example, the Campaign name could be **Software Development Manager** while the Posting title
     * could be **Want to lead a Team of Software Developers? Join us**
     * @param campaignName Value for String
     */
    @JsonSetter("campaignName")
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Getter for PostingDetails.
     * @return Returns the PostingDetailsModel
     */
    @JsonGetter("postingDetails")
    public PostingDetailsModel getPostingDetails() {
        return postingDetails;
    }

    /**
     * Setter for PostingDetails.
     * @param postingDetails Value for PostingDetailsModel
     */
    @JsonSetter("postingDetails")
    public void setPostingDetails(PostingDetailsModel postingDetails) {
        this.postingDetails = postingDetails;
    }

    /**
     * Getter for TargetGroup.
     * @return Returns the TargetGroupModel
     */
    @JsonGetter("targetGroup")
    public TargetGroupModel getTargetGroup() {
        return targetGroup;
    }

    /**
     * Setter for TargetGroup.
     * @param targetGroup Value for TargetGroupModel
     */
    @JsonSetter("targetGroup")
    public void setTargetGroup(TargetGroupModel targetGroup) {
        this.targetGroup = targetGroup;
    }

    /**
     * Getter for OrderedProducts.
     * A list of the Products selected by the user.
     * @return Returns the List of String
     */
    @JsonGetter("orderedProducts")
    public List<String> getOrderedProducts() {
        return orderedProducts;
    }

    /**
     * Setter for OrderedProducts.
     * A list of the Products selected by the user.
     * @param orderedProducts Value for List of String
     */
    @JsonSetter("orderedProducts")
    public void setOrderedProducts(List<String> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    /**
     * Getter for OrderedProductsSpecs.
     * Specification object for some of the ordered products
     * @return Returns the List of OrderedProductsPostElementModel
     */
    @JsonGetter("orderedProductsSpecs")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderedProductsPostElementModel> getOrderedProductsSpecs() {
        return orderedProductsSpecs;
    }

    /**
     * Setter for OrderedProductsSpecs.
     * Specification object for some of the ordered products
     * @param orderedProductsSpecs Value for List of OrderedProductsPostElementModel
     */
    @JsonSetter("orderedProductsSpecs")
    public void setOrderedProductsSpecs(List<OrderedProductsPostElementModel> orderedProductsSpecs) {
        this.orderedProductsSpecs = orderedProductsSpecs;
    }

    /**
     * Converts this CampaignOrderModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CampaignOrderModel [" + "companyId=" + companyId + ", recruiterInfo="
                + recruiterInfo + ", postingDetails=" + postingDetails + ", targetGroup="
                + targetGroup + ", orderedProducts=" + orderedProducts + ", orderReference="
                + orderReference + ", currency=" + currency + ", campaignName=" + campaignName
                + ", orderedProductsSpecs=" + orderedProductsSpecs + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CampaignOrderModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CampaignOrderModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(companyId, recruiterInfo, postingDetails, targetGroup,
                orderedProducts)
                .orderReference(getOrderReference())
                .currency(getCurrency())
                .campaignName(getCampaignName())
                .orderedProductsSpecs(getOrderedProductsSpecs());
        return builder;
    }

    /**
     * Class to build instances of {@link CampaignOrderModel}.
     */
    public static class Builder {
        private String companyId;
        private RecruiterInfoModel recruiterInfo;
        private PostingDetailsModel postingDetails;
        private TargetGroupModel targetGroup;
        private List<String> orderedProducts;
        private String orderReference;
        private String currency;
        private String campaignName;
        private List<OrderedProductsPostElementModel> orderedProductsSpecs;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  companyId  String value for companyId.
         * @param  recruiterInfo  RecruiterInfoModel value for recruiterInfo.
         * @param  postingDetails  PostingDetailsModel value for postingDetails.
         * @param  targetGroup  TargetGroupModel value for targetGroup.
         * @param  orderedProducts  List of String value for orderedProducts.
         */
        public Builder(String companyId, RecruiterInfoModel recruiterInfo,
                PostingDetailsModel postingDetails, TargetGroupModel targetGroup,
                List<String> orderedProducts) {
            this.companyId = companyId;
            this.recruiterInfo = recruiterInfo;
            this.postingDetails = postingDetails;
            this.targetGroup = targetGroup;
            this.orderedProducts = orderedProducts;
        }

        /**
         * Setter for companyId.
         * @param  companyId  String value for companyId.
         * @return Builder
         */
        public Builder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * Setter for recruiterInfo.
         * @param  recruiterInfo  RecruiterInfoModel value for recruiterInfo.
         * @return Builder
         */
        public Builder recruiterInfo(RecruiterInfoModel recruiterInfo) {
            this.recruiterInfo = recruiterInfo;
            return this;
        }

        /**
         * Setter for postingDetails.
         * @param  postingDetails  PostingDetailsModel value for postingDetails.
         * @return Builder
         */
        public Builder postingDetails(PostingDetailsModel postingDetails) {
            this.postingDetails = postingDetails;
            return this;
        }

        /**
         * Setter for targetGroup.
         * @param  targetGroup  TargetGroupModel value for targetGroup.
         * @return Builder
         */
        public Builder targetGroup(TargetGroupModel targetGroup) {
            this.targetGroup = targetGroup;
            return this;
        }

        /**
         * Setter for orderedProducts.
         * @param  orderedProducts  List of String value for orderedProducts.
         * @return Builder
         */
        public Builder orderedProducts(List<String> orderedProducts) {
            this.orderedProducts = orderedProducts;
            return this;
        }

        /**
         * Setter for orderReference.
         * @param  orderReference  String value for orderReference.
         * @return Builder
         */
        public Builder orderReference(String orderReference) {
            this.orderReference = orderReference;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for campaignName.
         * @param  campaignName  String value for campaignName.
         * @return Builder
         */
        public Builder campaignName(String campaignName) {
            this.campaignName = campaignName;
            return this;
        }

        /**
         * Setter for orderedProductsSpecs.
         * @param  orderedProductsSpecs  List of OrderedProductsPostElementModel value for
         *         orderedProductsSpecs.
         * @return Builder
         */
        public Builder orderedProductsSpecs(
                List<OrderedProductsPostElementModel> orderedProductsSpecs) {
            this.orderedProductsSpecs = orderedProductsSpecs;
            return this;
        }

        /**
         * Builds a new {@link CampaignOrderModel} object using the set fields.
         * @return {@link CampaignOrderModel}
         */
        public CampaignOrderModel build() {
            return new CampaignOrderModel(companyId, recruiterInfo, postingDetails, targetGroup,
                    orderedProducts, orderReference, currency, campaignName, orderedProductsSpecs);
        }
    }
}
