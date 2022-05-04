/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SalaryIndicationModel type.
 */
public class SalaryIndicationModel
        extends BaseModel {
    private List<String> period;
    private Range4Model range;

    /**
     * Default constructor.
     */
    public SalaryIndicationModel() {
    }

    /**
     * Initialization constructor.
     * @param  period  List of String value for period.
     * @param  range  Range4Model value for range.
     */
    public SalaryIndicationModel(
            List<String> period,
            Range4Model range) {
        this.period = period;
        this.range = range;
    }

    /**
     * Getter for Period.
     * @return Returns the List of String
     */
    @JsonGetter("period")
    public List<String> getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * @param period Value for List of String
     */
    @JsonSetter("period")
    public void setPeriod(List<String> period) {
        this.period = period;
    }

    /**
     * Getter for Range.
     * @return Returns the Range4Model
     */
    @JsonGetter("range")
    public Range4Model getRange() {
        return range;
    }

    /**
     * Setter for Range.
     * @param range Value for Range4Model
     */
    @JsonSetter("range")
    public void setRange(Range4Model range) {
        this.range = range;
    }

    /**
     * Converts this SalaryIndicationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SalaryIndicationModel [" + "period=" + period + ", range=" + range
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SalaryIndicationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SalaryIndicationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(period, range);
        return builder;
    }

    /**
     * Class to build instances of {@link SalaryIndicationModel}.
     */
    public static class Builder {
        private List<String> period;
        private Range4Model range;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  period  List of String value for period.
         * @param  range  Range4Model value for range.
         */
        public Builder(List<String> period, Range4Model range) {
            this.period = period;
            this.range = range;
        }

        /**
         * Setter for period.
         * @param  period  List of String value for period.
         * @return Builder
         */
        public Builder period(List<String> period) {
            this.period = period;
            return this;
        }

        /**
         * Setter for range.
         * @param  range  Range4Model value for range.
         * @return Builder
         */
        public Builder range(Range4Model range) {
            this.range = range;
            return this;
        }

        /**
         * Builds a new {@link SalaryIndicationModel} object using the set fields.
         * @return {@link SalaryIndicationModel}
         */
        public SalaryIndicationModel build() {
            return new SalaryIndicationModel(period, range);
        }
    }
}
