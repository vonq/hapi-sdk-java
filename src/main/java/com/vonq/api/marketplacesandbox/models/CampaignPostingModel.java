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
 * This is a model class for CampaignPostingModel type.
 */
public class CampaignPostingModel
        extends BaseModel {
    private String name;
    private Double clicks;

    /**
     * Default constructor.
     */
    public CampaignPostingModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  clicks  Double value for clicks.
     */
    public CampaignPostingModel(
            String name,
            Double clicks) {
        this.name = name;
        this.clicks = clicks;
    }

    /**
     * Getter for Name.
     * The name of the Product that was bought
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the Product that was bought
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Clicks.
     * Number of clicks of the mentioned posting
     * @return Returns the Double
     */
    @JsonGetter("clicks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getClicks() {
        return clicks;
    }

    /**
     * Setter for Clicks.
     * Number of clicks of the mentioned posting
     * @param clicks Value for Double
     */
    @JsonSetter("clicks")
    public void setClicks(Double clicks) {
        this.clicks = clicks;
    }

    /**
     * Converts this CampaignPostingModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CampaignPostingModel [" + "name=" + name + ", clicks=" + clicks
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CampaignPostingModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CampaignPostingModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .clicks(getClicks());
        return builder;
    }

    /**
     * Class to build instances of {@link CampaignPostingModel}.
     */
    public static class Builder {
        private String name;
        private Double clicks;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for clicks.
         * @param  clicks  Double value for clicks.
         * @return Builder
         */
        public Builder clicks(Double clicks) {
            this.clicks = clicks;
            return this;
        }

        /**
         * Builds a new {@link CampaignPostingModel} object using the set fields.
         * @return {@link CampaignPostingModel}
         */
        public CampaignPostingModel build() {
            return new CampaignPostingModel(name, clicks);
        }
    }
}
