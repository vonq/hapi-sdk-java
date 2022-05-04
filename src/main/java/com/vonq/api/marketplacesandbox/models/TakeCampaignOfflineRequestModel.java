/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TakeCampaignOfflineRequestModel type.
 */
public class TakeCampaignOfflineRequestModel
        extends BaseModel {
    private String campaignId;
    private String status;

    /**
     * Default constructor.
     */
    public TakeCampaignOfflineRequestModel() {
    }

    /**
     * Initialization constructor.
     * @param  campaignId  String value for campaignId.
     * @param  status  String value for status.
     */
    public TakeCampaignOfflineRequestModel(
            String campaignId,
            String status) {
        this.campaignId = campaignId;
        this.status = status;
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
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this TakeCampaignOfflineRequestModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TakeCampaignOfflineRequestModel [" + "campaignId=" + campaignId + ", status="
                + status + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TakeCampaignOfflineRequestModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TakeCampaignOfflineRequestModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(campaignId, status);
        return builder;
    }

    /**
     * Class to build instances of {@link TakeCampaignOfflineRequestModel}.
     */
    public static class Builder {
        private String campaignId;
        private String status;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  campaignId  String value for campaignId.
         * @param  status  String value for status.
         */
        public Builder(String campaignId, String status) {
            this.campaignId = campaignId;
            this.status = status;
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
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link TakeCampaignOfflineRequestModel} object using the set fields.
         * @return {@link TakeCampaignOfflineRequestModel}
         */
        public TakeCampaignOfflineRequestModel build() {
            return new TakeCampaignOfflineRequestModel(campaignId, status);
        }
    }
}
