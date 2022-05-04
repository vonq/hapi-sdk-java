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
 * This is a model class for ProductsDeliveryTimeModel type.
 */
public class ProductsDeliveryTimeModel
        extends BaseModel {
    private Double daysToProcess;
    private Double daysToSetup;
    private Double totalDays;

    /**
     * Default constructor.
     */
    public ProductsDeliveryTimeModel() {
    }

    /**
     * Initialization constructor.
     * @param  daysToProcess  Double value for daysToProcess.
     * @param  daysToSetup  Double value for daysToSetup.
     * @param  totalDays  Double value for totalDays.
     */
    public ProductsDeliveryTimeModel(
            Double daysToProcess,
            Double daysToSetup,
            Double totalDays) {
        this.daysToProcess = daysToProcess;
        this.daysToSetup = daysToSetup;
        this.totalDays = totalDays;
    }

    /**
     * Getter for DaysToProcess.
     * @return Returns the Double
     */
    @JsonGetter("days_to_process")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDaysToProcess() {
        return daysToProcess;
    }

    /**
     * Setter for DaysToProcess.
     * @param daysToProcess Value for Double
     */
    @JsonSetter("days_to_process")
    public void setDaysToProcess(Double daysToProcess) {
        this.daysToProcess = daysToProcess;
    }

    /**
     * Getter for DaysToSetup.
     * @return Returns the Double
     */
    @JsonGetter("days_to_setup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDaysToSetup() {
        return daysToSetup;
    }

    /**
     * Setter for DaysToSetup.
     * @param daysToSetup Value for Double
     */
    @JsonSetter("days_to_setup")
    public void setDaysToSetup(Double daysToSetup) {
        this.daysToSetup = daysToSetup;
    }

    /**
     * Getter for TotalDays.
     * @return Returns the Double
     */
    @JsonGetter("total_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalDays() {
        return totalDays;
    }

    /**
     * Setter for TotalDays.
     * @param totalDays Value for Double
     */
    @JsonSetter("total_days")
    public void setTotalDays(Double totalDays) {
        this.totalDays = totalDays;
    }

    /**
     * Converts this ProductsDeliveryTimeModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductsDeliveryTimeModel [" + "daysToProcess=" + daysToProcess + ", daysToSetup="
                + daysToSetup + ", totalDays=" + totalDays + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ProductsDeliveryTimeModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductsDeliveryTimeModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .daysToProcess(getDaysToProcess())
                .daysToSetup(getDaysToSetup())
                .totalDays(getTotalDays());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductsDeliveryTimeModel}.
     */
    public static class Builder {
        private Double daysToProcess;
        private Double daysToSetup;
        private Double totalDays;



        /**
         * Setter for daysToProcess.
         * @param  daysToProcess  Double value for daysToProcess.
         * @return Builder
         */
        public Builder daysToProcess(Double daysToProcess) {
            this.daysToProcess = daysToProcess;
            return this;
        }

        /**
         * Setter for daysToSetup.
         * @param  daysToSetup  Double value for daysToSetup.
         * @return Builder
         */
        public Builder daysToSetup(Double daysToSetup) {
            this.daysToSetup = daysToSetup;
            return this;
        }

        /**
         * Setter for totalDays.
         * @param  totalDays  Double value for totalDays.
         * @return Builder
         */
        public Builder totalDays(Double totalDays) {
            this.totalDays = totalDays;
            return this;
        }

        /**
         * Builds a new {@link ProductsDeliveryTimeModel} object using the set fields.
         * @return {@link ProductsDeliveryTimeModel}
         */
        public ProductsDeliveryTimeModel build() {
            return new ProductsDeliveryTimeModel(daysToProcess, daysToSetup, totalDays);
        }
    }
}
