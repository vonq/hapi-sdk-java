/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ContractProductModel type.
 */
public class ContractProductModel
        extends BaseModel {
    private String productId;
    private String title;

    /**
     * Default constructor.
     */
    public ContractProductModel() {
    }

    /**
     * Initialization constructor.
     * @param  productId  String value for productId.
     * @param  title  String value for title.
     */
    public ContractProductModel(
            String productId,
            String title) {
        this.productId = productId;
        this.title = title;
    }

    /**
     * Getter for ProductId.
     * @return Returns the String
     */
    @JsonGetter("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for String
     */
    @JsonSetter("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Converts this ContractProductModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ContractProductModel [" + "productId=" + productId + ", title=" + title
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ContractProductModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ContractProductModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productId, title);
        return builder;
    }

    /**
     * Class to build instances of {@link ContractProductModel}.
     */
    public static class Builder {
        private String productId;
        private String title;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productId  String value for productId.
         * @param  title  String value for title.
         */
        public Builder(String productId, String title) {
            this.productId = productId;
            this.title = title;
        }

        /**
         * Setter for productId.
         * @param  productId  String value for productId.
         * @return Builder
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Builds a new {@link ContractProductModel} object using the set fields.
         * @return {@link ContractProductModel}
         */
        public ContractProductModel build() {
            return new ContractProductModel(productId, title);
        }
    }
}
