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
 * This is a model class for PostingRequirementsModel type.
 */
public class PostingRequirementsModel
        extends BaseModel {
    private String someText;
    private List<String> multipleSelectField;
    private Double someIntValue;

    /**
     * Default constructor.
     */
    public PostingRequirementsModel() {
    }

    /**
     * Initialization constructor.
     * @param  someText  String value for someText.
     * @param  multipleSelectField  List of String value for multipleSelectField.
     * @param  someIntValue  Double value for someIntValue.
     */
    public PostingRequirementsModel(
            String someText,
            List<String> multipleSelectField,
            Double someIntValue) {
        this.someText = someText;
        this.multipleSelectField = multipleSelectField;
        this.someIntValue = someIntValue;
    }

    /**
     * Getter for SomeText.
     * @return Returns the String
     */
    @JsonGetter("someText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSomeText() {
        return someText;
    }

    /**
     * Setter for SomeText.
     * @param someText Value for String
     */
    @JsonSetter("someText")
    public void setSomeText(String someText) {
        this.someText = someText;
    }

    /**
     * Getter for MultipleSelectField.
     * @return Returns the List of String
     */
    @JsonGetter("multipleSelectField")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getMultipleSelectField() {
        return multipleSelectField;
    }

    /**
     * Setter for MultipleSelectField.
     * @param multipleSelectField Value for List of String
     */
    @JsonSetter("multipleSelectField")
    public void setMultipleSelectField(List<String> multipleSelectField) {
        this.multipleSelectField = multipleSelectField;
    }

    /**
     * Getter for SomeIntValue.
     * @return Returns the Double
     */
    @JsonGetter("someIntValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getSomeIntValue() {
        return someIntValue;
    }

    /**
     * Setter for SomeIntValue.
     * @param someIntValue Value for Double
     */
    @JsonSetter("someIntValue")
    public void setSomeIntValue(Double someIntValue) {
        this.someIntValue = someIntValue;
    }

    /**
     * Converts this PostingRequirementsModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingRequirementsModel [" + "someText=" + someText + ", multipleSelectField="
                + multipleSelectField + ", someIntValue=" + someIntValue + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingRequirementsModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingRequirementsModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .someText(getSomeText())
                .multipleSelectField(getMultipleSelectField())
                .someIntValue(getSomeIntValue());
        return builder;
    }

    /**
     * Class to build instances of {@link PostingRequirementsModel}.
     */
    public static class Builder {
        private String someText;
        private List<String> multipleSelectField;
        private Double someIntValue;



        /**
         * Setter for someText.
         * @param  someText  String value for someText.
         * @return Builder
         */
        public Builder someText(String someText) {
            this.someText = someText;
            return this;
        }

        /**
         * Setter for multipleSelectField.
         * @param  multipleSelectField  List of String value for multipleSelectField.
         * @return Builder
         */
        public Builder multipleSelectField(List<String> multipleSelectField) {
            this.multipleSelectField = multipleSelectField;
            return this;
        }

        /**
         * Setter for someIntValue.
         * @param  someIntValue  Double value for someIntValue.
         * @return Builder
         */
        public Builder someIntValue(Double someIntValue) {
            this.someIntValue = someIntValue;
            return this;
        }

        /**
         * Builds a new {@link PostingRequirementsModel} object using the set fields.
         * @return {@link PostingRequirementsModel}
         */
        public PostingRequirementsModel build() {
            return new PostingRequirementsModel(someText, multipleSelectField, someIntValue);
        }
    }
}
