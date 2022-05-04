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
 * This is a model class for WorkingLocationModel type.
 */
public class WorkingLocationModel
        extends BaseModel {
    private List<String> addressLine1;
    private List<String> postcode;
    private List<String> city;
    private List<String> country;

    /**
     * Default constructor.
     */
    public WorkingLocationModel() {
    }

    /**
     * Initialization constructor.
     * @param  addressLine1  List of String value for addressLine1.
     * @param  postcode  List of String value for postcode.
     * @param  city  List of String value for city.
     * @param  country  List of String value for country.
     */
    public WorkingLocationModel(
            List<String> addressLine1,
            List<String> postcode,
            List<String> city,
            List<String> country) {
        this.addressLine1 = addressLine1;
        this.postcode = postcode;
        this.city = city;
        this.country = country;
    }

    /**
     * Getter for AddressLine1.
     * @return Returns the List of String
     */
    @JsonGetter("addressLine1")
    public List<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * @param addressLine1 Value for List of String
     */
    @JsonSetter("addressLine1")
    public void setAddressLine1(List<String> addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for Postcode.
     * @return Returns the List of String
     */
    @JsonGetter("postcode")
    public List<String> getPostcode() {
        return postcode;
    }

    /**
     * Setter for Postcode.
     * @param postcode Value for List of String
     */
    @JsonSetter("postcode")
    public void setPostcode(List<String> postcode) {
        this.postcode = postcode;
    }

    /**
     * Getter for City.
     * @return Returns the List of String
     */
    @JsonGetter("city")
    public List<String> getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for List of String
     */
    @JsonSetter("city")
    public void setCity(List<String> city) {
        this.city = city;
    }

    /**
     * Getter for Country.
     * @return Returns the List of String
     */
    @JsonGetter("country")
    public List<String> getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * @param country Value for List of String
     */
    @JsonSetter("country")
    public void setCountry(List<String> country) {
        this.country = country;
    }

    /**
     * Converts this WorkingLocationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WorkingLocationModel [" + "addressLine1=" + addressLine1 + ", postcode=" + postcode
                + ", city=" + city + ", country=" + country + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WorkingLocationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WorkingLocationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(addressLine1, postcode, city, country);
        return builder;
    }

    /**
     * Class to build instances of {@link WorkingLocationModel}.
     */
    public static class Builder {
        private List<String> addressLine1;
        private List<String> postcode;
        private List<String> city;
        private List<String> country;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  addressLine1  List of String value for addressLine1.
         * @param  postcode  List of String value for postcode.
         * @param  city  List of String value for city.
         * @param  country  List of String value for country.
         */
        public Builder(List<String> addressLine1, List<String> postcode, List<String> city,
                List<String> country) {
            this.addressLine1 = addressLine1;
            this.postcode = postcode;
            this.city = city;
            this.country = country;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  List of String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(List<String> addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for postcode.
         * @param  postcode  List of String value for postcode.
         * @return Builder
         */
        public Builder postcode(List<String> postcode) {
            this.postcode = postcode;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  List of String value for city.
         * @return Builder
         */
        public Builder city(List<String> city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  List of String value for country.
         * @return Builder
         */
        public Builder country(List<String> country) {
            this.country = country;
            return this;
        }

        /**
         * Builds a new {@link WorkingLocationModel} object using the set fields.
         * @return {@link WorkingLocationModel}
         */
        public WorkingLocationModel build() {
            return new WorkingLocationModel(addressLine1, postcode, city, country);
        }
    }
}
