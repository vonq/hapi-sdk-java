/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for FacetModel type.
 */
public class FacetModel
        extends BaseModel {
    private String name;
    private String label;
    private String sort;
    private boolean required;
    private TypeEnum type;
    private List<FacetOptionModel> options;
    private List<FacetRuleModel> rules;
    private AutocompleteModel autocomplete;

    /**
     * Default constructor.
     */
    public FacetModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  label  String value for label.
     * @param  sort  String value for sort.
     * @param  required  boolean value for required.
     * @param  type  TypeEnum value for type.
     * @param  options  List of FacetOptionModel value for options.
     * @param  autocomplete  AutocompleteModel value for autocomplete.
     * @param  rules  List of FacetRuleModel value for rules.
     */
    public FacetModel(
            String name,
            String label,
            String sort,
            boolean required,
            TypeEnum type,
            List<FacetOptionModel> options,
            AutocompleteModel autocomplete,
            List<FacetRuleModel> rules) {
        this.name = name;
        this.label = label;
        this.sort = sort;
        this.required = required;
        this.type = type;
        this.options = options;
        this.rules = rules;
        this.autocomplete = autocomplete;
    }

    /**
     * Getter for Name.
     * The name of the Facet. To be used as a key when ordering a Campaign, under the
     * `orderedProductsSpecs.postingRequirements` key.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the Facet. To be used as a key when ordering a Campaign, under the
     * `orderedProductsSpecs.postingRequirements` key.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Label.
     * The user facing label
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * The user facing label
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for Sort.
     * The order in the list of vacancy fields to be displayed to the user when posting. Facets with
     * lower `sort` values should be displayed first.
     * @return Returns the String
     */
    @JsonGetter("sort")
    public String getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * The order in the list of vacancy fields to be displayed to the user when posting. Facets with
     * lower `sort` values should be displayed first.
     * @param sort Value for String
     */
    @JsonSetter("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Getter for Required.
     * Whether the Facet is required when ordering a Campaign.
     * @return Returns the boolean
     */
    @JsonGetter("required")
    public boolean getRequired() {
        return required;
    }

    /**
     * Setter for Required.
     * Whether the Facet is required when ordering a Campaign.
     * @param required Value for boolean
     */
    @JsonSetter("required")
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * Getter for Type.
     * The type of UI and data structure to be used to input and store values for this Facet.
     * @return Returns the TypeEnum
     */
    @JsonGetter("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of UI and data structure to be used to input and store values for this Facet.
     * @param type Value for TypeEnum
     */
    @JsonSetter("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Options.
     * list of choices for this Facet's value.
     * @return Returns the List of FacetOptionModel
     */
    @JsonGetter("options")
    public List<FacetOptionModel> getOptions() {
        return options;
    }

    /**
     * Setter for Options.
     * list of choices for this Facet's value.
     * @param options Value for List of FacetOptionModel
     */
    @JsonSetter("options")
    public void setOptions(List<FacetOptionModel> options) {
        this.options = options;
    }

    /**
     * Getter for Rules.
     * special validation rules that apply for this Facet's value
     * @return Returns the List of FacetRuleModel
     */
    @JsonGetter("rules")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FacetRuleModel> getRules() {
        return rules;
    }

    /**
     * Setter for Rules.
     * special validation rules that apply for this Facet's value
     * @param rules Value for List of FacetRuleModel
     */
    @JsonSetter("rules")
    public void setRules(List<FacetRuleModel> rules) {
        this.rules = rules;
    }

    /**
     * Getter for Autocomplete.
     * Used for Facets whose value choices need to be fetched through an additional call to the
     * [List autocomplete values for posting
     * requirements](https://vonq.stoplight.io/docs/hapi/b3A6MzM2MDEzODk-list-autocomplete-values-for-posting-requirement)
     * endpoint.
     * @return Returns the AutocompleteModel
     */
    @JsonGetter("autocomplete")
    public AutocompleteModel getAutocomplete() {
        return autocomplete;
    }

    /**
     * Setter for Autocomplete.
     * Used for Facets whose value choices need to be fetched through an additional call to the
     * [List autocomplete values for posting
     * requirements](https://vonq.stoplight.io/docs/hapi/b3A6MzM2MDEzODk-list-autocomplete-values-for-posting-requirement)
     * endpoint.
     * @param autocomplete Value for AutocompleteModel
     */
    @JsonSetter("autocomplete")
    public void setAutocomplete(AutocompleteModel autocomplete) {
        this.autocomplete = autocomplete;
    }

    /**
     * Converts this FacetModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FacetModel [" + "name=" + name + ", label=" + label + ", sort=" + sort
                + ", required=" + required + ", type=" + type + ", options=" + options
                + ", autocomplete=" + autocomplete + ", rules=" + rules + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FacetModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FacetModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, label, sort, required, type, options, autocomplete)
                .rules(getRules());
        return builder;
    }

    /**
     * Class to build instances of {@link FacetModel}.
     */
    public static class Builder {
        private String name;
        private String label;
        private String sort;
        private boolean required;
        private TypeEnum type;
        private List<FacetOptionModel> options;
        private AutocompleteModel autocomplete;
        private List<FacetRuleModel> rules;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  label  String value for label.
         * @param  sort  String value for sort.
         * @param  required  boolean value for required.
         * @param  type  TypeEnum value for type.
         * @param  options  List of FacetOptionModel value for options.
         * @param  autocomplete  AutocompleteModel value for autocomplete.
         */
        public Builder(String name, String label, String sort, boolean required, TypeEnum type,
                List<FacetOptionModel> options, AutocompleteModel autocomplete) {
            this.name = name;
            this.label = label;
            this.sort = sort;
            this.required = required;
            this.type = type;
            this.options = options;
            this.autocomplete = autocomplete;
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
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Setter for sort.
         * @param  sort  String value for sort.
         * @return Builder
         */
        public Builder sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Setter for required.
         * @param  required  boolean value for required.
         * @return Builder
         */
        public Builder required(boolean required) {
            this.required = required;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  TypeEnum value for type.
         * @return Builder
         */
        public Builder type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for options.
         * @param  options  List of FacetOptionModel value for options.
         * @return Builder
         */
        public Builder options(List<FacetOptionModel> options) {
            this.options = options;
            return this;
        }

        /**
         * Setter for autocomplete.
         * @param  autocomplete  AutocompleteModel value for autocomplete.
         * @return Builder
         */
        public Builder autocomplete(AutocompleteModel autocomplete) {
            this.autocomplete = autocomplete;
            return this;
        }

        /**
         * Setter for rules.
         * @param  rules  List of FacetRuleModel value for rules.
         * @return Builder
         */
        public Builder rules(List<FacetRuleModel> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Builds a new {@link FacetModel} object using the set fields.
         * @return {@link FacetModel}
         */
        public FacetModel build() {
            return new FacetModel(name, label, sort, required, type, options, autocomplete, rules);
        }
    }
}
