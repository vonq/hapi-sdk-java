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
 * ContentTypeEnum to be used.
 */
public enum ContentTypeEnum {
    ENUM_APPLICATIONJSON;


    private static TreeMap<String, ContentTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_APPLICATIONJSON.value = "application/json";

        valueMap.put("application/json", ENUM_APPLICATIONJSON);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ContentTypeEnum fromString(String toConvert) {
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
     * Convert list of ContentTypeEnum values to list of string values.
     * @param toConvert The list of ContentTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ContentTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ContentTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 