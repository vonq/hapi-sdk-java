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
 * This is a model class for TimeToSetupModel type.
 */
public class TimeToSetupModel
        extends BaseModel {
    private Range2Enum range;
    private Double period;

    /**
     * Default constructor.
     */
    public TimeToSetupModel() {
    }

    /**
     * Initialization constructor.
     * @param  range  Range2Enum value for range.
     * @param  period  Double value for period.
     */
    public TimeToSetupModel(
            Range2Enum range,
            Double period) {
        this.range = range;
        this.period = period;
    }

    /**
     * Getter for Range.
     * The range of the time to setup required by the supplier
     * @return Returns the Range2Enum
     */
    @JsonGetter("range")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Range2Enum getRange() {
        return range;
    }

    /**
     * Setter for Range.
     * The range of the time to setup required by the supplier
     * @param range Value for Range2Enum
     */
    @JsonSetter("range")
    public void setRange(Range2Enum range) {
        this.range = range;
    }

    /**
     * Getter for Period.
     * The period of the time to setup required by the supplier
     * @return Returns the Double
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * The period of the time to setup required by the supplier
     * @param period Value for Double
     */
    @JsonSetter("period")
    public void setPeriod(Double period) {
        this.period = period;
    }

    /**
     * Converts this TimeToSetupModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TimeToSetupModel [" + "range=" + range + ", period=" + period
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TimeToSetupModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TimeToSetupModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .range(getRange())
                .period(getPeriod());
        return builder;
    }

    /**
     * Class to build instances of {@link TimeToSetupModel}.
     */
    public static class Builder {
        private Range2Enum range;
        private Double period;



        /**
         * Setter for range.
         * @param  range  Range2Enum value for range.
         * @return Builder
         */
        public Builder range(Range2Enum range) {
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
         * Builds a new {@link TimeToSetupModel} object using the set fields.
         * @return {@link TimeToSetupModel}
         */
        public TimeToSetupModel build() {
            return new TimeToSetupModel(range, period);
        }
    }
}
