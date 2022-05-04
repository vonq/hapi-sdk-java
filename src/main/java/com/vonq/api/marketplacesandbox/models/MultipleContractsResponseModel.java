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
 * This is a model class for MultipleContractsResponseModel type.
 */
public class MultipleContractsResponseModel
        extends BaseModel {
    private Double count;
    private String previous;
    private String next;
    private List<ContractModel> results;

    /**
     * Default constructor.
     */
    public MultipleContractsResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  count  Double value for count.
     * @param  previous  String value for previous.
     * @param  next  String value for next.
     * @param  results  List of ContractModel value for results.
     */
    public MultipleContractsResponseModel(
            Double count,
            String previous,
            String next,
            List<ContractModel> results) {
        this.count = count;
        this.previous = previous;
        this.next = next;
        this.results = results;
    }

    /**
     * Getter for Count.
     * count of elements in results
     * @return Returns the Double
     */
    @JsonGetter("count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * count of elements in results
     * @param count Value for Double
     */
    @JsonSetter("count")
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * Getter for Previous.
     * link to get previous results
     * @return Returns the String
     */
    @JsonGetter("previous")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrevious() {
        return previous;
    }

    /**
     * Setter for Previous.
     * link to get previous results
     * @param previous Value for String
     */
    @JsonSetter("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * Getter for Next.
     * link to get next results
     * @return Returns the String
     */
    @JsonGetter("next")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNext() {
        return next;
    }

    /**
     * Setter for Next.
     * link to get next results
     * @param next Value for String
     */
    @JsonSetter("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Getter for Results.
     * @return Returns the List of ContractModel
     */
    @JsonGetter("results")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ContractModel> getResults() {
        return results;
    }

    /**
     * Setter for Results.
     * @param results Value for List of ContractModel
     */
    @JsonSetter("results")
    public void setResults(List<ContractModel> results) {
        this.results = results;
    }

    /**
     * Converts this MultipleContractsResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultipleContractsResponseModel [" + "count=" + count + ", previous=" + previous
                + ", next=" + next + ", results=" + results + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link MultipleContractsResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultipleContractsResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .count(getCount())
                .previous(getPrevious())
                .next(getNext())
                .results(getResults());
        return builder;
    }

    /**
     * Class to build instances of {@link MultipleContractsResponseModel}.
     */
    public static class Builder {
        private Double count;
        private String previous;
        private String next;
        private List<ContractModel> results;



        /**
         * Setter for count.
         * @param  count  Double value for count.
         * @return Builder
         */
        public Builder count(Double count) {
            this.count = count;
            return this;
        }

        /**
         * Setter for previous.
         * @param  previous  String value for previous.
         * @return Builder
         */
        public Builder previous(String previous) {
            this.previous = previous;
            return this;
        }

        /**
         * Setter for next.
         * @param  next  String value for next.
         * @return Builder
         */
        public Builder next(String next) {
            this.next = next;
            return this;
        }

        /**
         * Setter for results.
         * @param  results  List of ContractModel value for results.
         * @return Builder
         */
        public Builder results(List<ContractModel> results) {
            this.results = results;
            return this;
        }

        /**
         * Builds a new {@link MultipleContractsResponseModel} object using the set fields.
         * @return {@link MultipleContractsResponseModel}
         */
        public MultipleContractsResponseModel build() {
            return new MultipleContractsResponseModel(count, previous, next, results);
        }
    }
}
