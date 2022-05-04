/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for JobTitleModel type.
 */
public class JobTitleModel
        extends BaseModel {
    private int id;
    private String name;

    /**
     * Default constructor.
     */
    public JobTitleModel() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  name  String value for name.
     */
    public JobTitleModel(
            int id,
            String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
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
     * Converts this JobTitleModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "JobTitleModel [" + "id=" + id + ", name=" + name + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link JobTitleModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link JobTitleModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name);
        return builder;
    }

    /**
     * Class to build instances of {@link JobTitleModel}.
     */
    public static class Builder {
        private int id;
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  name  String value for name.
         */
        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
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
         * Builds a new {@link JobTitleModel} object using the set fields.
         * @return {@link JobTitleModel}
         */
        public JobTitleModel build() {
            return new JobTitleModel(id, name);
        }
    }
}
