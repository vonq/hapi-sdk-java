/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AutocompleteValuesResponseModel type.
 */
public class AutocompleteValuesResponseModel
        extends BaseModel {
    private String key;
    private String label;

    /**
     * Default constructor.
     */
    public AutocompleteValuesResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  label  String value for label.
     */
    public AutocompleteValuesResponseModel(
            String key,
            String label) {
        this.key = key;
        this.label = label;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Label.
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Converts this AutocompleteValuesResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutocompleteValuesResponseModel [" + "key=" + key + ", label=" + label
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AutocompleteValuesResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AutocompleteValuesResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, label);
        return builder;
    }

    /**
     * Class to build instances of {@link AutocompleteValuesResponseModel}.
     */
    public static class Builder {
        private String key;
        private String label;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  String value for key.
         * @param  label  String value for label.
         */
        public Builder(String key, String label) {
            this.key = key;
            this.label = label;
        }

        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Builds a new {@link AutocompleteValuesResponseModel} object using the set fields.
         * @return {@link AutocompleteValuesResponseModel}
         */
        public AutocompleteValuesResponseModel build() {
            return new AutocompleteValuesResponseModel(key, label);
        }
    }
}
