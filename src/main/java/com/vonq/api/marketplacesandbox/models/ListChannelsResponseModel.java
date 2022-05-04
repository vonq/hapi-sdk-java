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
 * This is a model class for ListChannelsResponseModel type.
 */
public class ListChannelsResponseModel
        extends BaseModel {
    private int count;
    private String next;
    private String previous;
    private List<ChannelLiteModel> results;

    /**
     * Default constructor.
     */
    public ListChannelsResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  count  int value for count.
     * @param  next  String value for next.
     * @param  previous  String value for previous.
     * @param  results  List of ChannelLiteModel value for results.
     */
    public ListChannelsResponseModel(
            int count,
            String next,
            String previous,
            List<ChannelLiteModel> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    /**
     * Getter for Count.
     * @return Returns the int
     */
    @JsonGetter("count")
    public int getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * @param count Value for int
     */
    @JsonSetter("count")
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Getter for Next.
     * @return Returns the String
     */
    @JsonGetter("next")
    public String getNext() {
        return next;
    }

    /**
     * Setter for Next.
     * @param next Value for String
     */
    @JsonSetter("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Getter for Previous.
     * @return Returns the String
     */
    @JsonGetter("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * Setter for Previous.
     * @param previous Value for String
     */
    @JsonSetter("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * Getter for Results.
     * @return Returns the List of ChannelLiteModel
     */
    @JsonGetter("results")
    public List<ChannelLiteModel> getResults() {
        return results;
    }

    /**
     * Setter for Results.
     * @param results Value for List of ChannelLiteModel
     */
    @JsonSetter("results")
    public void setResults(List<ChannelLiteModel> results) {
        this.results = results;
    }

    /**
     * Converts this ListChannelsResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListChannelsResponseModel [" + "count=" + count + ", next=" + next + ", previous="
                + previous + ", results=" + results + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListChannelsResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListChannelsResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(count, next, previous, results);
        return builder;
    }

    /**
     * Class to build instances of {@link ListChannelsResponseModel}.
     */
    public static class Builder {
        private int count;
        private String next;
        private String previous;
        private List<ChannelLiteModel> results;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  count  int value for count.
         * @param  next  String value for next.
         * @param  previous  String value for previous.
         * @param  results  List of ChannelLiteModel value for results.
         */
        public Builder(int count, String next, String previous, List<ChannelLiteModel> results) {
            this.count = count;
            this.next = next;
            this.previous = previous;
            this.results = results;
        }

        /**
         * Setter for count.
         * @param  count  int value for count.
         * @return Builder
         */
        public Builder count(int count) {
            this.count = count;
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
         * Setter for previous.
         * @param  previous  String value for previous.
         * @return Builder
         */
        public Builder previous(String previous) {
            this.previous = previous;
            return this;
        }

        /**
         * Setter for results.
         * @param  results  List of ChannelLiteModel value for results.
         * @return Builder
         */
        public Builder results(List<ChannelLiteModel> results) {
            this.results = results;
            return this;
        }

        /**
         * Builds a new {@link ListChannelsResponseModel} object using the set fields.
         * @return {@link ListChannelsResponseModel}
         */
        public ListChannelsResponseModel build() {
            return new ListChannelsResponseModel(count, next, previous, results);
        }
    }
}
