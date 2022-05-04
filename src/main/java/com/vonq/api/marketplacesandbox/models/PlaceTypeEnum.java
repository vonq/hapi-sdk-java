/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * PlaceTypeEnum to be used.
 */
public enum PlaceTypeEnum {
    PLACE,

    DISTRICT,

    REGION,

    COUNTRY,

    CONTINENT,

    WORLD;


    private static TreeMap<String, PlaceTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PLACE.value = "place";
        DISTRICT.value = "district";
        REGION.value = "region";
        COUNTRY.value = "country";
        CONTINENT.value = "continent";
        WORLD.value = "world";

        valueMap.put("place", PLACE);
        valueMap.put("district", DISTRICT);
        valueMap.put("region", REGION);
        valueMap.put("country", COUNTRY);
        valueMap.put("continent", CONTINENT);
        valueMap.put("world", WORLD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PlaceTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of PlaceTypeEnum values to list of string values.
     * @param toConvert The list of PlaceTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PlaceTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PlaceTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 