/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TargetGroupElementModel type.
 */
public class TargetGroupElementModel
        extends BaseModel {
    private String description;
    private String vonqId;

    /**
     * Default constructor.
     */
    public TargetGroupElementModel() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  vonqId  String value for vonqId.
     */
    public TargetGroupElementModel(
            String description,
            String vonqId) {
        this.description = description;
        this.vonqId = vonqId;
    }

    /**
     * Getter for Description.
     * The vonq name for this target group element
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The vonq name for this target group element
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for VonqId.
     * The Vonq ID representing this concept, as indicated in the [**`Taxonomy
     * Endpoints`**](#reference/experimental-products-search)
     * @return Returns the String
     */
    @JsonGetter("vonqId")
    public String getVonqId() {
        return vonqId;
    }

    /**
     * Setter for VonqId.
     * The Vonq ID representing this concept, as indicated in the [**`Taxonomy
     * Endpoints`**](#reference/experimental-products-search)
     * @param vonqId Value for String
     */
    @JsonSetter("vonqId")
    public void setVonqId(String vonqId) {
        this.vonqId = vonqId;
    }

    /**
     * Converts this TargetGroupElementModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TargetGroupElementModel [" + "description=" + description + ", vonqId=" + vonqId
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TargetGroupElementModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TargetGroupElementModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(description, vonqId);
        return builder;
    }

    /**
     * Class to build instances of {@link TargetGroupElementModel}.
     */
    public static class Builder {
        private String description;
        private String vonqId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  description  String value for description.
         * @param  vonqId  String value for vonqId.
         */
        public Builder(String description, String vonqId) {
            this.description = description;
            this.vonqId = vonqId;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for vonqId.
         * @param  vonqId  String value for vonqId.
         * @return Builder
         */
        public Builder vonqId(String vonqId) {
            this.vonqId = vonqId;
            return this;
        }

        /**
         * Builds a new {@link TargetGroupElementModel} object using the set fields.
         * @return {@link TargetGroupElementModel}
         */
        public TargetGroupElementModel build() {
            return new TargetGroupElementModel(description, vonqId);
        }
    }
}
