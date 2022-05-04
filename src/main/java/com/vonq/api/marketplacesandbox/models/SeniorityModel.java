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
 * This is a model class for SeniorityModel type.
 */
public class SeniorityModel
        extends BaseModel {
    private Integer id;
    private List<Name3Model> name;

    /**
     * Default constructor.
     */
    public SeniorityModel() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  List of Name3Model value for name.
     */
    public SeniorityModel(
            Integer id,
            List<Name3Model> name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for Id.
     * Internal Identification for a Seniority Level
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Internal Identification for a Seniority Level
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the List of Name3Model
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Name3Model> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of Name3Model
     */
    @JsonSetter("name")
    public void setName(List<Name3Model> name) {
        this.name = name;
    }

    /**
     * Converts this SeniorityModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SeniorityModel [" + "id=" + id + ", name=" + name + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SeniorityModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SeniorityModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link SeniorityModel}.
     */
    public static class Builder {
        private Integer id;
        private List<Name3Model> name;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  List of Name3Model value for name.
         * @return Builder
         */
        public Builder name(List<Name3Model> name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link SeniorityModel} object using the set fields.
         * @return {@link SeniorityModel}
         */
        public SeniorityModel build() {
            return new SeniorityModel(id, name);
        }
    }
}
