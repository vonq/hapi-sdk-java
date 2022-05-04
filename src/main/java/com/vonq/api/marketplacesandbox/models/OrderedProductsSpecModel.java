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
 * This is a model class for OrderedProductsSpecModel type.
 */
public class OrderedProductsSpecModel
        extends BaseModel {
    private List<String> productId;
    private List<String> utm;

    /**
     * Default constructor.
     */
    public OrderedProductsSpecModel() {
    }

    /**
     * Initialization constructor.
     * @param  productId  List of String value for productId.
     * @param  utm  List of String value for utm.
     */
    public OrderedProductsSpecModel(
            List<String> productId,
            List<String> utm) {
        this.productId = productId;
        this.utm = utm;
    }

    /**
     * Getter for ProductId.
     * @return Returns the List of String
     */
    @JsonGetter("productId")
    public List<String> getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for List of String
     */
    @JsonSetter("productId")
    public void setProductId(List<String> productId) {
        this.productId = productId;
    }

    /**
     * Getter for Utm.
     * @return Returns the List of String
     */
    @JsonGetter("utm")
    public List<String> getUtm() {
        return utm;
    }

    /**
     * Setter for Utm.
     * @param utm Value for List of String
     */
    @JsonSetter("utm")
    public void setUtm(List<String> utm) {
        this.utm = utm;
    }

    /**
     * Converts this OrderedProductsSpecModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedProductsSpecModel [" + "productId=" + productId + ", utm=" + utm
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrderedProductsSpecModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedProductsSpecModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productId, utm);
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedProductsSpecModel}.
     */
    public static class Builder {
        private List<String> productId;
        private List<String> utm;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productId  List of String value for productId.
         * @param  utm  List of String value for utm.
         */
        public Builder(List<String> productId, List<String> utm) {
            this.productId = productId;
            this.utm = utm;
        }

        /**
         * Setter for productId.
         * @param  productId  List of String value for productId.
         * @return Builder
         */
        public Builder productId(List<String> productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for utm.
         * @param  utm  List of String value for utm.
         * @return Builder
         */
        public Builder utm(List<String> utm) {
            this.utm = utm;
            return this;
        }

        /**
         * Builds a new {@link OrderedProductsSpecModel} object using the set fields.
         * @return {@link OrderedProductsSpecModel}
         */
        public OrderedProductsSpecModel build() {
            return new OrderedProductsSpecModel(productId, utm);
        }
    }
}
