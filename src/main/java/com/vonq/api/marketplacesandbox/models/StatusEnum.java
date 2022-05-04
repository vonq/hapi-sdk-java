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
 * StatusEnum to be used.
 */
public enum StatusEnum {
    ONLINE,

    OFFLINE,

    ENUM_IN_PROGRESS;


    private static TreeMap<String, StatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ONLINE.value = "online";
        OFFLINE.value = "offline";
        ENUM_IN_PROGRESS.value = "in progress";

        valueMap.put("online", ONLINE);
        valueMap.put("offline", OFFLINE);
        valueMap.put("in progress", ENUM_IN_PROGRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StatusEnum fromString(String toConvert) {
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
     * Convert list of StatusEnum values to list of string values.
     * @param toConvert The list of StatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<StatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (StatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 