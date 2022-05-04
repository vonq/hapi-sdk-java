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
 * This is a model class for JobFunctionModel type.
 */
public class JobFunctionModel
        extends BaseModel {
    private Double id;
    private String name;
    private Double parent;

    /**
     * Default constructor.
     */
    public JobFunctionModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  Double value for id.
     * @param  parent  Double value for parent.
     */
    public JobFunctionModel(
            String name,
            Double id,
            Double parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
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
     * Getter for Parent.
     * @return Returns the Double
     */
    @JsonGetter("parent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getParent() {
        return parent;
    }

    /**
     * Setter for Parent.
     * @param parent Value for Double
     */
    @JsonSetter("parent")
    public void setParent(Double parent) {
        this.parent = parent;
    }

    /**
     * Converts this JobFunctionModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "JobFunctionModel [" + "name=" + name + ", id=" + id + ", parent=" + parent
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link JobFunctionModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link JobFunctionModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .id(getId())
                .parent(getParent());
        return builder;
    }

    /**
     * Class to build instances of {@link JobFunctionModel}.
     */
    public static class Builder {
        private String name;
        private Double id;
        private Double parent;

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
         * Setter for parent.
         * @param  parent  Double value for parent.
         * @return Builder
         */
        public Builder parent(Double parent) {
            this.parent = parent;
            return this;
        }

        /**
         * Builds a new {@link JobFunctionModel} object using the set fields.
         * @return {@link JobFunctionModel}
         */
        public JobFunctionModel build() {
            return new JobFunctionModel(name, id, parent);
        }
    }
}
