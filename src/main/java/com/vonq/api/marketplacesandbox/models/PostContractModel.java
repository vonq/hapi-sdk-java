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
 * This is a model class for PostContractModel type.
 */
public class PostContractModel
        extends BaseModel {
    private double channelId;
    private Object credentials;
    private Object facets;
    private Boolean followedInstructions;
    private LocalDateTime expiryDate;
    private Double credits;
    private ContractPurchasePriceModel purchasePrice;

    /**
     * Default constructor.
     */
    public PostContractModel() {
    }

    /**
     * Initialization constructor.
     * @param  channelId  double value for channelId.
     * @param  credentials  Object value for credentials.
     * @param  facets  Object value for facets.
     * @param  followedInstructions  Boolean value for followedInstructions.
     * @param  expiryDate  LocalDateTime value for expiryDate.
     * @param  credits  Double value for credits.
     * @param  purchasePrice  ContractPurchasePriceModel value for purchasePrice.
     */
    public PostContractModel(
            double channelId,
            Object credentials,
            Object facets,
            Boolean followedInstructions,
            LocalDateTime expiryDate,
            Double credits,
            ContractPurchasePriceModel purchasePrice) {
        this.channelId = channelId;
        this.credentials = credentials;
        this.facets = facets;
        this.followedInstructions = followedInstructions;
        this.expiryDate = expiryDate;
        this.credits = credits;
        this.purchasePrice = purchasePrice;
    }

    /**
     * Getter for ChannelId.
     * @return Returns the double
     */
    @JsonGetter("channel_id")
    public double getChannelId() {
        return channelId;
    }

    /**
     * Setter for ChannelId.
     * @param channelId Value for double
     */
    @JsonSetter("channel_id")
    public void setChannelId(double channelId) {
        this.channelId = channelId;
    }

    /**
     * Getter for Credentials.
     * An object with credentials data
     * @return Returns the Object
     */
    @JsonGetter("credentials")
    public Object getCredentials() {
        return credentials;
    }

    /**
     * Setter for Credentials.
     * An object with credentials data
     * @param credentials Value for Object
     */
    @JsonSetter("credentials")
    public void setCredentials(Object credentials) {
        this.credentials = credentials;
    }

    /**
     * Getter for Facets.
     * An object with product parameters
     * @return Returns the Object
     */
    @JsonGetter("facets")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getFacets() {
        return facets;
    }

    /**
     * Setter for Facets.
     * An object with product parameters
     * @param facets Value for Object
     */
    @JsonSetter("facets")
    public void setFacets(Object facets) {
        this.facets = facets;
    }

    /**
     * Getter for FollowedInstructions.
     * When creating contracts for Channels that require the end-user to follow instructions (based
     * on the `manual_setup_required` key in the response body for the [Retrieve details for channel
     * with support for
     * contracts](https://vonq.stoplight.io/docs/hapi/b3A6NTUxMjYwODI-retrieve-details-for-channel-with-support-for-contracts)
     * endpoint), set this value to `true` to confirm the user has done so. For quality purposes,
     * setting this field to `true` for Channels that don't require following instructions will
     * result in a 400 Bad Request.
     * @return Returns the Boolean
     */
    @JsonGetter("followed_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFollowedInstructions() {
        return followedInstructions;
    }

    /**
     * Setter for FollowedInstructions.
     * When creating contracts for Channels that require the end-user to follow instructions (based
     * on the `manual_setup_required` key in the response body for the [Retrieve details for channel
     * with support for
     * contracts](https://vonq.stoplight.io/docs/hapi/b3A6NTUxMjYwODI-retrieve-details-for-channel-with-support-for-contracts)
     * endpoint), set this value to `true` to confirm the user has done so. For quality purposes,
     * setting this field to `true` for Channels that don't require following instructions will
     * result in a 400 Bad Request.
     * @param followedInstructions Value for Boolean
     */
    @JsonSetter("followed_instructions")
    public void setFollowedInstructions(Boolean followedInstructions) {
        this.followedInstructions = followedInstructions;
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
     * @return Returns the Double
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this PostContractModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostContractModel [" + "channelId=" + channelId + ", credentials=" + credentials
                + ", facets=" + facets + ", followedInstructions=" + followedInstructions
                + ", expiryDate=" + expiryDate + ", credits=" + credits + ", purchasePrice="
                + purchasePrice + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostContractModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostContractModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(channelId, credentials)
                .facets(getFacets())
                .followedInstructions(getFollowedInstructions())
                .expiryDate(getExpiryDate())
                .credits(getCredits())
                .purchasePrice(getPurchasePrice());
        return builder;
    }

    /**
     * Class to build instances of {@link PostContractModel}.
     */
    public static class Builder {
        private double channelId;
        private Object credentials;
        private Object facets;
        private Boolean followedInstructions;
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
         * @param  channelId  double value for channelId.
         * @param  credentials  Object value for credentials.
         */
        public Builder(double channelId, Object credentials) {
            this.channelId = channelId;
            this.credentials = credentials;
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
         * Setter for facets.
         * @param  facets  Object value for facets.
         * @return Builder
         */
        public Builder facets(Object facets) {
            this.facets = facets;
            return this;
        }

        /**
         * Setter for followedInstructions.
         * @param  followedInstructions  Boolean value for followedInstructions.
         * @return Builder
         */
        public Builder followedInstructions(Boolean followedInstructions) {
            this.followedInstructions = followedInstructions;
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
         * Builds a new {@link PostContractModel} object using the set fields.
         * @return {@link PostContractModel}
         */
        public PostContractModel build() {
            return new PostContractModel(channelId, credentials, facets, followedInstructions,
                    expiryDate, credits, purchasePrice);
        }
    }
}
