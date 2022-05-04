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
import java.util.List;

/**
 * This is a model class for ContractModel type.
 */
public class ContractModel
        extends BaseModel {
    private String contractId;
    private String customerId;
    private double channelId;
    private Object credentials;
    private String className;
    private Object facets;
    private ContractProductModel product;
    private List<FacetModel> postingRequirements;
    private LocalDateTime expiryDate;
    private Double credits;
    private ContractPurchasePriceModel purchasePrice;

    /**
     * Default constructor.
     */
    public ContractModel() {
    }

    /**
     * Initialization constructor.
     * @param  contractId  String value for contractId.
     * @param  customerId  String value for customerId.
     * @param  channelId  double value for channelId.
     * @param  credentials  Object value for credentials.
     * @param  className  String value for className.
     * @param  facets  Object value for facets.
     * @param  product  ContractProductModel value for product.
     * @param  postingRequirements  List of FacetModel value for postingRequirements.
     * @param  expiryDate  LocalDateTime value for expiryDate.
     * @param  credits  Double value for credits.
     * @param  purchasePrice  ContractPurchasePriceModel value for purchasePrice.
     */
    public ContractModel(
            String contractId,
            String customerId,
            double channelId,
            Object credentials,
            String className,
            Object facets,
            ContractProductModel product,
            List<FacetModel> postingRequirements,
            LocalDateTime expiryDate,
            Double credits,
            ContractPurchasePriceModel purchasePrice) {
        this.contractId = contractId;
        this.customerId = customerId;
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
     * Getter for ContractId.
     * The identifier of the Contract. To be used when creating a Campaign
     * @return Returns the String
     */
    @JsonGetter("contract_id")
    public String getContractId() {
        return contractId;
    }

    /**
     * Setter for ContractId.
     * The identifier of the Contract. To be used when creating a Campaign
     * @param contractId Value for String
     */
    @JsonSetter("contract_id")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Getter for CustomerId.
     * The customer_id this contract belongs to. Based on the original `X-Customer-Id` header used
     * when the contract was created.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The customer_id this contract belongs to. Based on the original `X-Customer-Id` header used
     * when the contract was created.
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for ChannelId.
     * The Channel (job board) the contract is to be used for
     * @return Returns the double
     */
    @JsonGetter("channel_id")
    public double getChannelId() {
        return channelId;
    }

    /**
     * Setter for ChannelId.
     * The Channel (job board) the contract is to be used for
     * @param channelId Value for double
     */
    @JsonSetter("channel_id")
    public void setChannelId(double channelId) {
        this.channelId = channelId;
    }

    /**
     * Getter for Credentials.
     * AES Encrypted credentials
     * @return Returns the Object
     */
    @JsonGetter("credentials")
    public Object getCredentials() {
        return credentials;
    }

    /**
     * Setter for Credentials.
     * AES Encrypted credentials
     * @param credentials Value for Object
     */
    @JsonSetter("credentials")
    public void setCredentials(Object credentials) {
        this.credentials = credentials;
    }

    /**
     * Getter for ClassName.
     * Channel slug
     * @return Returns the String
     */
    @JsonGetter("class_name")
    public String getClassName() {
        return className;
    }

    /**
     * Setter for ClassName.
     * Channel slug
     * @param className Value for String
     */
    @JsonSetter("class_name")
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Getter for Facets.
     * An object with contract parameters
     * @return Returns the Object
     */
    @JsonGetter("facets")
    public Object getFacets() {
        return facets;
    }

    /**
     * Setter for Facets.
     * An object with contract parameters
     * @param facets Value for Object
     */
    @JsonSetter("facets")
    public void setFacets(Object facets) {
        this.facets = facets;
    }

    /**
     * Getter for Product.
     * The Product to be used in combination with the Contract when ordering a Campaign.
     * @return Returns the ContractProductModel
     */
    @JsonGetter("product")
    public ContractProductModel getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * The Product to be used in combination with the Contract when ordering a Campaign.
     * @param product Value for ContractProductModel
     */
    @JsonSetter("product")
    public void setProduct(ContractProductModel product) {
        this.product = product;
    }

    /**
     * Getter for PostingRequirements.
     * A list of the Contract Channel's Facets
     * @return Returns the List of FacetModel
     */
    @JsonGetter("posting_requirements")
    public List<FacetModel> getPostingRequirements() {
        return postingRequirements;
    }

    /**
     * Setter for PostingRequirements.
     * A list of the Contract Channel's Facets
     * @param postingRequirements Value for List of FacetModel
     */
    @JsonSetter("posting_requirements")
    public void setPostingRequirements(List<FacetModel> postingRequirements) {
        this.postingRequirements = postingRequirements;
    }

    /**
     * Getter for ExpiryDate.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expiry_date")
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
     * @return Returns the Double
     */
    @JsonGetter("credits")
    public Double getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * @param credits Value for Double
     */
    @JsonSetter("credits")
    public void setCredits(Double credits) {
        this.credits = credits;
    }

    /**
     * Getter for PurchasePrice.
     * @return Returns the ContractPurchasePriceModel
     */
    @JsonGetter("purchase_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ContractPurchasePriceModel getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Setter for PurchasePrice.
     * @param purchasePrice Value for ContractPurchasePriceModel
     */
    @JsonSetter("purchase_price")
    public void setPurchasePrice(ContractPurchasePriceModel purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * Converts this ContractModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ContractModel [" + "contractId=" + contractId + ", customerId=" + customerId
                + ", channelId=" + channelId + ", credentials=" + credentials + ", className="
                + className + ", facets=" + facets + ", product=" + product
                + ", postingRequirements=" + postingRequirements + ", expiryDate=" + expiryDate
                + ", credits=" + credits + ", purchasePrice=" + purchasePrice
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ContractModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ContractModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contractId, customerId, channelId, credentials, className,
                facets, product, postingRequirements, expiryDate, credits)
                .purchasePrice(getPurchasePrice());
        return builder;
    }

    /**
     * Class to build instances of {@link ContractModel}.
     */
    public static class Builder {
        private String contractId;
        private String customerId;
        private double channelId;
        private Object credentials;
        private String className;
        private Object facets;
        private ContractProductModel product;
        private List<FacetModel> postingRequirements;
        private LocalDateTime expiryDate;
        private Double credits;
        private ContractPurchasePriceModel purchasePrice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contractId  String value for contractId.
         * @param  customerId  String value for customerId.
         * @param  channelId  double value for channelId.
         * @param  credentials  Object value for credentials.
         * @param  className  String value for className.
         * @param  facets  Object value for facets.
         * @param  product  ContractProductModel value for product.
         * @param  postingRequirements  List of FacetModel value for postingRequirements.
         * @param  expiryDate  LocalDateTime value for expiryDate.
         * @param  credits  Double value for credits.
         */
        public Builder(String contractId, String customerId, double channelId, Object credentials,
                String className, Object facets, ContractProductModel product,
                List<FacetModel> postingRequirements, LocalDateTime expiryDate, Double credits) {
            this.contractId = contractId;
            this.customerId = customerId;
            this.channelId = channelId;
            this.credentials = credentials;
            this.className = className;
            this.facets = facets;
            this.product = product;
            this.postingRequirements = postingRequirements;
            this.expiryDate = expiryDate;
            this.credits = credits;
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
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for channelId.
         * @param  channelId  double value for channelId.
         * @return Builder
         */
        public Builder channelId(double channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * Setter for credentials.
         * @param  credentials  Object value for credentials.
         * @return Builder
         */
        public Builder credentials(Object credentials) {
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
         * @param  product  ContractProductModel value for product.
         * @return Builder
         */
        public Builder product(ContractProductModel product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for postingRequirements.
         * @param  postingRequirements  List of FacetModel value for postingRequirements.
         * @return Builder
         */
        public Builder postingRequirements(List<FacetModel> postingRequirements) {
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
         * @param  credits  Double value for credits.
         * @return Builder
         */
        public Builder credits(Double credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for purchasePrice.
         * @param  purchasePrice  ContractPurchasePriceModel value for purchasePrice.
         * @return Builder
         */
        public Builder purchasePrice(ContractPurchasePriceModel purchasePrice) {
            this.purchasePrice = purchasePrice;
            return this;
        }

        /**
         * Builds a new {@link ContractModel} object using the set fields.
         * @return {@link ContractModel}
         */
        public ContractModel build() {
            return new ContractModel(contractId, customerId, channelId, credentials, className,
                    facets, product, postingRequirements, expiryDate, credits, purchasePrice);
        }
    }
}
