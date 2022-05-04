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
 * This is a model class for Range4Model type.
 */
public class Range4Model
        extends BaseModel {
    private List<String> to;

    /**
     * Default constructor.
     */
    public Range4Model() {
    }

    /**
     * Initialization constructor.
     * @param  to  List of String value for to.
     */
    public Range4Model(
            List<String> to) {
        this.to = to;
    }

    /**
     * Getter for To.
     * @return Returns the List of String
     */
    @JsonGetter("to")
    public List<String> getTo() {
        return to;
    }

    /**
     * Setter for To.
     * @param to Value for List of String
     */
    @JsonSetter("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    /**
     * Converts this Range4Model into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Range4Model [" + "to=" + to + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link Range4Model.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Range4Model.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(to);
        return builder;
    }

    /**
     * Class to build instances of {@link Range4Model}.
     */
    public static class Builder {
        private List<String> to;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  to  List of String value for to.
         */
        public Builder(List<String> to) {
            this.to = to;
        }

        /**
         * Setter for to.
         * @param  to  List of String value for to.
         * @return Builder
         */
        public Builder to(List<String> to) {
            this.to = to;
            return this;
        }

        /**
         * Builds a new {@link Range4Model} object using the set fields.
         * @return {@link Range4Model}
         */
        public Range4Model build() {
            return new Range4Model(to);
        }
    }
}
