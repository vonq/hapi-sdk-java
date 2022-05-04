/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrderCampaignSuccessResponseModel type.
 */
public class OrderCampaignSuccessResponseModel
        extends BaseModel {
    private String campaignId;

    /**
     * Default constructor.
     */
    public OrderCampaignSuccessResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  campaignId  String value for campaignId.
     */
    public OrderCampaignSuccessResponseModel(
            String campaignId) {
        this.campaignId = campaignId;
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
     * Converts this OrderCampaignSuccessResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderCampaignSuccessResponseModel [" + "campaignId=" + campaignId
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrderCampaignSuccessResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderCampaignSuccessResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(campaignId);
        return builder;
    }

    /**
     * Class to build instances of {@link OrderCampaignSuccessResponseModel}.
     */
    public static class Builder {
        private String campaignId;

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
         * Builds a new {@link OrderCampaignSuccessResponseModel} object using the set fields.
         * @return {@link OrderCampaignSuccessResponseModel}
         */
        public OrderCampaignSuccessResponseModel build() {
            return new OrderCampaignSuccessResponseModel(campaignId);
        }
    }
}
