/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrderedProductsGetElementModel type.
 */
public class OrderedProductsGetElementModel
        extends BaseModel {
    private String productId;
    private String status;
    private String statusDescription;
    private String deliveredOn;
    private String duration;
    private DurationModel durationPeriod;
    private String utm;
    private String jobBoardLink;
    private String contractId;
    private PostingRequirementsModel postingRequirements;

    /**
     * Default constructor.
     */
    public OrderedProductsGetElementModel() {
    }

    /**
     * Initialization constructor.
     * @param  productId  String value for productId.
     * @param  status  String value for status.
     * @param  statusDescription  String value for statusDescription.
     * @param  deliveredOn  String value for deliveredOn.
     * @param  duration  String value for duration.
     * @param  durationPeriod  DurationModel value for durationPeriod.
     * @param  utm  String value for utm.
     * @param  jobBoardLink  String value for jobBoardLink.
     * @param  contractId  String value for contractId.
     * @param  postingRequirements  PostingRequirementsModel value for postingRequirements.
     */
    public OrderedProductsGetElementModel(
            String productId,
            String status,
            String statusDescription,
            String deliveredOn,
            String duration,
            DurationModel durationPeriod,
            String utm,
            String jobBoardLink,
            String contractId,
            PostingRequirementsModel postingRequirements) {
        this.productId = productId;
        this.status = status;
        this.statusDescription = statusDescription;
        this.deliveredOn = deliveredOn;
        this.duration = duration;
        this.durationPeriod = durationPeriod;
        this.utm = utm;
        this.jobBoardLink = jobBoardLink;
        this.contractId = contractId;
        this.postingRequirements = postingRequirements;
    }

    /**
     * Getter for ProductId.
     * Product Identification
     * @return Returns the String
     */
    @JsonGetter("productId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * Product Identification
     * @param productId Value for String
     */
    @JsonSetter("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Getter for Status.
     * Status per product
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status per product
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for StatusDescription.
     * Status description, additional status information
     * @return Returns the String
     */
    @JsonGetter("statusDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Setter for StatusDescription.
     * Status description, additional status information
     * @param statusDescription Value for String
     */
    @JsonSetter("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * Getter for DeliveredOn.
     * Date when the channel went online
     * @return Returns the String
     */
    @JsonGetter("deliveredOn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveredOn() {
        return deliveredOn;
    }

    /**
     * Setter for DeliveredOn.
     * Date when the channel went online
     * @param deliveredOn Value for String
     */
    @JsonSetter("deliveredOn")
    public void setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
    }

    /**
     * Getter for Duration.
     * How long will the `Product` be online. [DEPRECATED] please instead use the `durationPeriod`
     * @return Returns the String
     */
    @JsonGetter("duration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * How long will the `Product` be online. [DEPRECATED] please instead use the `durationPeriod`
     * @param duration Value for String
     */
    @JsonSetter("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Getter for DurationPeriod.
     * @return Returns the DurationModel
     */
    @JsonGetter("durationPeriod")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DurationModel getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Setter for DurationPeriod.
     * @param durationPeriod Value for DurationModel
     */
    @JsonSetter("durationPeriod")
    public void setDurationPeriod(DurationModel durationPeriod) {
        this.durationPeriod = durationPeriod;
    }

    /**
     * Getter for Utm.
     * Tracking codes
     * @return Returns the String
     */
    @JsonGetter("utm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUtm() {
        return utm;
    }

    /**
     * Setter for Utm.
     * Tracking codes
     * @param utm Value for String
     */
    @JsonSetter("utm")
    public void setUtm(String utm) {
        this.utm = utm;
    }

    /**
     * Getter for JobBoardLink.
     * Link to the job ad on the channel. Sometimes this link is not available from a job board,
     * then the product homepage is returned.
     * @return Returns the String
     */
    @JsonGetter("jobBoardLink")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getJobBoardLink() {
        return jobBoardLink;
    }

    /**
     * Setter for JobBoardLink.
     * Link to the job ad on the channel. Sometimes this link is not available from a job board,
     * then the product homepage is returned.
     * @param jobBoardLink Value for String
     */
    @JsonSetter("jobBoardLink")
    public void setJobBoardLink(String jobBoardLink) {
        this.jobBoardLink = jobBoardLink;
    }

    /**
     * Getter for ContractId.
     * Contract Identifier for My Contracts product
     * @return Returns the String
     */
    @JsonGetter("contractId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContractId() {
        return contractId;
    }

    /**
     * Setter for ContractId.
     * Contract Identifier for My Contracts product
     * @param contractId Value for String
     */
    @JsonSetter("contractId")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Getter for PostingRequirements.
     * @return Returns the PostingRequirementsModel
     */
    @JsonGetter("postingRequirements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostingRequirementsModel getPostingRequirements() {
        return postingRequirements;
    }

    /**
     * Setter for PostingRequirements.
     * @param postingRequirements Value for PostingRequirementsModel
     */
    @JsonSetter("postingRequirements")
    public void setPostingRequirements(PostingRequirementsModel postingRequirements) {
        this.postingRequirements = postingRequirements;
    }

    /**
     * Converts this OrderedProductsGetElementModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedProductsGetElementModel [" + "productId=" + productId + ", status=" + status
                + ", statusDescription=" + statusDescription + ", deliveredOn=" + deliveredOn
                + ", duration=" + duration + ", durationPeriod=" + durationPeriod + ", utm=" + utm
                + ", jobBoardLink=" + jobBoardLink + ", contractId=" + contractId
                + ", postingRequirements=" + postingRequirements + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrderedProductsGetElementModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedProductsGetElementModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productId(getProductId())
                .status(getStatus())
                .statusDescription(getStatusDescription())
                .deliveredOn(getDeliveredOn())
                .duration(getDuration())
                .durationPeriod(getDurationPeriod())
                .utm(getUtm())
                .jobBoardLink(getJobBoardLink())
                .contractId(getContractId())
                .postingRequirements(getPostingRequirements());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedProductsGetElementModel}.
     */
    public static class Builder {
        private String productId;
        private String status;
        private String statusDescription;
        private String deliveredOn;
        private String duration;
        private DurationModel durationPeriod;
        private String utm;
        private String jobBoardLink;
        private String contractId;
        private PostingRequirementsModel postingRequirements;



        /**
         * Setter for productId.
         * @param  productId  String value for productId.
         * @return Builder
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDescription.
         * @param  statusDescription  String value for statusDescription.
         * @return Builder
         */
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }

        /**
         * Setter for deliveredOn.
         * @param  deliveredOn  String value for deliveredOn.
         * @return Builder
         */
        public Builder deliveredOn(String deliveredOn) {
            this.deliveredOn = deliveredOn;
            return this;
        }

        /**
         * Setter for duration.
         * @param  duration  String value for duration.
         * @return Builder
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Setter for durationPeriod.
         * @param  durationPeriod  DurationModel value for durationPeriod.
         * @return Builder
         */
        public Builder durationPeriod(DurationModel durationPeriod) {
            this.durationPeriod = durationPeriod;
            return this;
        }

        /**
         * Setter for utm.
         * @param  utm  String value for utm.
         * @return Builder
         */
        public Builder utm(String utm) {
            this.utm = utm;
            return this;
        }

        /**
         * Setter for jobBoardLink.
         * @param  jobBoardLink  String value for jobBoardLink.
         * @return Builder
         */
        public Builder jobBoardLink(String jobBoardLink) {
            this.jobBoardLink = jobBoardLink;
            return this;
        }

        /**
         * Setter for contractId.
         * @param  contractId  String value for contractId.
         * @return Builder
         */
        public Builder contractId(String contractId) {
            this.contractId = contractId;
            return this;
        }

        /**
         * Setter for postingRequirements.
         * @param  postingRequirements  PostingRequirementsModel value for postingRequirements.
         * @return Builder
         */
        public Builder postingRequirements(PostingRequirementsModel postingRequirements) {
            this.postingRequirements = postingRequirements;
            return this;
        }

        /**
         * Builds a new {@link OrderedProductsGetElementModel} object using the set fields.
         * @return {@link OrderedProductsGetElementModel}
         */
        public OrderedProductsGetElementModel build() {
            return new OrderedProductsGetElementModel(productId, status, statusDescription,
                    deliveredOn, duration, durationPeriod, utm, jobBoardLink, contractId,
                    postingRequirements);
        }
    }
}
