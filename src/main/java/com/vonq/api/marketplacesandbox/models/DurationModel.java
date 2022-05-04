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
 * This is a model class for DurationModel type.
 */
public class DurationModel
        extends BaseModel {
    private RangeEnum range;
    private Double period;

    /**
     * Default constructor.
     */
    public DurationModel() {
    }

    /**
     * Initialization constructor.
     * @param  range  RangeEnum value for range.
     * @param  period  Double value for period.
     */
    public DurationModel(
            RangeEnum range,
            Double period) {
        this.range = range;
        this.period = period;
    }

    /**
     * Getter for Range.
     * The range of the duration
     * @return Returns the RangeEnum
     */
    @JsonGetter("range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RangeEnum getRange() {
        return range;
    }

    /**
     * Setter for Range.
     * The range of the duration
     * @param range Value for RangeEnum
     */
    @JsonSetter("range")
    public void setRange(RangeEnum range) {
        this.range = range;
    }

    /**
     * Getter for Period.
     * The duration a vacancy is actively listed on a channel
     * @return Returns the Double
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * The duration a vacancy is actively listed on a channel
     * @param period Value for Double
     */
    @JsonSetter("period")
    public void setPeriod(Double period) {
        this.period = period;
    }

    /**
     * Converts this DurationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DurationModel [" + "range=" + range + ", period=" + period
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link DurationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DurationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .range(getRange())
                .period(getPeriod());
        return builder;
    }

    /**
     * Class to build instances of {@link DurationModel}.
     */
    public static class Builder {
        private RangeEnum range;
        private Double period;



        /**
         * Setter for range.
         * @param  range  RangeEnum value for range.
         * @return Builder
         */
        public Builder range(RangeEnum range) {
            this.range = range;
            return this;
        }

        /**
         * Setter for period.
         * @param  period  Double value for period.
         * @return Builder
         */
        public Builder period(Double period) {
            this.period = period;
            return this;
        }

        /**
         * Builds a new {@link DurationModel} object using the set fields.
         * @return {@link DurationModel}
         */
        public DurationModel build() {
            return new DurationModel(range, period);
        }
    }
}
