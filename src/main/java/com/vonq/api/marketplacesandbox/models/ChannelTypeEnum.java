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
 * ChannelTypeEnum to be used.
 */
public enum ChannelTypeEnum {
    ENUM_JOB_BOARD,

    ENUM_SOCIAL_MEDIA,

    COMMUNITY,

    PUBLICATION,

    AGGREGATOR;


    private static TreeMap<String, ChannelTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_JOB_BOARD.value = "job board";
        ENUM_SOCIAL_MEDIA.value = "social media";
        COMMUNITY.value = "community";
        PUBLICATION.value = "publication";
        AGGREGATOR.value = "aggregator";

        valueMap.put("job board", ENUM_JOB_BOARD);
        valueMap.put("social media", ENUM_SOCIAL_MEDIA);
        valueMap.put("community", COMMUNITY);
        valueMap.put("publication", PUBLICATION);
        valueMap.put("aggregator", AGGREGATOR);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ChannelTypeEnum fromString(String toConvert) {
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
     * Convert list of ChannelTypeEnum values to list of string values.
     * @param toConvert The list of ChannelTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ChannelTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ChannelTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 