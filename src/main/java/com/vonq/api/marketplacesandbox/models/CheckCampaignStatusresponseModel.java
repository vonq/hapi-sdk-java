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
 * This is a model class for CheckCampaignStatusresponseModel type.
 */
public class CheckCampaignStatusresponseModel
        extends BaseModel {
    private CampaignStatusModel data;

    /**
     * Default constructor.
     */
    public CheckCampaignStatusresponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  data  CampaignStatusModel value for data.
     */
    public CheckCampaignStatusresponseModel(
            CampaignStatusModel data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * @return Returns the CampaignStatusModel
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CampaignStatusModel getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for CampaignStatusModel
     */
    @JsonSetter("data")
    public void setData(CampaignStatusModel data) {
        this.data = data;
    }

    /**
     * Converts this CheckCampaignStatusresponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckCampaignStatusresponseModel [" + "data=" + data + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CheckCampaignStatusresponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckCampaignStatusresponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link CheckCampaignStatusresponseModel}.
     */
    public static class Builder {
        private CampaignStatusModel data;



        /**
         * Setter for data.
         * @param  data  CampaignStatusModel value for data.
         * @return Builder
         */
        public Builder data(CampaignStatusModel data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link CheckCampaignStatusresponseModel} object using the set fields.
         * @return {@link CheckCampaignStatusresponseModel}
         */
        public CheckCampaignStatusresponseModel build() {
            return new CheckCampaignStatusresponseModel(data);
        }
    }
}
