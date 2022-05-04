/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PostingSalaryIndicationModel type.
 */
public class PostingSalaryIndicationModel
        extends BaseModel {
    private PeriodEnum period;
    private Range3Model range;

    /**
     * Default constructor.
     */
    public PostingSalaryIndicationModel() {
    }

    /**
     * Initialization constructor.
     * @param  period  PeriodEnum value for period.
     * @param  range  Range3Model value for range.
     */
    public PostingSalaryIndicationModel(
            PeriodEnum period,
            Range3Model range) {
        this.period = period;
        this.range = range;
    }

    /**
     * Getter for Period.
     * @return Returns the PeriodEnum
     */
    @JsonGetter("period")
    public PeriodEnum getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * @param period Value for PeriodEnum
     */
    @JsonSetter("period")
    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    /**
     * Getter for Range.
     * @return Returns the Range3Model
     */
    @JsonGetter("range")
    public Range3Model getRange() {
        return range;
    }

    /**
     * Setter for Range.
     * @param range Value for Range3Model
     */
    @JsonSetter("range")
    public void setRange(Range3Model range) {
        this.range = range;
    }

    /**
     * Converts this PostingSalaryIndicationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingSalaryIndicationModel [" + "period=" + period + ", range=" + range
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingSalaryIndicationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingSalaryIndicationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(period, range);
        return builder;
    }

    /**
     * Class to build instances of {@link PostingSalaryIndicationModel}.
     */
    public static class Builder {
        private PeriodEnum period;
        private Range3Model range;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  period  PeriodEnum value for period.
         * @param  range  Range3Model value for range.
         */
        public Builder(PeriodEnum period, Range3Model range) {
            this.period = period;
            this.range = range;
        }

        /**
         * Setter for period.
         * @param  period  PeriodEnum value for period.
         * @return Builder
         */
        public Builder period(PeriodEnum period) {
            this.period = period;
            return this;
        }

        /**
         * Setter for range.
         * @param  range  Range3Model value for range.
         * @return Builder
         */
        public Builder range(Range3Model range) {
            this.range = range;
            return this;
        }

        /**
         * Builds a new {@link PostingSalaryIndicationModel} object using the set fields.
         * @return {@link PostingSalaryIndicationModel}
         */
        public PostingSalaryIndicationModel build() {
            return new PostingSalaryIndicationModel(period, range);
        }
    }
}
