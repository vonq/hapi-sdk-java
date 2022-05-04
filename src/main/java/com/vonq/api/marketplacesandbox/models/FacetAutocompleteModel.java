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
 * This is a model class for FacetAutocompleteModel type.
 */
public class FacetAutocompleteModel
        extends BaseModel {
    private String term;
    private Object credentials;

    /**
     * Default constructor.
     */
    public FacetAutocompleteModel() {
    }

    /**
     * Initialization constructor.
     * @param  term  String value for term.
     * @param  credentials  Object value for credentials.
     */
    public FacetAutocompleteModel(
            String term,
            Object credentials) {
        this.term = term;
        this.credentials = credentials;
    }

    /**
     * Getter for Term.
     * @return Returns the String
     */
    @JsonGetter("term")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTerm() {
        return term;
    }

    /**
     * Setter for Term.
     * @param term Value for String
     */
    @JsonSetter("term")
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * Getter for Credentials.
     * An object with `contract_credentials` data
     * @return Returns the Object
     */
    @JsonGetter("credentials")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getCredentials() {
        return credentials;
    }

    /**
     * Setter for Credentials.
     * An object with `contract_credentials` data
     * @param credentials Value for Object
     */
    @JsonSetter("credentials")
    public void setCredentials(Object credentials) {
        this.credentials = credentials;
    }

    /**
     * Converts this FacetAutocompleteModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FacetAutocompleteModel [" + "term=" + term + ", credentials=" + credentials
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FacetAutocompleteModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FacetAutocompleteModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .term(getTerm())
                .credentials(getCredentials());
        return builder;
    }

    /**
     * Class to build instances of {@link FacetAutocompleteModel}.
     */
    public static class Builder {
        private String term;
        private Object credentials;



        /**
         * Setter for term.
         * @param  term  String value for term.
         * @return Builder
         */
        public Builder term(String term) {
            this.term = term;
            return this;
        }

        /**
         * Setter for credentials.
         * @param  credentials  Object value for credentials.
         * @return Builder
         */
        public Builder credentials(Object credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * Builds a new {@link FacetAutocompleteModel} object using the set fields.
         * @return {@link FacetAutocompleteModel}
         */
        public FacetAutocompleteModel build() {
            return new FacetAutocompleteModel(term, credentials);
        }
    }
}
