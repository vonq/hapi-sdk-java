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
 * This is a model class for CampaignStatusModel type.
 */
public class CampaignStatusModel
        extends BaseModel {
    private String campaignId;
    private StatusEnum status;
    private List<OrderedProductsStatusItemModel> orderedProductsStatuses;

    /**
     * Default constructor.
     */
    public CampaignStatusModel() {
    }

    /**
     * Initialization constructor.
     * @param  campaignId  String value for campaignId.
     * @param  status  StatusEnum value for status.
     * @param  orderedProductsStatuses  List of OrderedProductsStatusItemModel value for
     *         orderedProductsStatuses.
     */
    public CampaignStatusModel(
            String campaignId,
            StatusEnum status,
            List<OrderedProductsStatusItemModel> orderedProductsStatuses) {
        this.campaignId = campaignId;
        this.status = status;
        this.orderedProductsStatuses = orderedProductsStatuses;
    }

    /**
     * Getter for CampaignId.
     * @return Returns the String
     */
    @JsonGetter("campaignId")
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Setter for CampaignId.
     * @param campaignId Value for String
     */
    @JsonSetter("campaignId")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Getter for Status.
     * Status of the campaign. One of the following
     * @return Returns the StatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of the campaign. One of the following
     * @param status Value for StatusEnum
     */
    @JsonSetter("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for OrderedProductsStatuses.
     * @return Returns the List of OrderedProductsStatusItemModel
     */
    @JsonGetter("orderedProductsStatuses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderedProductsStatusItemModel> getOrderedProductsStatuses() {
        return orderedProductsStatuses;
    }

    /**
     * Setter for OrderedProductsStatuses.
     * @param orderedProductsStatuses Value for List of OrderedProductsStatusItemModel
     */
    @JsonSetter("orderedProductsStatuses")
    public void setOrderedProductsStatuses(List<OrderedProductsStatusItemModel> orderedProductsStatuses) {
        this.orderedProductsStatuses = orderedProductsStatuses;
    }

    /**
     * Converts this CampaignStatusModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CampaignStatusModel [" + "campaignId=" + campaignId + ", status=" + status
                + ", orderedProductsStatuses=" + orderedProductsStatuses + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CampaignStatusModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CampaignStatusModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(campaignId)
                .status(getStatus())
                .orderedProductsStatuses(getOrderedProductsStatuses());
        return builder;
    }

    /**
     * Class to build instances of {@link CampaignStatusModel}.
     */
    public static class Builder {
        private String campaignId;
        private StatusEnum status;
        private List<OrderedProductsStatusItemModel> orderedProductsStatuses;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  campaignId  String value for campaignId.
         */
        public Builder(String campaignId) {
            this.campaignId = campaignId;
        }

        /**
         * Setter for campaignId.
         * @param  campaignId  String value for campaignId.
         * @return Builder
         */
        public Builder campaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  StatusEnum value for status.
         * @return Builder
         */
        public Builder status(StatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for orderedProductsStatuses.
         * @param  orderedProductsStatuses  List of OrderedProductsStatusItemModel value for
         *         orderedProductsStatuses.
         * @return Builder
         */
        public Builder orderedProductsStatuses(
                List<OrderedProductsStatusItemModel> orderedProductsStatuses) {
            this.orderedProductsStatuses = orderedProductsStatuses;
            return this;
        }

        /**
         * Builds a new {@link CampaignStatusModel} object using the set fields.
         * @return {@link CampaignStatusModel}
         */
        public CampaignStatusModel build() {
            return new CampaignStatusModel(campaignId, status, orderedProductsStatuses);
        }
    }
}
