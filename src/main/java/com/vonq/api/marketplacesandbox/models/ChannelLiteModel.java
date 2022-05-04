/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ChannelLiteModel type.
 */
public class ChannelLiteModel
        extends BaseModel {
    private boolean mcEnabled;
    private int id;
    private String name;
    private String url;
    private String type;

    /**
     * Default constructor.
     */
    public ChannelLiteModel() {
    }

    /**
     * Initialization constructor.
     * @param  mcEnabled  boolean value for mcEnabled.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  url  String value for url.
     * @param  type  String value for type.
     */
    public ChannelLiteModel(
            boolean mcEnabled,
            int id,
            String name,
            String url,
            String type) {
        this.mcEnabled = mcEnabled;
        this.id = id;
        this.name = name;
        this.url = url;
        this.type = type;
    }

    /**
     * Getter for McEnabled.
     * @return Returns the boolean
     */
    @JsonGetter("mc_enabled")
    public boolean getMcEnabled() {
        return mcEnabled;
    }

    /**
     * Setter for McEnabled.
     * @param mcEnabled Value for boolean
     */
    @JsonSetter("mc_enabled")
    public void setMcEnabled(boolean mcEnabled) {
        this.mcEnabled = mcEnabled;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this ChannelLiteModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChannelLiteModel [" + "mcEnabled=" + mcEnabled + ", id=" + id + ", name=" + name
                + ", url=" + url + ", type=" + type + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ChannelLiteModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChannelLiteModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mcEnabled, id, name, url, type);
        return builder;
    }

    /**
     * Class to build instances of {@link ChannelLiteModel}.
     */
    public static class Builder {
        private boolean mcEnabled;
        private int id;
        private String name;
        private String url;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mcEnabled  boolean value for mcEnabled.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  url  String value for url.
         * @param  type  String value for type.
         */
        public Builder(boolean mcEnabled, int id, String name, String url, String type) {
            this.mcEnabled = mcEnabled;
            this.id = id;
            this.name = name;
            this.url = url;
            this.type = type;
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
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
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
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link ChannelLiteModel} object using the set fields.
         * @return {@link ChannelLiteModel}
         */
        public ChannelLiteModel build() {
            return new ChannelLiteModel(mcEnabled, id, name, url, type);
        }
    }
}
