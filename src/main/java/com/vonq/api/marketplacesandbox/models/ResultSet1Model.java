/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ResultSet1Model type.
 */
public class ResultSet1Model
        extends BaseModel {
    private Double total;
    private Double limit;
    private Double offset;
    private List<CampaignModel> data;

    /**
     * Default constructor.
     */
    public ResultSet1Model() {
    }

    /**
     * Initialization constructor.
     * @param  total  Double value for total.
     * @param  limit  Double value for limit.
     * @param  offset  Double value for offset.
     * @param  data  List of CampaignModel value for data.
     */
    public ResultSet1Model(
            Double total,
            Double limit,
            Double offset,
            List<CampaignModel> data) {
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.data = data;
    }

    /**
     * Getter for Total.
     * Number of total results
     * @return Returns the Double
     */
    @JsonGetter("total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * Number of total results
     * @param total Value for Double
     */
    @JsonSetter("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Getter for Limit.
     * Results page size
     * @return Returns the Double
     */
    @JsonGetter("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * Results page size
     * @param limit Value for Double
     */
    @JsonSetter("limit")
    public void setLimit(Double limit) {
        this.limit = limit;
    }

    /**
     * Getter for Offset.
     * Initial starting index for the results
     * @return Returns the Double
     */
    @JsonGetter("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOffset() {
        return offset;
    }

    /**
     * Setter for Offset.
     * Initial starting index for the results
     * @param offset Value for Double
     */
    @JsonSetter("offset")
    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * Getter for Data.
     * A Page of Campaign Objects
     * @return Returns the List of CampaignModel
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CampaignModel> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * A Page of Campaign Objects
     * @param data Value for List of CampaignModel
     */
    @JsonSetter("data")
    public void setData(List<CampaignModel> data) {
        this.data = data;
    }

    /**
     * Converts this ResultSet1Model into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResultSet1Model [" + "total=" + total + ", limit=" + limit + ", offset=" + offset
                + ", data=" + data + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ResultSet1Model.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResultSet1Model.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .total(getTotal())
                .limit(getLimit())
                .offset(getOffset())
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link ResultSet1Model}.
     */
    public static class Builder {
        private Double total;
        private Double limit;
        private Double offset;
        private List<CampaignModel> data;



        /**
         * Setter for total.
         * @param  total  Double value for total.
         * @return Builder
         */
        public Builder total(Double total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  Double value for limit.
         * @return Builder
         */
        public Builder limit(Double limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for offset.
         * @param  offset  Double value for offset.
         * @return Builder
         */
        public Builder offset(Double offset) {
            this.offset = offset;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  List of CampaignModel value for data.
         * @return Builder
         */
        public Builder data(List<CampaignModel> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ResultSet1Model} object using the set fields.
         * @return {@link ResultSet1Model}
         */
        public ResultSet1Model build() {
            return new ResultSet1Model(total, limit, offset, data);
        }
    }
}
