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
 * This is a model class for LocationModel type.
 */
public class LocationModel
        extends BaseModel {
    private double id;
    private String fullyQualifiedPlaceName;
    private String canonicalName;
    private List<Double> boundingBox;
    private double area;
    private PlaceTypeEnum placeType;
    private LocationModel within;

    /**
     * Default constructor.
     */
    public LocationModel() {
    }

    /**
     * Initialization constructor.
     * @param  id  double value for id.
     * @param  fullyQualifiedPlaceName  String value for fullyQualifiedPlaceName.
     * @param  canonicalName  String value for canonicalName.
     * @param  boundingBox  List of Double value for boundingBox.
     * @param  area  double value for area.
     * @param  placeType  PlaceTypeEnum value for placeType.
     * @param  within  LocationModel value for within.
     */
    public LocationModel(
            double id,
            String fullyQualifiedPlaceName,
            String canonicalName,
            List<Double> boundingBox,
            double area,
            PlaceTypeEnum placeType,
            LocationModel within) {
        this.id = id;
        this.fullyQualifiedPlaceName = fullyQualifiedPlaceName;
        this.canonicalName = canonicalName;
        this.boundingBox = boundingBox;
        this.area = area;
        this.placeType = placeType;
        this.within = within;
    }

    /**
     * Getter for Id.
     * @return Returns the double
     */
    @JsonGetter("id")
    public double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for double
     */
    @JsonSetter("id")
    public void setId(double id) {
        this.id = id;
    }

    /**
     * Getter for FullyQualifiedPlaceName.
     * @return Returns the String
     */
    @JsonGetter("fully_qualified_place_name")
    public String getFullyQualifiedPlaceName() {
        return fullyQualifiedPlaceName;
    }

    /**
     * Setter for FullyQualifiedPlaceName.
     * @param fullyQualifiedPlaceName Value for String
     */
    @JsonSetter("fully_qualified_place_name")
    public void setFullyQualifiedPlaceName(String fullyQualifiedPlaceName) {
        this.fullyQualifiedPlaceName = fullyQualifiedPlaceName;
    }

    /**
     * Getter for CanonicalName.
     * @return Returns the String
     */
    @JsonGetter("canonical_name")
    public String getCanonicalName() {
        return canonicalName;
    }

    /**
     * Setter for CanonicalName.
     * @param canonicalName Value for String
     */
    @JsonSetter("canonical_name")
    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    /**
     * Getter for BoundingBox.
     * @return Returns the List of Double
     */
    @JsonGetter("bounding_box")
    public List<Double> getBoundingBox() {
        return boundingBox;
    }

    /**
     * Setter for BoundingBox.
     * @param boundingBox Value for List of Double
     */
    @JsonSetter("bounding_box")
    public void setBoundingBox(List<Double> boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * Getter for Area.
     * @return Returns the double
     */
    @JsonGetter("area")
    public double getArea() {
        return area;
    }

    /**
     * Setter for Area.
     * @param area Value for double
     */
    @JsonSetter("area")
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Getter for PlaceType.
     * @return Returns the PlaceTypeEnum
     */
    @JsonGetter("place_type")
    public PlaceTypeEnum getPlaceType() {
        return placeType;
    }

    /**
     * Setter for PlaceType.
     * @param placeType Value for PlaceTypeEnum
     */
    @JsonSetter("place_type")
    public void setPlaceType(PlaceTypeEnum placeType) {
        this.placeType = placeType;
    }

    /**
     * Getter for Within.
     * @return Returns the LocationModel
     */
    @JsonGetter("within")
    public LocationModel getWithin() {
        return within;
    }

    /**
     * Setter for Within.
     * @param within Value for LocationModel
     */
    @JsonSetter("within")
    public void setWithin(LocationModel within) {
        this.within = within;
    }

    /**
     * Converts this LocationModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LocationModel [" + "id=" + id + ", fullyQualifiedPlaceName="
                + fullyQualifiedPlaceName + ", canonicalName=" + canonicalName + ", boundingBox="
                + boundingBox + ", area=" + area + ", placeType=" + placeType + ", within=" + within
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link LocationModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LocationModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, fullyQualifiedPlaceName, canonicalName, boundingBox, area,
                placeType, within);
        return builder;
    }

    /**
     * Class to build instances of {@link LocationModel}.
     */
    public static class Builder {
        private double id;
        private String fullyQualifiedPlaceName;
        private String canonicalName;
        private List<Double> boundingBox;
        private double area;
        private PlaceTypeEnum placeType;
        private LocationModel within;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  double value for id.
         * @param  fullyQualifiedPlaceName  String value for fullyQualifiedPlaceName.
         * @param  canonicalName  String value for canonicalName.
         * @param  boundingBox  List of Double value for boundingBox.
         * @param  area  double value for area.
         * @param  placeType  PlaceTypeEnum value for placeType.
         * @param  within  LocationModel value for within.
         */
        public Builder(double id, String fullyQualifiedPlaceName, String canonicalName,
                List<Double> boundingBox, double area, PlaceTypeEnum placeType,
                LocationModel within) {
            this.id = id;
            this.fullyQualifiedPlaceName = fullyQualifiedPlaceName;
            this.canonicalName = canonicalName;
            this.boundingBox = boundingBox;
            this.area = area;
            this.placeType = placeType;
            this.within = within;
        }

        /**
         * Setter for id.
         * @param  id  double value for id.
         * @return Builder
         */
        public Builder id(double id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for fullyQualifiedPlaceName.
         * @param  fullyQualifiedPlaceName  String value for fullyQualifiedPlaceName.
         * @return Builder
         */
        public Builder fullyQualifiedPlaceName(String fullyQualifiedPlaceName) {
            this.fullyQualifiedPlaceName = fullyQualifiedPlaceName;
            return this;
        }

        /**
         * Setter for canonicalName.
         * @param  canonicalName  String value for canonicalName.
         * @return Builder
         */
        public Builder canonicalName(String canonicalName) {
            this.canonicalName = canonicalName;
            return this;
        }

        /**
         * Setter for boundingBox.
         * @param  boundingBox  List of Double value for boundingBox.
         * @return Builder
         */
        public Builder boundingBox(List<Double> boundingBox) {
            this.boundingBox = boundingBox;
            return this;
        }

        /**
         * Setter for area.
         * @param  area  double value for area.
         * @return Builder
         */
        public Builder area(double area) {
            this.area = area;
            return this;
        }

        /**
         * Setter for placeType.
         * @param  placeType  PlaceTypeEnum value for placeType.
         * @return Builder
         */
        public Builder placeType(PlaceTypeEnum placeType) {
            this.placeType = placeType;
            return this;
        }

        /**
         * Setter for within.
         * @param  within  LocationModel value for within.
         * @return Builder
         */
        public Builder within(LocationModel within) {
            this.within = within;
            return this;
        }

        /**
         * Builds a new {@link LocationModel} object using the set fields.
         * @return {@link LocationModel}
         */
        public LocationModel build() {
            return new LocationModel(id, fullyQualifiedPlaceName, canonicalName, boundingBox, area,
                    placeType, within);
        }
    }
}
