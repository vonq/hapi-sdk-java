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
 * This is a model class for TimeToProcessModel type.
 */
public class TimeToProcessModel
        extends BaseModel {
    private Range1Enum range;
    private Double period;

    /**
     * Default constructor.
     */
    public TimeToProcessModel() {
    }

    /**
     * Initialization constructor.
     * @param  range  Range1Enum value for range.
     * @param  period  Double value for period.
     */
    public TimeToProcessModel(
            Range1Enum range,
            Double period) {
        this.range = range;
        this.period = period;
    }

    /**
     * Getter for Range.
     * The range of the time to process
     * @return Returns the Range1Enum
     */
    @JsonGetter("range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Range1Enum getRange() {
        return range;
    }

    /**
     * Setter for Range.
     * The range of the time to process
     * @param range Value for Range1Enum
     */
    @JsonSetter("range")
    public void setRange(Range1Enum range) {
        this.range = range;
    }

    /**
     * Getter for Period.
     * The period of the time to process
     * @return Returns the Double
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * The period of the time to process
     * @param period Value for Double
     */
    @JsonSetter("period")
    public void setPeriod(Double period) {
        this.period = period;
    }

    /**
     * Converts this TimeToProcessModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TimeToProcessModel [" + "range=" + range + ", period=" + period
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TimeToProcessModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TimeToProcessModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .range(getRange())
                .period(getPeriod());
        return builder;
    }

    /**
     * Class to build instances of {@link TimeToProcessModel}.
     */
    public static class Builder {
        private Range1Enum range;
        private Double period;



        /**
         * Setter for range.
         * @param  range  Range1Enum value for range.
         * @return Builder
         */
        public Builder range(Range1Enum range) {
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
         * Builds a new {@link TimeToProcessModel} object using the set fields.
         * @return {@link TimeToProcessModel}
         */
        public TimeToProcessModel build() {
            return new TimeToProcessModel(range, period);
        }
    }
}
