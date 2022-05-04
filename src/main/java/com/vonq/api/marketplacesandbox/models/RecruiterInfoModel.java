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
 * This is a model class for RecruiterInfoModel type.
 */
public class RecruiterInfoModel
        extends BaseModel {
    private String id;
    private String name;
    private String emailAddress;

    /**
     * Default constructor.
     */
    public RecruiterInfoModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  emailAddress  String value for emailAddress.
     */
    public RecruiterInfoModel(
            String name,
            String id,
            String emailAddress) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for Id.
     * A vendor-related unique identification for the Recruiter
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A vendor-related unique identification for the Recruiter
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
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
     * Getter for EmailAddress.
     * @return Returns the String
     */
    @JsonGetter("emailAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * @param emailAddress Value for String
     */
    @JsonSetter("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Converts this RecruiterInfoModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RecruiterInfoModel [" + "name=" + name + ", id=" + id + ", emailAddress="
                + emailAddress + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RecruiterInfoModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecruiterInfoModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .id(getId())
                .emailAddress(getEmailAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link RecruiterInfoModel}.
     */
    public static class Builder {
        private String name;
        private String id;
        private String emailAddress;

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
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Builds a new {@link RecruiterInfoModel} object using the set fields.
         * @return {@link RecruiterInfoModel}
         */
        public RecruiterInfoModel build() {
            return new RecruiterInfoModel(name, id, emailAddress);
        }
    }
}
