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
 * This is a model class for TakeCampaignOfflineResponseModel type.
 */
public class TakeCampaignOfflineResponseModel
        extends BaseModel {
    private String campaignId;

    /**
     * Default constructor.
     */
    public TakeCampaignOfflineResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  campaignId  String value for campaignId.
     */
    public TakeCampaignOfflineResponseModel(
            String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Getter for CampaignId.
     * @return Returns the String
     */
    @JsonGetter("campaignId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this TakeCampaignOfflineResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TakeCampaignOfflineResponseModel [" + "campaignId=" + campaignId
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TakeCampaignOfflineResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TakeCampaignOfflineResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .campaignId(getCampaignId());
        return builder;
    }

    /**
     * Class to build instances of {@link TakeCampaignOfflineResponseModel}.
     */
    public static class Builder {
        private String campaignId;



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
         * Builds a new {@link TakeCampaignOfflineResponseModel} object using the set fields.
         * @return {@link TakeCampaignOfflineResponseModel}
         */
        public TakeCampaignOfflineResponseModel build() {
            return new TakeCampaignOfflineResponseModel(campaignId);
        }
    }
}
