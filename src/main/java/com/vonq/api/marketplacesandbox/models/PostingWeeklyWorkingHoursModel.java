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
 * This is a model class for PostingWeeklyWorkingHoursModel type.
 */
public class PostingWeeklyWorkingHoursModel
        extends BaseModel {
    private Double from;
    private double to;

    /**
     * Default constructor.
     */
    public PostingWeeklyWorkingHoursModel() {
    }

    /**
     * Initialization constructor.
     * @param  to  double value for to.
     * @param  from  Double value for from.
     */
    public PostingWeeklyWorkingHoursModel(
            double to,
            Double from) {
        this.from = from;
        this.to = to;
    }

    /**
     * Getter for From.
     * @return Returns the Double
     */
    @JsonGetter("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for Double
     */
    @JsonSetter("from")
    public void setFrom(Double from) {
        this.from = from;
    }

    /**
     * Getter for To.
     * This value needs to be an positive integer
     * @return Returns the double
     */
    @JsonGetter("to")
    public double getTo() {
        return to;
    }

    /**
     * Setter for To.
     * This value needs to be an positive integer
     * @param to Value for double
     */
    @JsonSetter("to")
    public void setTo(double to) {
        this.to = to;
    }

    /**
     * Converts this PostingWeeklyWorkingHoursModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingWeeklyWorkingHoursModel [" + "to=" + to + ", from=" + from
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingWeeklyWorkingHoursModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingWeeklyWorkingHoursModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(to)
                .from(getFrom());
        return builder;
    }

    /**
     * Class to build instances of {@link PostingWeeklyWorkingHoursModel}.
     */
    public static class Builder {
        private double to;
        private Double from;

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
         * Builds a new {@link PostingWeeklyWorkingHoursModel} object using the set fields.
         * @return {@link PostingWeeklyWorkingHoursModel}
         */
        public PostingWeeklyWorkingHoursModel build() {
            return new PostingWeeklyWorkingHoursModel(to, from);
        }
    }
}
