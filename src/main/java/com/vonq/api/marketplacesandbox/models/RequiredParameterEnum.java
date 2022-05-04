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
 * RequiredParameterEnum to be used.
 */
public enum RequiredParameterEnum {
    TERM,

    CREDENTIALS;


    private static TreeMap<String, RequiredParameterEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        TERM.value = "term";
        CREDENTIALS.value = "credentials";

        valueMap.put("term", TERM);
        valueMap.put("credentials", CREDENTIALS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RequiredParameterEnum fromString(String toConvert) {
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
     * Convert list of RequiredParameterEnum values to list of string values.
     * @param toConvert The list of RequiredParameterEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RequiredParameterEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RequiredParameterEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 