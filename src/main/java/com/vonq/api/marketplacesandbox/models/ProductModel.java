/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.util.UUID;

/**
 * This is a model class for ProductModel type.
 */
public class ProductModel
        extends BaseModel {
    private String title;
    private List<LocationModel> locations;
    private List<JobFunctionModel> jobFunctions;
    private List<IndustryModel> industries;
    private String description;
    private String homepage;
    private String logoUrl;
    private String logoSquareUrl;
    private String logoRectangleUrl;
    private Object duration;
    private TimeToProcessModel timeToProcess;
    private TimeToSetupModel timeToSetup;
    private UUID productId;
    private List<PriceModel> vonqPrice;
    private List<PriceModel> ratecardPrice;
    private ChannelTypeEnum type;
    private List<String> crossPostings;
    private ChannelModel channel;
    private AudienceGroupEnum audienceGroup;
    private boolean mcEnabled;
    private boolean mcOnly;
    private boolean allowOrders;

    /**
     * Default constructor.
     */
    public ProductModel() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  locations  List of LocationModel value for locations.
     * @param  jobFunctions  List of JobFunctionModel value for jobFunctions.
     * @param  industries  List of IndustryModel value for industries.
     * @param  description  String value for description.
     * @param  homepage  String value for homepage.
     * @param  logoUrl  String value for logoUrl.
     * @param  logoSquareUrl  String value for logoSquareUrl.
     * @param  logoRectangleUrl  String value for logoRectangleUrl.
     * @param  duration  Object value for duration.
     * @param  timeToProcess  TimeToProcessModel value for timeToProcess.
     * @param  timeToSetup  TimeToSetupModel value for timeToSetup.
     * @param  productId  UUID value for productId.
     * @param  vonqPrice  List of PriceModel value for vonqPrice.
     * @param  ratecardPrice  List of PriceModel value for ratecardPrice.
     * @param  type  ChannelTypeEnum value for type.
     * @param  crossPostings  List of String value for crossPostings.
     * @param  channel  ChannelModel value for channel.
     * @param  audienceGroup  AudienceGroupEnum value for audienceGroup.
     * @param  mcEnabled  boolean value for mcEnabled.
     * @param  mcOnly  boolean value for mcOnly.
     * @param  allowOrders  boolean value for allowOrders.
     */
    public ProductModel(
            String title,
            List<LocationModel> locations,
            List<JobFunctionModel> jobFunctions,
            List<IndustryModel> industries,
            String description,
            String homepage,
            String logoUrl,
            String logoSquareUrl,
            String logoRectangleUrl,
            Object duration,
            TimeToProcessModel timeToProcess,
            TimeToSetupModel timeToSetup,
            UUID productId,
            List<PriceModel> vonqPrice,
            List<PriceModel> ratecardPrice,
            ChannelTypeEnum type,
            List<String> crossPostings,
            ChannelModel channel,
            AudienceGroupEnum audienceGroup,
            boolean mcEnabled,
            boolean mcOnly,
            boolean allowOrders) {
        this.title = title;
        this.locations = locations;
        this.jobFunctions = jobFunctions;
        this.industries = industries;
        this.description = description;
        this.homepage = homepage;
        this.logoUrl = logoUrl;
        this.logoSquareUrl = logoSquareUrl;
        this.logoRectangleUrl = logoRectangleUrl;
        this.duration = duration;
        this.timeToProcess = timeToProcess;
        this.timeToSetup = timeToSetup;
        this.productId = productId;
        this.vonqPrice = vonqPrice;
        this.ratecardPrice = ratecardPrice;
        this.type = type;
        this.crossPostings = crossPostings;
        this.channel = channel;
        this.audienceGroup = audienceGroup;
        this.mcEnabled = mcEnabled;
        this.mcOnly = mcOnly;
        this.allowOrders = allowOrders;
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
     * Getter for Locations.
     * @return Returns the List of LocationModel
     */
    @JsonGetter("locations")
    public List<LocationModel> getLocations() {
        return locations;
    }

    /**
     * Setter for Locations.
     * @param locations Value for List of LocationModel
     */
    @JsonSetter("locations")
    public void setLocations(List<LocationModel> locations) {
        this.locations = locations;
    }

    /**
     * Getter for JobFunctions.
     * @return Returns the List of JobFunctionModel
     */
    @JsonGetter("job_functions")
    public List<JobFunctionModel> getJobFunctions() {
        return jobFunctions;
    }

    /**
     * Setter for JobFunctions.
     * @param jobFunctions Value for List of JobFunctionModel
     */
    @JsonSetter("job_functions")
    public void setJobFunctions(List<JobFunctionModel> jobFunctions) {
        this.jobFunctions = jobFunctions;
    }

    /**
     * Getter for Industries.
     * @return Returns the List of IndustryModel
     */
    @JsonGetter("industries")
    public List<IndustryModel> getIndustries() {
        return industries;
    }

    /**
     * Setter for Industries.
     * @param industries Value for List of IndustryModel
     */
    @JsonSetter("industries")
    public void setIndustries(List<IndustryModel> industries) {
        this.industries = industries;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Homepage.
     * @return Returns the String
     */
    @JsonGetter("homepage")
    public String getHomepage() {
        return homepage;
    }

    /**
     * Setter for Homepage.
     * @param homepage Value for String
     */
    @JsonSetter("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * Getter for LogoUrl.
     * @return Returns the String
     */
    @JsonGetter("logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Setter for LogoUrl.
     * @param logoUrl Value for String
     */
    @JsonSetter("logo_url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * Getter for LogoSquareUrl.
     * @return Returns the String
     */
    @JsonGetter("logo_square_url")
    public String getLogoSquareUrl() {
        return logoSquareUrl;
    }

    /**
     * Setter for LogoSquareUrl.
     * @param logoSquareUrl Value for String
     */
    @JsonSetter("logo_square_url")
    public void setLogoSquareUrl(String logoSquareUrl) {
        this.logoSquareUrl = logoSquareUrl;
    }

    /**
     * Getter for LogoRectangleUrl.
     * @return Returns the String
     */
    @JsonGetter("logo_rectangle_url")
    public String getLogoRectangleUrl() {
        return logoRectangleUrl;
    }

    /**
     * Setter for LogoRectangleUrl.
     * @param logoRectangleUrl Value for String
     */
    @JsonSetter("logo_rectangle_url")
    public void setLogoRectangleUrl(String logoRectangleUrl) {
        this.logoRectangleUrl = logoRectangleUrl;
    }

    /**
     * Getter for Duration.
     * @return Returns the Object
     */
    @JsonGetter("duration")
    public Object getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * @param duration Value for Object
     */
    @JsonSetter("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    /**
     * Getter for TimeToProcess.
     * @return Returns the TimeToProcessModel
     */
    @JsonGetter("time_to_process")
    public TimeToProcessModel getTimeToProcess() {
        return timeToProcess;
    }

    /**
     * Setter for TimeToProcess.
     * @param timeToProcess Value for TimeToProcessModel
     */
    @JsonSetter("time_to_process")
    public void setTimeToProcess(TimeToProcessModel timeToProcess) {
        this.timeToProcess = timeToProcess;
    }

    /**
     * Getter for TimeToSetup.
     * @return Returns the TimeToSetupModel
     */
    @JsonGetter("time_to_setup")
    public TimeToSetupModel getTimeToSetup() {
        return timeToSetup;
    }

    /**
     * Setter for TimeToSetup.
     * @param timeToSetup Value for TimeToSetupModel
     */
    @JsonSetter("time_to_setup")
    public void setTimeToSetup(TimeToSetupModel timeToSetup) {
        this.timeToSetup = timeToSetup;
    }

    /**
     * Getter for ProductId.
     * @return Returns the UUID
     */
    @JsonGetter("product_id")
    public UUID getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for UUID
     */
    @JsonSetter("product_id")
    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    /**
     * Getter for VonqPrice.
     * the price to be displayed to customers
     * @return Returns the List of PriceModel
     */
    @JsonGetter("vonq_price")
    public List<PriceModel> getVonqPrice() {
        return vonqPrice;
    }

    /**
     * Setter for VonqPrice.
     * the price to be displayed to customers
     * @param vonqPrice Value for List of PriceModel
     */
    @JsonSetter("vonq_price")
    public void setVonqPrice(List<PriceModel> vonqPrice) {
        this.vonqPrice = vonqPrice;
    }

    /**
     * Getter for RatecardPrice.
     * @return Returns the List of PriceModel
     */
    @JsonGetter("ratecard_price")
    public List<PriceModel> getRatecardPrice() {
        return ratecardPrice;
    }

    /**
     * Setter for RatecardPrice.
     * @param ratecardPrice Value for List of PriceModel
     */
    @JsonSetter("ratecard_price")
    public void setRatecardPrice(List<PriceModel> ratecardPrice) {
        this.ratecardPrice = ratecardPrice;
    }

    /**
     * Getter for Type.
     * The type of a channel
     * @return Returns the ChannelTypeEnum
     */
    @JsonGetter("type")
    public ChannelTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of a channel
     * @param type Value for ChannelTypeEnum
     */
    @JsonSetter("type")
    public void setType(ChannelTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for CrossPostings.
     * @return Returns the List of String
     */
    @JsonGetter("cross_postings")
    public List<String> getCrossPostings() {
        return crossPostings;
    }

    /**
     * Setter for CrossPostings.
     * @param crossPostings Value for List of String
     */
    @JsonSetter("cross_postings")
    public void setCrossPostings(List<String> crossPostings) {
        this.crossPostings = crossPostings;
    }

    /**
     * Getter for Channel.
     * @return Returns the ChannelModel
     */
    @JsonGetter("channel")
    public ChannelModel getChannel() {
        return channel;
    }

    /**
     * Setter for Channel.
     * @param channel Value for ChannelModel
     */
    @JsonSetter("channel")
    public void setChannel(ChannelModel channel) {
        this.channel = channel;
    }

    /**
     * Getter for AudienceGroup.
     * The product's audience group (niche/generic)
     * @return Returns the AudienceGroupEnum
     */
    @JsonGetter("audience_group")
    public AudienceGroupEnum getAudienceGroup() {
        return audienceGroup;
    }

    /**
     * Setter for AudienceGroup.
     * The product's audience group (niche/generic)
     * @param audienceGroup Value for AudienceGroupEnum
     */
    @JsonSetter("audience_group")
    public void setAudienceGroup(AudienceGroupEnum audienceGroup) {
        this.audienceGroup = audienceGroup;
    }

    /**
     * Getter for McEnabled.
     * is My Contract enabled for the channel
     * @return Returns the boolean
     */
    @JsonGetter("mc_enabled")
    public boolean getMcEnabled() {
        return mcEnabled;
    }

    /**
     * Setter for McEnabled.
     * is My Contract enabled for the channel
     * @param mcEnabled Value for boolean
     */
    @JsonSetter("mc_enabled")
    public void setMcEnabled(boolean mcEnabled) {
        this.mcEnabled = mcEnabled;
    }

    /**
     * Getter for McOnly.
     * is the product available only for My Contract order
     * @return Returns the boolean
     */
    @JsonGetter("mc_only")
    public boolean getMcOnly() {
        return mcOnly;
    }

    /**
     * Setter for McOnly.
     * is the product available only for My Contract order
     * @param mcOnly Value for boolean
     */
    @JsonSetter("mc_only")
    public void setMcOnly(boolean mcOnly) {
        this.mcOnly = mcOnly;
    }

    /**
     * Getter for AllowOrders.
     * is the product available for order. a campaign cannot be ordered with a product having
     * `allow_orders` set to `false`.
     * @return Returns the boolean
     */
    @JsonGetter("allow_orders")
    public boolean getAllowOrders() {
        return allowOrders;
    }

    /**
     * Setter for AllowOrders.
     * is the product available for order. a campaign cannot be ordered with a product having
     * `allow_orders` set to `false`.
     * @param allowOrders Value for boolean
     */
    @JsonSetter("allow_orders")
    public void setAllowOrders(boolean allowOrders) {
        this.allowOrders = allowOrders;
    }

    /**
     * Converts this ProductModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductModel [" + "title=" + title + ", locations=" + locations + ", jobFunctions="
                + jobFunctions + ", industries=" + industries + ", description=" + description
                + ", homepage=" + homepage + ", logoUrl=" + logoUrl + ", logoSquareUrl="
                + logoSquareUrl + ", logoRectangleUrl=" + logoRectangleUrl + ", duration="
                + duration + ", timeToProcess=" + timeToProcess + ", timeToSetup=" + timeToSetup
                + ", productId=" + productId + ", vonqPrice=" + vonqPrice + ", ratecardPrice="
                + ratecardPrice + ", type=" + type + ", crossPostings=" + crossPostings
                + ", channel=" + channel + ", audienceGroup=" + audienceGroup + ", mcEnabled="
                + mcEnabled + ", mcOnly=" + mcOnly + ", allowOrders=" + allowOrders
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ProductModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, locations, jobFunctions, industries, description,
                homepage, logoUrl, logoSquareUrl, logoRectangleUrl, duration, timeToProcess,
                timeToSetup, productId, vonqPrice, ratecardPrice, type, crossPostings, channel,
                audienceGroup, mcEnabled, mcOnly, allowOrders);
        return builder;
    }

    /**
     * Class to build instances of {@link ProductModel}.
     */
    public static class Builder {
        private String title;
        private List<LocationModel> locations;
        private List<JobFunctionModel> jobFunctions;
        private List<IndustryModel> industries;
        private String description;
        private String homepage;
        private String logoUrl;
        private String logoSquareUrl;
        private String logoRectangleUrl;
        private Object duration;
        private TimeToProcessModel timeToProcess;
        private TimeToSetupModel timeToSetup;
        private UUID productId;
        private List<PriceModel> vonqPrice;
        private List<PriceModel> ratecardPrice;
        private ChannelTypeEnum type;
        private List<String> crossPostings;
        private ChannelModel channel;
        private AudienceGroupEnum audienceGroup;
        private boolean mcEnabled;
        private boolean mcOnly;
        private boolean allowOrders;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  locations  List of LocationModel value for locations.
         * @param  jobFunctions  List of JobFunctionModel value for jobFunctions.
         * @param  industries  List of IndustryModel value for industries.
         * @param  description  String value for description.
         * @param  homepage  String value for homepage.
         * @param  logoUrl  String value for logoUrl.
         * @param  logoSquareUrl  String value for logoSquareUrl.
         * @param  logoRectangleUrl  String value for logoRectangleUrl.
         * @param  duration  Object value for duration.
         * @param  timeToProcess  TimeToProcessModel value for timeToProcess.
         * @param  timeToSetup  TimeToSetupModel value for timeToSetup.
         * @param  productId  UUID value for productId.
         * @param  vonqPrice  List of PriceModel value for vonqPrice.
         * @param  ratecardPrice  List of PriceModel value for ratecardPrice.
         * @param  type  ChannelTypeEnum value for type.
         * @param  crossPostings  List of String value for crossPostings.
         * @param  channel  ChannelModel value for channel.
         * @param  audienceGroup  AudienceGroupEnum value for audienceGroup.
         * @param  mcEnabled  boolean value for mcEnabled.
         * @param  mcOnly  boolean value for mcOnly.
         * @param  allowOrders  boolean value for allowOrders.
         */
        public Builder(String title, List<LocationModel> locations,
                List<JobFunctionModel> jobFunctions, List<IndustryModel> industries,
                String description, String homepage, String logoUrl, String logoSquareUrl,
                String logoRectangleUrl, Object duration, TimeToProcessModel timeToProcess,
                TimeToSetupModel timeToSetup, UUID productId, List<PriceModel> vonqPrice,
                List<PriceModel> ratecardPrice, ChannelTypeEnum type, List<String> crossPostings,
                ChannelModel channel, AudienceGroupEnum audienceGroup, boolean mcEnabled,
                boolean mcOnly, boolean allowOrders) {
            this.title = title;
            this.locations = locations;
            this.jobFunctions = jobFunctions;
            this.industries = industries;
            this.description = description;
            this.homepage = homepage;
            this.logoUrl = logoUrl;
            this.logoSquareUrl = logoSquareUrl;
            this.logoRectangleUrl = logoRectangleUrl;
            this.duration = duration;
            this.timeToProcess = timeToProcess;
            this.timeToSetup = timeToSetup;
            this.productId = productId;
            this.vonqPrice = vonqPrice;
            this.ratecardPrice = ratecardPrice;
            this.type = type;
            this.crossPostings = crossPostings;
            this.channel = channel;
            this.audienceGroup = audienceGroup;
            this.mcEnabled = mcEnabled;
            this.mcOnly = mcOnly;
            this.allowOrders = allowOrders;
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
         * Setter for locations.
         * @param  locations  List of LocationModel value for locations.
         * @return Builder
         */
        public Builder locations(List<LocationModel> locations) {
            this.locations = locations;
            return this;
        }

        /**
         * Setter for jobFunctions.
         * @param  jobFunctions  List of JobFunctionModel value for jobFunctions.
         * @return Builder
         */
        public Builder jobFunctions(List<JobFunctionModel> jobFunctions) {
            this.jobFunctions = jobFunctions;
            return this;
        }

        /**
         * Setter for industries.
         * @param  industries  List of IndustryModel value for industries.
         * @return Builder
         */
        public Builder industries(List<IndustryModel> industries) {
            this.industries = industries;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for homepage.
         * @param  homepage  String value for homepage.
         * @return Builder
         */
        public Builder homepage(String homepage) {
            this.homepage = homepage;
            return this;
        }

        /**
         * Setter for logoUrl.
         * @param  logoUrl  String value for logoUrl.
         * @return Builder
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * Setter for logoSquareUrl.
         * @param  logoSquareUrl  String value for logoSquareUrl.
         * @return Builder
         */
        public Builder logoSquareUrl(String logoSquareUrl) {
            this.logoSquareUrl = logoSquareUrl;
            return this;
        }

        /**
         * Setter for logoRectangleUrl.
         * @param  logoRectangleUrl  String value for logoRectangleUrl.
         * @return Builder
         */
        public Builder logoRectangleUrl(String logoRectangleUrl) {
            this.logoRectangleUrl = logoRectangleUrl;
            return this;
        }

        /**
         * Setter for duration.
         * @param  duration  Object value for duration.
         * @return Builder
         */
        public Builder duration(Object duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Setter for timeToProcess.
         * @param  timeToProcess  TimeToProcessModel value for timeToProcess.
         * @return Builder
         */
        public Builder timeToProcess(TimeToProcessModel timeToProcess) {
            this.timeToProcess = timeToProcess;
            return this;
        }

        /**
         * Setter for timeToSetup.
         * @param  timeToSetup  TimeToSetupModel value for timeToSetup.
         * @return Builder
         */
        public Builder timeToSetup(TimeToSetupModel timeToSetup) {
            this.timeToSetup = timeToSetup;
            return this;
        }

        /**
         * Setter for productId.
         * @param  productId  UUID value for productId.
         * @return Builder
         */
        public Builder productId(UUID productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for vonqPrice.
         * @param  vonqPrice  List of PriceModel value for vonqPrice.
         * @return Builder
         */
        public Builder vonqPrice(List<PriceModel> vonqPrice) {
            this.vonqPrice = vonqPrice;
            return this;
        }

        /**
         * Setter for ratecardPrice.
         * @param  ratecardPrice  List of PriceModel value for ratecardPrice.
         * @return Builder
         */
        public Builder ratecardPrice(List<PriceModel> ratecardPrice) {
            this.ratecardPrice = ratecardPrice;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  ChannelTypeEnum value for type.
         * @return Builder
         */
        public Builder type(ChannelTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for crossPostings.
         * @param  crossPostings  List of String value for crossPostings.
         * @return Builder
         */
        public Builder crossPostings(List<String> crossPostings) {
            this.crossPostings = crossPostings;
            return this;
        }

        /**
         * Setter for channel.
         * @param  channel  ChannelModel value for channel.
         * @return Builder
         */
        public Builder channel(ChannelModel channel) {
            this.channel = channel;
            return this;
        }

        /**
         * Setter for audienceGroup.
         * @param  audienceGroup  AudienceGroupEnum value for audienceGroup.
         * @return Builder
         */
        public Builder audienceGroup(AudienceGroupEnum audienceGroup) {
            this.audienceGroup = audienceGroup;
            return this;
        }

        /**
         * Setter for mcEnabled.
         * @param  mcEnabled  boolean value for mcEnabled.
         * @return Builder
         */
        public Builder mcEnabled(boolean mcEnabled) {
            this.mcEnabled = mcEnabled;
            return this;
        }

        /**
         * Setter for mcOnly.
         * @param  mcOnly  boolean value for mcOnly.
         * @return Builder
         */
        public Builder mcOnly(boolean mcOnly) {
            this.mcOnly = mcOnly;
            return this;
        }

        /**
         * Setter for allowOrders.
         * @param  allowOrders  boolean value for allowOrders.
         * @return Builder
         */
        public Builder allowOrders(boolean allowOrders) {
            this.allowOrders = allowOrders;
            return this;
        }

        /**
         * Builds a new {@link ProductModel} object using the set fields.
         * @return {@link ProductModel}
         */
        public ProductModel build() {
            return new ProductModel(title, locations, jobFunctions, industries, description,
                    homepage, logoUrl, logoSquareUrl, logoRectangleUrl, duration, timeToProcess,
                    timeToSetup, productId, vonqPrice, ratecardPrice, type, crossPostings, channel,
                    audienceGroup, mcEnabled, mcOnly, allowOrders);
        }
    }
}
