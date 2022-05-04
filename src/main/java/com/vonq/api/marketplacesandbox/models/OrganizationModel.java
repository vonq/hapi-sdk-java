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
 * This is a model class for OrganizationModel type.
 */
public class OrganizationModel
        extends BaseModel {
    private List<String> name;
    private List<String> companyLogo;

    /**
     * Default constructor.
     */
    public OrganizationModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  List of String value for name.
     * @param  companyLogo  List of String value for companyLogo.
     */
    public OrganizationModel(
            List<String> name,
            List<String> companyLogo) {
        this.name = name;
        this.companyLogo = companyLogo;
    }

    /**
     * Getter for Name.
     * @return Returns the List of String
     */
    @JsonGetter("name")
    public List<String> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of String
     */
    @JsonSetter("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    /**
     * Getter for CompanyLogo.
     * @return Returns the List of String
     */
    @JsonGetter("companyLogo")
    public List<String> getCompanyLogo() {
        return companyLogo;
    }

    /**
     * Setter for CompanyLogo.
     * @param companyLogo Value for List of String
     */
    @JsonSetter("companyLogo")
    public void setCompanyLogo(List<String> companyLogo) {
        this.companyLogo = companyLogo;
    }

    /**
     * Converts this OrganizationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrganizationModel [" + "name=" + name + ", companyLogo=" + companyLogo
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrganizationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrganizationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, companyLogo);
        return builder;
    }

    /**
     * Class to build instances of {@link OrganizationModel}.
     */
    public static class Builder {
        private List<String> name;
        private List<String> companyLogo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  List of String value for name.
         * @param  companyLogo  List of String value for companyLogo.
         */
        public Builder(List<String> name, List<String> companyLogo) {
            this.name = name;
            this.companyLogo = companyLogo;
        }

        /**
         * Setter for name.
         * @param  name  List of String value for name.
         * @return Builder
         */
        public Builder name(List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for companyLogo.
         * @param  companyLogo  List of String value for companyLogo.
         * @return Builder
         */
        public Builder companyLogo(List<String> companyLogo) {
            this.companyLogo = companyLogo;
            return this;
        }

        /**
         * Builds a new {@link OrganizationModel} object using the set fields.
         * @return {@link OrganizationModel}
         */
        public OrganizationModel build() {
            return new OrganizationModel(name, companyLogo);
        }
    }
}
