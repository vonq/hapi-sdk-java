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
 * This is a model class for OrderedProductsStatusItemModel type.
 */
public class OrderedProductsStatusItemModel
        extends BaseModel {
    private String productId;
    private ChannelStatusEnum status;
    private String statusDescription;

    /**
     * Default constructor.
     */
    public OrderedProductsStatusItemModel() {
    }

    /**
     * Initialization constructor.
     * @param  productId  String value for productId.
     * @param  status  ChannelStatusEnum value for status.
     * @param  statusDescription  String value for statusDescription.
     */
    public OrderedProductsStatusItemModel(
            String productId,
            ChannelStatusEnum status,
            String statusDescription) {
        this.productId = productId;
        this.status = status;
        this.statusDescription = statusDescription;
    }

    /**
     * Getter for ProductId.
     * @return Returns the String
     */
    @JsonGetter("productId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for String
     */
    @JsonSetter("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Getter for Status.
     * Status of the product. One of the following
     * @return Returns the ChannelStatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChannelStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of the product. One of the following
     * @param status Value for ChannelStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(ChannelStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for StatusDescription.
     * Additional information about product status
     * @return Returns the String
     */
    @JsonGetter("statusDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Setter for StatusDescription.
     * Additional information about product status
     * @param statusDescription Value for String
     */
    @JsonSetter("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * Converts this OrderedProductsStatusItemModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedProductsStatusItemModel [" + "productId=" + productId + ", status=" + status
                + ", statusDescription=" + statusDescription + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrderedProductsStatusItemModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedProductsStatusItemModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productId(getProductId())
                .status(getStatus())
                .statusDescription(getStatusDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedProductsStatusItemModel}.
     */
    public static class Builder {
        private String productId;
        private ChannelStatusEnum status;
        private String statusDescription;



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
         * Setter for status.
         * @param  status  ChannelStatusEnum value for status.
         * @return Builder
         */
        public Builder status(ChannelStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDescription.
         * @param  statusDescription  String value for statusDescription.
         * @return Builder
         */
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }

        /**
         * Builds a new {@link OrderedProductsStatusItemModel} object using the set fields.
         * @return {@link OrderedProductsStatusItemModel}
         */
        public OrderedProductsStatusItemModel build() {
            return new OrderedProductsStatusItemModel(productId, status, statusDescription);
        }
    }
}
