/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ContractCredentialModel type.
 */
public class ContractCredentialModel
        extends BaseModel {
    private String name;
    private String label;
    private String sort;
    private String description;

    /**
     * Default constructor.
     */
    public ContractCredentialModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  label  String value for label.
     * @param  sort  String value for sort.
     * @param  description  String value for description.
     */
    public ContractCredentialModel(
            String name,
            String label,
            String sort,
            String description) {
        this.name = name;
        this.label = label;
        this.sort = sort;
        this.description = description;
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
     * Getter for Label.
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for Sort.
     * @return Returns the String
     */
    @JsonGetter("sort")
    public String getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * @param sort Value for String
     */
    @JsonSetter("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this ContractCredentialModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ContractCredentialModel [" + "name=" + name + ", label=" + label + ", sort=" + sort
                + ", description=" + description + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ContractCredentialModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ContractCredentialModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, label, sort, description);
        return builder;
    }

    /**
     * Class to build instances of {@link ContractCredentialModel}.
     */
    public static class Builder {
        private String name;
        private String label;
        private String sort;
        private String description;

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
         * @param  description  String value for description.
         */
        public Builder(String name, String label, String sort, String description) {
            this.name = name;
            this.label = label;
            this.sort = sort;
            this.description = description;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ContractCredentialModel} object using the set fields.
         * @return {@link ContractCredentialModel}
         */
        public ContractCredentialModel build() {
            return new ContractCredentialModel(name, label, sort, description);
        }
    }
}
