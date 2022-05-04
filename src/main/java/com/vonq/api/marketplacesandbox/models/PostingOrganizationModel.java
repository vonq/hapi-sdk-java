/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PostingOrganizationModel type.
 */
public class PostingOrganizationModel
        extends BaseModel {
    private String name;
    private String companyLogo;

    /**
     * Default constructor.
     */
    public PostingOrganizationModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  companyLogo  String value for companyLogo.
     */
    public PostingOrganizationModel(
            String name,
            String companyLogo) {
        this.name = name;
        this.companyLogo = companyLogo;
    }

    /**
     * Getter for Name.
     * Name of the Company
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the Company
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CompanyLogo.
     * The company Logo that wants to be used on the posting. It has to be publicly available so
     * it's picked up and used for the different publishing platforms
     * @return Returns the String
     */
    @JsonGetter("companyLogo")
    public String getCompanyLogo() {
        return companyLogo;
    }

    /**
     * Setter for CompanyLogo.
     * The company Logo that wants to be used on the posting. It has to be publicly available so
     * it's picked up and used for the different publishing platforms
     * @param companyLogo Value for String
     */
    @JsonSetter("companyLogo")
    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    /**
     * Converts this PostingOrganizationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingOrganizationModel [" + "name=" + name + ", companyLogo=" + companyLogo
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingOrganizationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingOrganizationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, companyLogo);
        return builder;
    }

    /**
     * Class to build instances of {@link PostingOrganizationModel}.
     */
    public static class Builder {
        private String name;
        private String companyLogo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  companyLogo  String value for companyLogo.
         */
        public Builder(String name, String companyLogo) {
            this.name = name;
            this.companyLogo = companyLogo;
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
         * Setter for companyLogo.
         * @param  companyLogo  String value for companyLogo.
         * @return Builder
         */
        public Builder companyLogo(String companyLogo) {
            this.companyLogo = companyLogo;
            return this;
        }

        /**
         * Builds a new {@link PostingOrganizationModel} object using the set fields.
         * @return {@link PostingOrganizationModel}
         */
        public PostingOrganizationModel build() {
            return new PostingOrganizationModel(name, companyLogo);
        }
    }
}
