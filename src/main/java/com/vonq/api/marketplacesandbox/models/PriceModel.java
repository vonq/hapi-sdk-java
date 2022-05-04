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
 * This is a model class for PriceModel type.
 */
public class PriceModel
        extends BaseModel {
    private Double amount;
    private CurrencyEnum currency;

    /**
     * Default constructor.
     */
    public PriceModel() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Double value for amount.
     * @param  currency  CurrencyEnum value for currency.
     */
    public PriceModel(
            Double amount,
            CurrencyEnum currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Getter for Amount.
     * Price amount in specified currency and 2 decimal places
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Price amount in specified currency and 2 decimal places
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO 4217 code for the Currency.
     * @return Returns the CurrencyEnum
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyEnum getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO 4217 code for the Currency.
     * @param currency Value for CurrencyEnum
     */
    @JsonSetter("currency")
    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    /**
     * Converts this PriceModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PriceModel [" + "amount=" + amount + ", currency=" + currency
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PriceModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PriceModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency());
        return builder;
    }

    /**
     * Class to build instances of {@link PriceModel}.
     */
    public static class Builder {
        private Double amount;
        private CurrencyEnum currency;



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
         * @param  currency  CurrencyEnum value for currency.
         * @return Builder
         */
        public Builder currency(CurrencyEnum currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Builds a new {@link PriceModel} object using the set fields.
         * @return {@link PriceModel}
         */
        public PriceModel build() {
            return new PriceModel(amount, currency);
        }
    }
}
