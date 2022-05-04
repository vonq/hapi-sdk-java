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
 * This is a model class for PurchasePriceModel type.
 */
public class PurchasePriceModel
        extends BaseModel {
    private String currency;
    private Integer amount;

    /**
     * Default constructor.
     */
    public PurchasePriceModel() {
    }

    /**
     * Initialization constructor.
     * @param  currency  String value for currency.
     * @param  amount  Integer value for amount.
     */
    public PurchasePriceModel(
            String currency,
            Integer amount) {
        this.currency = currency;
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
     * Getter for Amount.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Converts this PurchasePriceModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PurchasePriceModel [" + "currency=" + currency + ", amount=" + amount
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PurchasePriceModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PurchasePriceModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currency(getCurrency())
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link PurchasePriceModel}.
     */
    public static class Builder {
        private String currency;
        private Integer amount;



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
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link PurchasePriceModel} object using the set fields.
         * @return {@link PurchasePriceModel}
         */
        public PurchasePriceModel build() {
            return new PurchasePriceModel(currency, amount);
        }
    }
}
