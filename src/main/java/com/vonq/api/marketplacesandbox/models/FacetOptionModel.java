/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for FacetOptionModel type.
 */
public class FacetOptionModel
        extends BaseModel {
    private String mDefault;
    private String key;
    private String label;
    private String sort;
    private List<FacetOptionShowFacetsModel> show;

    /**
     * Default constructor.
     */
    public FacetOptionModel() {
    }

    /**
     * Initialization constructor.
     * @param  mDefault  String value for mDefault.
     * @param  key  String value for key.
     * @param  label  String value for label.
     * @param  sort  String value for sort.
     * @param  show  List of FacetOptionShowFacetsModel value for show.
     */
    public FacetOptionModel(
            String mDefault,
            String key,
            String label,
            String sort,
            List<FacetOptionShowFacetsModel> show) {
        this.mDefault = mDefault;
        this.key = key;
        this.label = label;
        this.sort = sort;
        this.show = show;
    }

    /**
     * Getter for Default.
     * Whether the option should be the default choice when rendering the SELECT.
     * @return Returns the String
     */
    @JsonGetter("default")
    public String getDefault() {
        return mDefault;
    }

    /**
     * Setter for Default.
     * Whether the option should be the default choice when rendering the SELECT.
     * @param mDefault Value for String
     */
    @JsonSetter("default")
    public void setDefault(String mDefault) {
        this.mDefault = mDefault;
    }

    /**
     * Getter for Key.
     * The value to be used when setting the value of the facet when this option is selected.
     * @return Returns the String
     */
    @JsonGetter("key")
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * The value to be used when setting the value of the facet when this option is selected.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Label.
     * The option's user-friendly label
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * The option's user-friendly label
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for Sort.
     * The order of the option in the list of options. lower value means higher rank.
     * @return Returns the String
     */
    @JsonGetter("sort")
    public String getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * The order of the option in the list of options. lower value means higher rank.
     * @param sort Value for String
     */
    @JsonSetter("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Getter for Show.
     * References to Facets that becomes required when this option is selected
     * @return Returns the List of FacetOptionShowFacetsModel
     */
    @JsonGetter("show")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FacetOptionShowFacetsModel> getShow() {
        return show;
    }

    /**
     * Setter for Show.
     * References to Facets that becomes required when this option is selected
     * @param show Value for List of FacetOptionShowFacetsModel
     */
    @JsonSetter("show")
    public void setShow(List<FacetOptionShowFacetsModel> show) {
        this.show = show;
    }

    /**
     * Converts this FacetOptionModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FacetOptionModel [" + "mDefault=" + mDefault + ", key=" + key + ", label=" + label
                + ", sort=" + sort + ", show=" + show + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FacetOptionModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FacetOptionModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mDefault, key, label, sort)
                .show(getShow());
        return builder;
    }

    /**
     * Class to build instances of {@link FacetOptionModel}.
     */
    public static class Builder {
        private String mDefault;
        private String key;
        private String label;
        private String sort;
        private List<FacetOptionShowFacetsModel> show;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mDefault  String value for mDefault.
         * @param  key  String value for key.
         * @param  label  String value for label.
         * @param  sort  String value for sort.
         */
        public Builder(String mDefault, String key, String label, String sort) {
            this.mDefault = mDefault;
            this.key = key;
            this.label = label;
            this.sort = sort;
        }

        /**
         * Setter for mDefault.
         * @param  mDefault  String value for mDefault.
         * @return Builder
         */
        public Builder mDefault(String mDefault) {
            this.mDefault = mDefault;
            return this;
        }

        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Setter for sort.
         * @param  sort  String value for sort.
         * @return Builder
         */
        public Builder sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Setter for show.
         * @param  show  List of FacetOptionShowFacetsModel value for show.
         * @return Builder
         */
        public Builder show(List<FacetOptionShowFacetsModel> show) {
            this.show = show;
            return this;
        }

        /**
         * Builds a new {@link FacetOptionModel} object using the set fields.
         * @return {@link FacetOptionModel}
         */
        public FacetOptionModel build() {
            return new FacetOptionModel(mDefault, key, label, sort, show);
        }
    }
}
