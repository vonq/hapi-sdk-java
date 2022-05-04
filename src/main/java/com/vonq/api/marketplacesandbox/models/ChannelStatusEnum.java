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
 * ChannelStatusEnum to be used.
 */
public enum ChannelStatusEnum {
    ONLINE,

    OFFLINE,

    ENUM_IN_PROGRESS,

    ENUM_NOT_PROCESSED;


    private static TreeMap<String, ChannelStatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ONLINE.value = "online";
        OFFLINE.value = "offline";
        ENUM_IN_PROGRESS.value = "in progress";
        ENUM_NOT_PROCESSED.value = "not processed";

        valueMap.put("online", ONLINE);
        valueMap.put("offline", OFFLINE);
        valueMap.put("in progress", ENUM_IN_PROGRESS);
        valueMap.put("not processed", ENUM_NOT_PROCESSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ChannelStatusEnum fromString(String toConvert) {
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
     * Convert list of ChannelStatusEnum values to list of string values.
     * @param toConvert The list of ChannelStatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ChannelStatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ChannelStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 