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
 * This is a model class for Name3Model type.
 */
public class Name3Model
        extends BaseModel {
    private String languageCode;
    private String value;

    /**
     * Default constructor.
     */
    public Name3Model() {
    }

    /**
     * Initialization constructor.
     * @param  languageCode  String value for languageCode.
     * @param  value  String value for value.
     */
    public Name3Model(
            String languageCode,
            String value) {
        this.languageCode = languageCode;
        this.value = value;
    }

    /**
     * Getter for LanguageCode.
     * ICU Locale code for the Language of the Seniority's name
     * @return Returns the String
     */
    @JsonGetter("languageCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Setter for LanguageCode.
     * ICU Locale code for the Language of the Seniority's name
     * @param languageCode Value for String
     */
    @JsonSetter("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Getter for Value.
     * Seniority name in one defined Language
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * Seniority name in one defined Language
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this Name3Model into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Name3Model [" + "languageCode=" + languageCode + ", value=" + value
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Name3Model.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Name3Model.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .languageCode(getLanguageCode())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link Name3Model}.
     */
    public static class Builder {
        private String languageCode;
        private String value;



        /**
         * Setter for languageCode.
         * @param  languageCode  String value for languageCode.
         * @return Builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link Name3Model} object using the set fields.
         * @return {@link Name3Model}
         */
        public Name3Model build() {
            return new Name3Model(languageCode, value);
        }
    }
}
