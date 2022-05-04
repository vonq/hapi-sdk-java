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
 * This is a model class for PostingWorkingLocationModel type.
 */
public class PostingWorkingLocationModel
        extends BaseModel {
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String city;
    private String country;
    private Double allowsRemoteWork;

    /**
     * Default constructor.
     */
    public PostingWorkingLocationModel() {
    }

    /**
     * Initialization constructor.
     * @param  addressLine1  String value for addressLine1.
     * @param  postcode  String value for postcode.
     * @param  city  String value for city.
     * @param  country  String value for country.
     * @param  addressLine2  String value for addressLine2.
     * @param  allowsRemoteWork  Double value for allowsRemoteWork.
     */
    public PostingWorkingLocationModel(
            String addressLine1,
            String postcode,
            String city,
            String country,
            String addressLine2,
            Double allowsRemoteWork) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postcode = postcode;
        this.city = city;
        this.country = country;
        this.allowsRemoteWork = allowsRemoteWork;
    }

    /**
     * Getter for AddressLine1.
     * @return Returns the String
     */
    @JsonGetter("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * @param addressLine1 Value for String
     */
    @JsonSetter("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressLine2.
     * @return Returns the String
     */
    @JsonGetter("addressLine2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for AddressLine2.
     * @param addressLine2 Value for String
     */
    @JsonSetter("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter for Postcode.
     * @return Returns the String
     */
    @JsonGetter("postcode")
    public String getPostcode() {
        return postcode;
    }

    /**
     * Setter for Postcode.
     * @param postcode Value for String
     */
    @JsonSetter("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Country.
     * @return Returns the String
     */
    @JsonGetter("country")
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for AllowsRemoteWork.
     * Optional parameter allowing remote work, possible values are 0 and 1, defaults to 0
     * @return Returns the Double
     */
    @JsonGetter("allowsRemoteWork")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAllowsRemoteWork() {
        return allowsRemoteWork;
    }

    /**
     * Setter for AllowsRemoteWork.
     * Optional parameter allowing remote work, possible values are 0 and 1, defaults to 0
     * @param allowsRemoteWork Value for Double
     */
    @JsonSetter("allowsRemoteWork")
    public void setAllowsRemoteWork(Double allowsRemoteWork) {
        this.allowsRemoteWork = allowsRemoteWork;
    }

    /**
     * Converts this PostingWorkingLocationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingWorkingLocationModel [" + "addressLine1=" + addressLine1 + ", postcode="
                + postcode + ", city=" + city + ", country=" + country + ", addressLine2="
                + addressLine2 + ", allowsRemoteWork=" + allowsRemoteWork
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingWorkingLocationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingWorkingLocationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(addressLine1, postcode, city, country)
                .addressLine2(getAddressLine2())
                .allowsRemoteWork(getAllowsRemoteWork());
        return builder;
    }

    /**
     * Class to build instances of {@link PostingWorkingLocationModel}.
     */
    public static class Builder {
        private String addressLine1;
        private String postcode;
        private String city;
        private String country;
        private String addressLine2;
        private Double allowsRemoteWork;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  addressLine1  String value for addressLine1.
         * @param  postcode  String value for postcode.
         * @param  city  String value for city.
         * @param  country  String value for country.
         */
        public Builder(String addressLine1, String postcode, String city, String country) {
            this.addressLine1 = addressLine1;
            this.postcode = postcode;
            this.city = city;
            this.country = country;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for postcode.
         * @param  postcode  String value for postcode.
         * @return Builder
         */
        public Builder postcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        /**
         * Setter for allowsRemoteWork.
         * @param  allowsRemoteWork  Double value for allowsRemoteWork.
         * @return Builder
         */
        public Builder allowsRemoteWork(Double allowsRemoteWork) {
            this.allowsRemoteWork = allowsRemoteWork;
            return this;
        }

        /**
         * Builds a new {@link PostingWorkingLocationModel} object using the set fields.
         * @return {@link PostingWorkingLocationModel}
         */
        public PostingWorkingLocationModel build() {
            return new PostingWorkingLocationModel(addressLine1, postcode, city, country,
                    addressLine2, allowsRemoteWork);
        }
    }
}
