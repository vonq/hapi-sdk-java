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
 * This is a model class for IndustryModel type.
 */
public class IndustryModel
        extends BaseModel {
    private Double id;
    private String name;

    /**
     * Default constructor.
     */
    public IndustryModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  Double value for id.
     */
    public IndustryModel(
            String name,
            Double id) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for Id.
     * @return Returns the Double
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Double
     */
    @JsonSetter("id")
    public void setId(Double id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this IndustryModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IndustryModel [" + "name=" + name + ", id=" + id + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link IndustryModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IndustryModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link IndustryModel}.
     */
    public static class Builder {
        private String name;
        private Double id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
        }

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
         * Setter for id.
         * @param  id  Double value for id.
         * @return Builder
         */
        public Builder id(Double id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link IndustryModel} object using the set fields.
         * @return {@link IndustryModel}
         */
        public IndustryModel build() {
            return new IndustryModel(name, id);
        }
    }
}
