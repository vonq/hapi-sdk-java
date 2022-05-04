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
 * This is a model class for ContractPurchasePriceModel type.
 */
public class ContractPurchasePriceModel
        extends BaseModel {
    private Double amount;
    private String currency;

    /**
     * Default constructor.
     */
    public ContractPurchasePriceModel() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  currency  String value for currency.
     */
    public ContractPurchasePriceModel(
            Double amount,
            String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Getter for Amount.
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Converts this ContractPurchasePriceModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ContractPurchasePriceModel [" + "amount=" + amount + ", currency=" + currency
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ContractPurchasePriceModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ContractPurchasePriceModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency());
        return builder;
    }

    /**
     * Class to build instances of {@link ContractPurchasePriceModel}.
     */
    public static class Builder {
        private Double amount;
        private String currency;



        /**
         * Setter for amount.
         * @param  amount  Double value for amount.
         * @return Builder
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Builds a new {@link ContractPurchasePriceModel} object using the set fields.
         * @return {@link ContractPurchasePriceModel}
         */
        public ContractPurchasePriceModel build() {
            return new ContractPurchasePriceModel(amount, currency);
        }
    }
}
