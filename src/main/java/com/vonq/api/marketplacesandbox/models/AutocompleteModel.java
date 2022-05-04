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
 * This is a model class for AutocompleteModel type.
 */
public class AutocompleteModel
        extends BaseModel {
    private List<RequiredParameterEnum> requiredParameters;

    /**
     * Default constructor.
     */
    public AutocompleteModel() {
    }

    /**
     * Initialization constructor.
     * @param  requiredParameters  List of RequiredParameterEnum value for requiredParameters.
     */
    public AutocompleteModel(
            List<RequiredParameterEnum> requiredParameters) {
        this.requiredParameters = requiredParameters;
    }

    /**
     * Getter for RequiredParameters.
     * List of keys to pass to the body of the request calling the [List autocomplete values for
     * posting
     * requirements](https://vonq.stoplight.io/docs/hapi/b3A6MzM2MDEzODk-list-autocomplete-values-for-posting-requirement)
     * endpoint.
     * @return Returns the List of RequiredParameterEnum
     */
    @JsonGetter("required_parameters")
    public List<RequiredParameterEnum> getRequiredParameters() {
        return requiredParameters;
    }

    /**
     * Setter for RequiredParameters.
     * List of keys to pass to the body of the request calling the [List autocomplete values for
     * posting
     * requirements](https://vonq.stoplight.io/docs/hapi/b3A6MzM2MDEzODk-list-autocomplete-values-for-posting-requirement)
     * endpoint.
     * @param requiredParameters Value for List of RequiredParameterEnum
     */
    @JsonSetter("required_parameters")
    public void setRequiredParameters(List<RequiredParameterEnum> requiredParameters) {
        this.requiredParameters = requiredParameters;
    }

    /**
     * Converts this AutocompleteModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutocompleteModel [" + "requiredParameters=" + requiredParameters
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AutocompleteModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AutocompleteModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(requiredParameters);
        return builder;
    }

    /**
     * Class to build instances of {@link AutocompleteModel}.
     */
    public static class Builder {
        private List<RequiredParameterEnum> requiredParameters;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  requiredParameters  List of RequiredParameterEnum value for requiredParameters.
         */
        public Builder(List<RequiredParameterEnum> requiredParameters) {
            this.requiredParameters = requiredParameters;
        }

        /**
         * Setter for requiredParameters.
         * @param  requiredParameters  List of RequiredParameterEnum value for requiredParameters.
         * @return Builder
         */
        public Builder requiredParameters(List<RequiredParameterEnum> requiredParameters) {
            this.requiredParameters = requiredParameters;
            return this;
        }

        /**
         * Builds a new {@link AutocompleteModel} object using the set fields.
         * @return {@link AutocompleteModel}
         */
        public AutocompleteModel build() {
            return new AutocompleteModel(requiredParameters);
        }
    }
}
