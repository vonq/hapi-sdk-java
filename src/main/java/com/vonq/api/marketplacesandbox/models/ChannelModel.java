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
 * This is a model class for ChannelModel type.
 */
public class ChannelModel
        extends BaseModel {
    private String name;
    private String url;
    private ChannelTypeEnum type;
    private boolean mcEnabled;
    private List<ContractCredentialModel> contractCredentials;
    private List<Object> contractFacets;
    private List<FacetModel> postingRequirements;
    private boolean manualSetupRequired;
    private String setupInstructions;
    private String feedUrl;

    /**
     * Default constructor.
     */
    public ChannelModel() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  url  String value for url.
     * @param  type  ChannelTypeEnum value for type.
     * @param  mcEnabled  boolean value for mcEnabled.
     * @param  contractCredentials  List of ContractCredentialModel value for contractCredentials.
     * @param  contractFacets  List of Object value for contractFacets.
     * @param  postingRequirements  List of FacetModel value for postingRequirements.
     * @param  manualSetupRequired  boolean value for manualSetupRequired.
     * @param  setupInstructions  String value for setupInstructions.
     * @param  feedUrl  String value for feedUrl.
     */
    public ChannelModel(
            String name,
            String url,
            ChannelTypeEnum type,
            boolean mcEnabled,
            List<ContractCredentialModel> contractCredentials,
            List<Object> contractFacets,
            List<FacetModel> postingRequirements,
            boolean manualSetupRequired,
            String setupInstructions,
            String feedUrl) {
        this.name = name;
        this.url = url;
        this.type = type;
        this.mcEnabled = mcEnabled;
        this.contractCredentials = contractCredentials;
        this.contractFacets = contractFacets;
        this.postingRequirements = postingRequirements;
        this.manualSetupRequired = manualSetupRequired;
        this.setupInstructions = setupInstructions;
        this.feedUrl = feedUrl;
    }

    /**
     * Getter for Name.
     * The name of a channel
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of a channel
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Url.
     * The url of a channel
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The url of a channel
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
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
     * Getter for McEnabled.
     * Does a channel support My Contracts
     * @return Returns the boolean
     */
    @JsonGetter("mc_enabled")
    public boolean getMcEnabled() {
        return mcEnabled;
    }

    /**
     * Setter for McEnabled.
     * Does a channel support My Contracts
     * @param mcEnabled Value for boolean
     */
    @JsonSetter("mc_enabled")
    public void setMcEnabled(boolean mcEnabled) {
        this.mcEnabled = mcEnabled;
    }

    /**
     * Getter for ContractCredentials.
     * @return Returns the List of ContractCredentialModel
     */
    @JsonGetter("contract_credentials")
    public List<ContractCredentialModel> getContractCredentials() {
        return contractCredentials;
    }

    /**
     * Setter for ContractCredentials.
     * @param contractCredentials Value for List of ContractCredentialModel
     */
    @JsonSetter("contract_credentials")
    public void setContractCredentials(List<ContractCredentialModel> contractCredentials) {
        this.contractCredentials = contractCredentials;
    }

    /**
     * Getter for ContractFacets.
     * @return Returns the List of Object
     */
    @JsonGetter("contract_facets")
    public List<Object> getContractFacets() {
        return contractFacets;
    }

    /**
     * Setter for ContractFacets.
     * @param contractFacets Value for List of Object
     */
    @JsonSetter("contract_facets")
    public void setContractFacets(List<Object> contractFacets) {
        this.contractFacets = contractFacets;
    }

    /**
     * Getter for PostingRequirements.
     * Dynamic posting requirements for MC products, used to provide additional data with vacancies
     * @return Returns the List of FacetModel
     */
    @JsonGetter("posting_requirements")
    public List<FacetModel> getPostingRequirements() {
        return postingRequirements;
    }

    /**
     * Setter for PostingRequirements.
     * Dynamic posting requirements for MC products, used to provide additional data with vacancies
     * @param postingRequirements Value for List of FacetModel
     */
    @JsonSetter("posting_requirements")
    public void setPostingRequirements(List<FacetModel> postingRequirements) {
        this.postingRequirements = postingRequirements;
    }

    /**
     * Getter for ManualSetupRequired.
     * Some Channels require manual setup done by the end-user. In most such cases,
     * `setup_instructions` should contain HTML
     * @return Returns the boolean
     */
    @JsonGetter("manual_setup_required")
    public boolean getManualSetupRequired() {
        return manualSetupRequired;
    }

    /**
     * Setter for ManualSetupRequired.
     * Some Channels require manual setup done by the end-user. In most such cases,
     * `setup_instructions` should contain HTML
     * @param manualSetupRequired Value for boolean
     */
    @JsonSetter("manual_setup_required")
    public void setManualSetupRequired(boolean manualSetupRequired) {
        this.manualSetupRequired = manualSetupRequired;
    }

    /**
     * Getter for SetupInstructions.
     * Additional setup instructions required to post on the Channel
     * @return Returns the String
     */
    @JsonGetter("setup_instructions")
    public String getSetupInstructions() {
        return setupInstructions;
    }

    /**
     * Setter for SetupInstructions.
     * Additional setup instructions required to post on the Channel
     * @param setupInstructions Value for String
     */
    @JsonSetter("setup_instructions")
    public void setSetupInstructions(String setupInstructions) {
        this.setupInstructions = setupInstructions;
    }

    /**
     * Getter for FeedUrl.
     * Some channels like apec.fr require the user to send the job board an XML url. If not null,
     * this value should be displayed to the user, along with the `setup_instructions`
     * @return Returns the String
     */
    @JsonGetter("feed_url")
    public String getFeedUrl() {
        return feedUrl;
    }

    /**
     * Setter for FeedUrl.
     * Some channels like apec.fr require the user to send the job board an XML url. If not null,
     * this value should be displayed to the user, along with the `setup_instructions`
     * @param feedUrl Value for String
     */
    @JsonSetter("feed_url")
    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    /**
     * Converts this ChannelModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChannelModel [" + "name=" + name + ", url=" + url + ", type=" + type
                + ", mcEnabled=" + mcEnabled + ", contractCredentials=" + contractCredentials
                + ", contractFacets=" + contractFacets + ", postingRequirements="
                + postingRequirements + ", manualSetupRequired=" + manualSetupRequired
                + ", setupInstructions=" + setupInstructions + ", feedUrl=" + feedUrl
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ChannelModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChannelModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, url, type, mcEnabled, contractCredentials,
                contractFacets, postingRequirements, manualSetupRequired, setupInstructions,
                feedUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link ChannelModel}.
     */
    public static class Builder {
        private String name;
        private String url;
        private ChannelTypeEnum type;
        private boolean mcEnabled;
        private List<ContractCredentialModel> contractCredentials;
        private List<Object> contractFacets;
        private List<FacetModel> postingRequirements;
        private boolean manualSetupRequired;
        private String setupInstructions;
        private String feedUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  url  String value for url.
         * @param  type  ChannelTypeEnum value for type.
         * @param  mcEnabled  boolean value for mcEnabled.
         * @param  contractCredentials  List of ContractCredentialModel value for
         *         contractCredentials.
         * @param  contractFacets  List of Object value for contractFacets.
         * @param  postingRequirements  List of FacetModel value for postingRequirements.
         * @param  manualSetupRequired  boolean value for manualSetupRequired.
         * @param  setupInstructions  String value for setupInstructions.
         * @param  feedUrl  String value for feedUrl.
         */
        public Builder(String name, String url, ChannelTypeEnum type, boolean mcEnabled,
                List<ContractCredentialModel> contractCredentials, List<Object> contractFacets,
                List<FacetModel> postingRequirements, boolean manualSetupRequired,
                String setupInstructions, String feedUrl) {
            this.name = name;
            this.url = url;
            this.type = type;
            this.mcEnabled = mcEnabled;
            this.contractCredentials = contractCredentials;
            this.contractFacets = contractFacets;
            this.postingRequirements = postingRequirements;
            this.manualSetupRequired = manualSetupRequired;
            this.setupInstructions = setupInstructions;
            this.feedUrl = feedUrl;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Setter for mcEnabled.
         * @param  mcEnabled  boolean value for mcEnabled.
         * @return Builder
         */
        public Builder mcEnabled(boolean mcEnabled) {
            this.mcEnabled = mcEnabled;
            return this;
        }

        /**
         * Setter for contractCredentials.
         * @param  contractCredentials  List of ContractCredentialModel value for
         *         contractCredentials.
         * @return Builder
         */
        public Builder contractCredentials(List<ContractCredentialModel> contractCredentials) {
            this.contractCredentials = contractCredentials;
            return this;
        }

        /**
         * Setter for contractFacets.
         * @param  contractFacets  List of Object value for contractFacets.
         * @return Builder
         */
        public Builder contractFacets(List<Object> contractFacets) {
            this.contractFacets = contractFacets;
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
         * Setter for manualSetupRequired.
         * @param  manualSetupRequired  boolean value for manualSetupRequired.
         * @return Builder
         */
        public Builder manualSetupRequired(boolean manualSetupRequired) {
            this.manualSetupRequired = manualSetupRequired;
            return this;
        }

        /**
         * Setter for setupInstructions.
         * @param  setupInstructions  String value for setupInstructions.
         * @return Builder
         */
        public Builder setupInstructions(String setupInstructions) {
            this.setupInstructions = setupInstructions;
            return this;
        }

        /**
         * Setter for feedUrl.
         * @param  feedUrl  String value for feedUrl.
         * @return Builder
         */
        public Builder feedUrl(String feedUrl) {
            this.feedUrl = feedUrl;
            return this;
        }

        /**
         * Builds a new {@link ChannelModel} object using the set fields.
         * @return {@link ChannelModel}
         */
        public ChannelModel build() {
            return new ChannelModel(name, url, type, mcEnabled, contractCredentials, contractFacets,
                    postingRequirements, manualSetupRequired, setupInstructions, feedUrl);
        }
    }
}
