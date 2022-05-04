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
 * AudienceGroupEnum to be used.
 */
public enum AudienceGroupEnum {
    GENERIC,

    NICHE;


    private static TreeMap<String, AudienceGroupEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        GENERIC.value = "generic";
        NICHE.value = "niche";

        valueMap.put("generic", GENERIC);
        valueMap.put("niche", NICHE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static AudienceGroupEnum fromString(String toConvert) {
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
     * Convert list of AudienceGroupEnum values to list of string values.
     * @param toConvert The list of AudienceGroupEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AudienceGroupEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AudienceGroupEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 