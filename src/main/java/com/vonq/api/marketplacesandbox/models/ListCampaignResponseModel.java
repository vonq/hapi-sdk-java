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
 * This is a model class for ListCampaignResponseModel type.
 */
public class ListCampaignResponseModel
        extends BaseModel {
    private CampaignModel data;

    /**
     * Default constructor.
     */
    public ListCampaignResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  data  CampaignModel value for data.
     */
    public ListCampaignResponseModel(
            CampaignModel data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * @return Returns the CampaignModel
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CampaignModel getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for CampaignModel
     */
    @JsonSetter("data")
    public void setData(CampaignModel data) {
        this.data = data;
    }

    /**
     * Converts this ListCampaignResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCampaignResponseModel [" + "data=" + data + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListCampaignResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCampaignResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCampaignResponseModel}.
     */
    public static class Builder {
        private CampaignModel data;



        /**
         * Setter for data.
         * @param  data  CampaignModel value for data.
         * @return Builder
         */
        public Builder data(CampaignModel data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ListCampaignResponseModel} object using the set fields.
         * @return {@link ListCampaignResponseModel}
         */
        public ListCampaignResponseModel build() {
            return new ListCampaignResponseModel(data);
        }
    }
}
