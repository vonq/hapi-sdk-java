/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FacetRuleModel type.
 */
public class FacetRuleModel
        extends BaseModel {
    private RuleEnum rule;
    private String data;

    /**
     * Default constructor.
     */
    public FacetRuleModel() {
    }

    /**
     * Initialization constructor.
     * @param  rule  RuleEnum value for rule.
     * @param  data  String value for data.
     */
    public FacetRuleModel(
            RuleEnum rule,
            String data) {
        this.rule = rule;
        this.data = data;
    }

    /**
     * Getter for Rule.
     * @return Returns the RuleEnum
     */
    @JsonGetter("rule")
    public RuleEnum getRule() {
        return rule;
    }

    /**
     * Setter for Rule.
     * @param rule Value for RuleEnum
     */
    @JsonSetter("rule")
    public void setRule(RuleEnum rule) {
        this.rule = rule;
    }

    /**
     * Getter for Data.
     * the value used for the rule
     * @return Returns the String
     */
    @JsonGetter("data")
    public String getData() {
        return data;
    }

    /**
     * Setter for Data.
     * the value used for the rule
     * @param data Value for String
     */
    @JsonSetter("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Converts this FacetRuleModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FacetRuleModel [" + "rule=" + rule + ", data=" + data + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FacetRuleModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FacetRuleModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(rule, data);
        return builder;
    }

    /**
     * Class to build instances of {@link FacetRuleModel}.
     */
    public static class Builder {
        private RuleEnum rule;
        private String data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  rule  RuleEnum value for rule.
         * @param  data  String value for data.
         */
        public Builder(RuleEnum rule, String data) {
            this.rule = rule;
            this.data = data;
        }

        /**
         * Setter for rule.
         * @param  rule  RuleEnum value for rule.
         * @return Builder
         */
        public Builder rule(RuleEnum rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  String value for data.
         * @return Builder
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link FacetRuleModel} object using the set fields.
         * @return {@link FacetRuleModel}
         */
        public FacetRuleModel build() {
            return new FacetRuleModel(rule, data);
        }
    }
}
