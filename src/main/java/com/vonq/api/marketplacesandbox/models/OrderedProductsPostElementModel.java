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
 * This is a model class for OrderedProductsPostElementModel type.
 */
public class OrderedProductsPostElementModel
        extends BaseModel {
    private String productId;
    private String utm;
    private String contractId;
    private PostingRequirementsModel postingRequirements;

    /**
     * Default constructor.
     */
    public OrderedProductsPostElementModel() {
    }

    /**
     * Initialization constructor.
     * @param  productId  String value for productId.
     * @param  utm  String value for utm.
     * @param  contractId  String value for contractId.
     * @param  postingRequirements  PostingRequirementsModel value for postingRequirements.
     */
    public OrderedProductsPostElementModel(
            String productId,
            String utm,
            String contractId,
            PostingRequirementsModel postingRequirements) {
        this.productId = productId;
        this.utm = utm;
        this.contractId = contractId;
        this.postingRequirements = postingRequirements;
    }

    /**
     * Getter for ProductId.
     * Product Identification
     * @return Returns the String
     */
    @JsonGetter("productId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * Product Identification
     * @param productId Value for String
     */
    @JsonSetter("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Getter for Utm.
     * Query string for UTM parameters **Pattern:**
     * `/^([%.-_!*a-zA-Z0-9]{1,}=[%.-_!*+,;$()a-zA-Z0-9]{1,}[&]{0,}){1,}$/`
     * @return Returns the String
     */
    @JsonGetter("utm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUtm() {
        return utm;
    }

    /**
     * Setter for Utm.
     * Query string for UTM parameters **Pattern:**
     * `/^([%.-_!*a-zA-Z0-9]{1,}=[%.-_!*+,;$()a-zA-Z0-9]{1,}[&]{0,}){1,}$/`
     * @param utm Value for String
     */
    @JsonSetter("utm")
    public void setUtm(String utm) {
        this.utm = utm;
    }

    /**
     * Getter for ContractId.
     * Contract Identifier needed for My Contracts product
     * @return Returns the String
     */
    @JsonGetter("contractId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContractId() {
        return contractId;
    }

    /**
     * Setter for ContractId.
     * Contract Identifier needed for My Contracts product
     * @param contractId Value for String
     */
    @JsonSetter("contractId")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Getter for PostingRequirements.
     * @return Returns the PostingRequirementsModel
     */
    @JsonGetter("postingRequirements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostingRequirementsModel getPostingRequirements() {
        return postingRequirements;
    }

    /**
     * Setter for PostingRequirements.
     * @param postingRequirements Value for PostingRequirementsModel
     */
    @JsonSetter("postingRequirements")
    public void setPostingRequirements(PostingRequirementsModel postingRequirements) {
        this.postingRequirements = postingRequirements;
    }

    /**
     * Converts this OrderedProductsPostElementModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedProductsPostElementModel [" + "productId=" + productId + ", utm=" + utm
                + ", contractId=" + contractId + ", postingRequirements=" + postingRequirements
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link OrderedProductsPostElementModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedProductsPostElementModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productId(getProductId())
                .utm(getUtm())
                .contractId(getContractId())
                .postingRequirements(getPostingRequirements());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedProductsPostElementModel}.
     */
    public static class Builder {
        private String productId;
        private String utm;
        private String contractId;
        private PostingRequirementsModel postingRequirements;



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
         * Setter for utm.
         * @param  utm  String value for utm.
         * @return Builder
         */
        public Builder utm(String utm) {
            this.utm = utm;
            return this;
        }

        /**
         * Setter for contractId.
         * @param  contractId  String value for contractId.
         * @return Builder
         */
        public Builder contractId(String contractId) {
            this.contractId = contractId;
            return this;
        }

        /**
         * Setter for postingRequirements.
         * @param  postingRequirements  PostingRequirementsModel value for postingRequirements.
         * @return Builder
         */
        public Builder postingRequirements(PostingRequirementsModel postingRequirements) {
            this.postingRequirements = postingRequirements;
            return this;
        }

        /**
         * Builds a new {@link OrderedProductsPostElementModel} object using the set fields.
         * @return {@link OrderedProductsPostElementModel}
         */
        public OrderedProductsPostElementModel build() {
            return new OrderedProductsPostElementModel(productId, utm, contractId,
                    postingRequirements);
        }
    }
}
