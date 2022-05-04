/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for RecruiterInfoErrorsModel type.
 */
public class RecruiterInfoErrorsModel
        extends BaseModel {
    private List<String> name;

    /**
     * Default constructor.
     */
    public RecruiterInfoErrorsModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  List of String value for name.
     */
    public RecruiterInfoErrorsModel(
            List<String> name) {
        this.name = name;
    }

    /**
     * Getter for Name.
     * @return Returns the List of String
     */
    @JsonGetter("name")
    public List<String> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of String
     */
    @JsonSetter("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    /**
     * Converts this RecruiterInfoErrorsModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RecruiterInfoErrorsModel [" + "name=" + name + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RecruiterInfoErrorsModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecruiterInfoErrorsModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name);
        return builder;
    }

    /**
     * Class to build instances of {@link RecruiterInfoErrorsModel}.
     */
    public static class Builder {
        private List<String> name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  List of String value for name.
         */
        public Builder(List<String> name) {
            this.name = name;
        }

        /**
         * Setter for name.
         * @param  name  List of String value for name.
         * @return Builder
         */
        public Builder name(List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link RecruiterInfoErrorsModel} object using the set fields.
         * @return {@link RecruiterInfoErrorsModel}
         */
        public RecruiterInfoErrorsModel build() {
            return new RecruiterInfoErrorsModel(name);
        }
    }
}
