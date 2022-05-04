/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vonq.api.marketplacesandbox.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for CreateContractResponseModel type.
 */
public class CreateContractResponseModel
        extends BaseModel {
    private String customerId;
    private String contractId;
    private int channelId;
    private String credentials;
    private String className;
    private Object facets;
    private ProductLiteModel product;
    private String postingRequirements;
    private LocalDateTime expiryDate;
    private Integer credits;
    private PurchasePriceModel purchasePrice;

    /**
     * Default constructor.
     */
    public CreateContractResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  customerId  String value for customerId.
     * @param  contractId  String value for contractId.
     * @param  channelId  int value for channelId.
     * @param  credentials  String value for credentials.
     * @param  className  String value for className.
     * @param  facets  Object value for facets.
     * @param  product  ProductLiteModel value for product.
     * @param  postingRequirements  String value for postingRequirements.
     * @param  expiryDate  LocalDateTime value for expiryDate.
     * @param  credits  Integer value for credits.
     * @param  purchasePrice  PurchasePriceModel value for purchasePrice.
     */
    public CreateContractResponseModel(
            String customerId,
            String contractId,
            int channelId,
            String credentials,
            String className,
            Object facets,
            ProductLiteModel product,
            String postingRequirements,
            LocalDateTime expiryDate,
            Integer credits,
            PurchasePriceModel purchasePrice) {
        this.customerId = customerId;
        this.contractId = contractId;
        this.channelId = channelId;
        this.credentials = credentials;
        this.className = className;
        this.facets = facets;
        this.product = product;
        this.postingRequirements = postingRequirements;
        this.expiryDate = expiryDate;
        this.credits = credits;
        this.purchasePrice = purchasePrice;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for ContractId.
     * @return Returns the String
     */
    @JsonGetter("contract_id")
    public String getContractId() {
        return contractId;
    }

    /**
     * Setter for ContractId.
     * @param contractId Value for String
     */
    @JsonSetter("contract_id")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Getter for ChannelId.
     * @return Returns the int
     */
    @JsonGetter("channel_id")
    public int getChannelId() {
        return channelId;
    }

    /**
     * Setter for ChannelId.
     * @param channelId Value for int
     */
    @JsonSetter("channel_id")
    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    /**
     * Getter for Credentials.
     * @return Returns the String
     */
    @JsonGetter("credentials")
    public String getCredentials() {
        return credentials;
    }

    /**
     * Setter for Credentials.
     * @param credentials Value for String
     */
    @JsonSetter("credentials")
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * Getter for ClassName.
     * @return Returns the String
     */
    @JsonGetter("class_name")
    public String getClassName() {
        return className;
    }

    /**
     * Setter for ClassName.
     * @param className Value for String
     */
    @JsonSetter("class_name")
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Getter for Facets.
     * @return Returns the Object
     */
    @JsonGetter("facets")
    public Object getFacets() {
        return facets;
    }

    /**
     * Setter for Facets.
     * @param facets Value for Object
     */
    @JsonSetter("facets")
    public void setFacets(Object facets) {
        this.facets = facets;
    }

    /**
     * Getter for Product.
     * @return Returns the ProductLiteModel
     */
    @JsonGetter("product")
    public ProductLiteModel getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * @param product Value for ProductLiteModel
     */
    @JsonSetter("product")
    public void setProduct(ProductLiteModel product) {
        this.product = product;
    }

    /**
     * Getter for PostingRequirements.
     * @return Returns the String
     */
    @JsonGetter("posting_requirements")
    public String getPostingRequirements() {
        return postingRequirements;
    }

    /**
     * Setter for PostingRequirements.
     * @param postingRequirements Value for String
     */
    @JsonSetter("posting_requirements")
    public void setPostingRequirements(String postingRequirements) {
        this.postingRequirements = postingRequirements;
    }

    /**
     * Getter for ExpiryDate.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expiry_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    /**
     * Setter for ExpiryDate.
     * @param expiryDate Value for LocalDateTime
     */
    @JsonSetter("expiry_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Getter for Credits.
     * @return Returns the Integer
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * @param credits Value for Integer
     */
    @JsonSetter("credits")
    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    /**
     * Getter for PurchasePrice.
     * @return Returns the PurchasePriceModel
     */
    @JsonGetter("purchase_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PurchasePriceModel getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Setter for PurchasePrice.
     * @param purchasePrice Value for PurchasePriceModel
     */
    @JsonSetter("purchase_price")
    public void setPurchasePrice(PurchasePriceModel purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * Converts this CreateContractResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateContractResponseModel [" + "customerId=" + customerId + ", contractId="
                + contractId + ", channelId=" + channelId + ", credentials=" + credentials
                + ", className=" + className + ", facets=" + facets + ", product=" + product
                + ", postingRequirements=" + postingRequirements + ", expiryDate=" + expiryDate
                + ", credits=" + credits + ", purchasePrice=" + purchasePrice
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateContractResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateContractResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customerId, contractId, channelId, credentials, className,
                facets, product, postingRequirements)
                .expiryDate(getExpiryDate())
                .credits(getCredits())
                .purchasePrice(getPurchasePrice());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateContractResponseModel}.
     */
    public static class Builder {
        private String customerId;
        private String contractId;
        private int channelId;
        private String credentials;
        private String className;
        private Object facets;
        private ProductLiteModel product;
        private String postingRequirements;
        private LocalDateTime expiryDate;
        private Integer credits;
        private PurchasePriceModel purchasePrice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customerId  String value for customerId.
         * @param  contractId  String value for contractId.
         * @param  channelId  int value for channelId.
         * @param  credentials  String value for credentials.
         * @param  className  String value for className.
         * @param  facets  Object value for facets.
         * @param  product  ProductLiteModel value for product.
         * @param  postingRequirements  String value for postingRequirements.
         */
        public Builder(String customerId, String contractId, int channelId, String credentials,
                String className, Object facets, ProductLiteModel product,
                String postingRequirements) {
            this.customerId = customerId;
            this.contractId = contractId;
            this.channelId = channelId;
            this.credentials = credentials;
            this.className = className;
            this.facets = facets;
            this.product = product;
            this.postingRequirements = postingRequirements;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
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
         * Setter for channelId.
         * @param  channelId  int value for channelId.
         * @return Builder
         */
        public Builder channelId(int channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * Setter for credentials.
         * @param  credentials  String value for credentials.
         * @return Builder
         */
        public Builder credentials(String credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * Setter for className.
         * @param  className  String value for className.
         * @return Builder
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * Setter for facets.
         * @param  facets  Object value for facets.
         * @return Builder
         */
        public Builder facets(Object facets) {
            this.facets = facets;
            return this;
        }

        /**
         * Setter for product.
         * @param  product  ProductLiteModel value for product.
         * @return Builder
         */
        public Builder product(ProductLiteModel product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for postingRequirements.
         * @param  postingRequirements  String value for postingRequirements.
         * @return Builder
         */
        public Builder postingRequirements(String postingRequirements) {
            this.postingRequirements = postingRequirements;
            return this;
        }

        /**
         * Setter for expiryDate.
         * @param  expiryDate  LocalDateTime value for expiryDate.
         * @return Builder
         */
        public Builder expiryDate(LocalDateTime expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        /**
         * Setter for credits.
         * @param  credits  Integer value for credits.
         * @return Builder
         */
        public Builder credits(Integer credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for purchasePrice.
         * @param  purchasePrice  PurchasePriceModel value for purchasePrice.
         * @return Builder
         */
        public Builder purchasePrice(PurchasePriceModel purchasePrice) {
            this.purchasePrice = purchasePrice;
            return this;
        }

        /**
         * Builds a new {@link CreateContractResponseModel} object using the set fields.
         * @return {@link CreateContractResponseModel}
         */
        public CreateContractResponseModel build() {
            return new CreateContractResponseModel(customerId, contractId, channelId, credentials,
                    className, facets, product, postingRequirements, expiryDate, credits,
                    purchasePrice);
        }
    }
}
