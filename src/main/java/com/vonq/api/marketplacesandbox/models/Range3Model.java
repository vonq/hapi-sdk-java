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
 * This is a model class for Range3Model type.
 */
public class Range3Model
        extends BaseModel {
    private Double from;
    private double to;
    private String currency;

    /**
     * Default constructor.
     */
    public Range3Model() {
    }

    /**
     * Initialization constructor.
     * @param  to  double value for to.
     * @param  from  Double value for from.
     * @param  currency  String value for currency.
     */
    public Range3Model(
            double to,
            Double from,
            String currency) {
        this.from = from;
        this.to = to;
        this.currency = currency;
    }

    /**
     * Getter for From.
     * Minimum salary indication of the indicated period, if given, cannot be greater than 'to', but
     * equal to 'to' is allowed. This integer value should be specified in units (not cents).
     * @return Returns the Double
     */
    @JsonGetter("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * Minimum salary indication of the indicated period, if given, cannot be greater than 'to', but
     * equal to 'to' is allowed. This integer value should be specified in units (not cents).
     * @param from Value for Double
     */
    @JsonSetter("from")
    public void setFrom(Double from) {
        this.from = from;
    }

    /**
     * Getter for To.
     * Maximum salary indication of the indicated period. This integer value should be specified in
     * units (not cents).
     * @return Returns the double
     */
    @JsonGetter("to")
    public double getTo() {
        return to;
    }

    /**
     * Setter for To.
     * Maximum salary indication of the indicated period. This integer value should be specified in
     * units (not cents).
     * @param to Value for double
     */
    @JsonSetter("to")
    public void setTo(double to) {
        this.to = to;
    }

    /**
     * Getter for Currency.
     * The currency in which the range amount is expressed. Must be a valid ISO-4217 value.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * The currency in which the range amount is expressed. Must be a valid ISO-4217 value.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Converts this Range3Model into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Range3Model [" + "to=" + to + ", from=" + from + ", currency=" + currency
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Range3Model.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Range3Model.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(to)
                .from(getFrom())
                .currency(getCurrency());
        return builder;
    }

    /**
     * Class to build instances of {@link Range3Model}.
     */
    public static class Builder {
        private double to;
        private Double from;
        private String currency;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  to  double value for to.
         */
        public Builder(double to) {
            this.to = to;
        }

        /**
         * Setter for to.
         * @param  to  double value for to.
         * @return Builder
         */
        public Builder to(double to) {
            this.to = to;
            return this;
        }

        /**
         * Setter for from.
         * @param  from  Double value for from.
         * @return Builder
         */
        public Builder from(Double from) {
            this.from = from;
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
         * Builds a new {@link Range3Model} object using the set fields.
         * @return {@link Range3Model}
         */
        public Range3Model build() {
            return new Range3Model(to, from, currency);
        }
    }
}
