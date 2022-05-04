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
 * This is a model class for EducationLevelModel type.
 */
public class EducationLevelModel
        extends BaseModel {
    private Integer id;
    private List<NameModel> name;

    /**
     * Default constructor.
     */
    public EducationLevelModel() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  List of NameModel value for name.
     */
    public EducationLevelModel(
            Integer id,
            List<NameModel> name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for Id.
     * Internal Identification for an Education Level
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Internal Identification for an Education Level
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the List of NameModel
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<NameModel> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of NameModel
     */
    @JsonSetter("name")
    public void setName(List<NameModel> name) {
        this.name = name;
    }

    /**
     * Converts this EducationLevelModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EducationLevelModel [" + "id=" + id + ", name=" + name + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link EducationLevelModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EducationLevelModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link EducationLevelModel}.
     */
    public static class Builder {
        private Integer id;
        private List<NameModel> name;



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
         * @param  name  List of NameModel value for name.
         * @return Builder
         */
        public Builder name(List<NameModel> name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link EducationLevelModel} object using the set fields.
         * @return {@link EducationLevelModel}
         */
        public EducationLevelModel build() {
            return new EducationLevelModel(id, name);
        }
    }
}
