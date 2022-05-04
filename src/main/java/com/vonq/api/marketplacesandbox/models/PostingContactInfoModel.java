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
 * This is a model class for PostingContactInfoModel type.
 */
public class PostingContactInfoModel
        extends BaseModel {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    /**
     * Default constructor.
     */
    public PostingContactInfoModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  emailAddress  String value for emailAddress.
     */
    public PostingContactInfoModel(
            String name,
            String phoneNumber,
            String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
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
     * Getter for PhoneNumber.
     * @return Returns the String
     */
    @JsonGetter("phoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * @param phoneNumber Value for String
     */
    @JsonSetter("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * Converts this PostingContactInfoModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingContactInfoModel [" + "name=" + name + ", phoneNumber=" + phoneNumber
                + ", emailAddress=" + emailAddress + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingContactInfoModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingContactInfoModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .phoneNumber(getPhoneNumber())
                .emailAddress(getEmailAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link PostingContactInfoModel}.
     */
    public static class Builder {
        private String name;
        private String phoneNumber;
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
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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
         * Builds a new {@link PostingContactInfoModel} object using the set fields.
         * @return {@link PostingContactInfoModel}
         */
        public PostingContactInfoModel build() {
            return new PostingContactInfoModel(name, phoneNumber, emailAddress);
        }
    }
}
