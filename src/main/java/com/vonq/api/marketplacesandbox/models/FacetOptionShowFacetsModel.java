/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FacetOptionShowFacetsModel type.
 */
public class FacetOptionShowFacetsModel
        extends BaseModel {
    private String facet;

    /**
     * Default constructor.
     */
    public FacetOptionShowFacetsModel() {
    }

    /**
     * Initialization constructor.
     * @param  facet  String value for facet.
     */
    public FacetOptionShowFacetsModel(
            String facet) {
        this.facet = facet;
    }

    /**
     * Getter for Facet.
     * The facet name that becomes required when this option is chosen.
     * @return Returns the String
     */
    @JsonGetter("facet")
    public String getFacet() {
        return facet;
    }

    /**
     * Setter for Facet.
     * The facet name that becomes required when this option is chosen.
     * @param facet Value for String
     */
    @JsonSetter("facet")
    public void setFacet(String facet) {
        this.facet = facet;
    }

    /**
     * Converts this FacetOptionShowFacetsModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FacetOptionShowFacetsModel [" + "facet=" + facet + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FacetOptionShowFacetsModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FacetOptionShowFacetsModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(facet);
        return builder;
    }

    /**
     * Class to build instances of {@link FacetOptionShowFacetsModel}.
     */
    public static class Builder {
        private String facet;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  facet  String value for facet.
         */
        public Builder(String facet) {
            this.facet = facet;
        }

        /**
         * Setter for facet.
         * @param  facet  String value for facet.
         * @return Builder
         */
        public Builder facet(String facet) {
            this.facet = facet;
            return this;
        }

        /**
         * Builds a new {@link FacetOptionShowFacetsModel} object using the set fields.
         * @return {@link FacetOptionShowFacetsModel}
         */
        public FacetOptionShowFacetsModel build() {
            return new FacetOptionShowFacetsModel(facet);
        }
    }
}
