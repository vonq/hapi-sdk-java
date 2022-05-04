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
 * SortByEnum to be used.
 */
public enum SortByEnum {
    RELEVANT,

    RECENT,

    ENUM_ORDER_FREQUENCYDESC,

    ENUM_ORDER_FREQUENCYASC,

    ENUM_CREATEDDESC,

    ENUM_CREATEDASC,

    ENUM_LIST_PRICEDESC,

    ENUM_LIST_PRICEASC;


    private static TreeMap<String, SortByEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        RELEVANT.value = "relevant";
        RECENT.value = "recent";
        ENUM_ORDER_FREQUENCYDESC.value = "order_frequency.desc";
        ENUM_ORDER_FREQUENCYASC.value = "order_frequency.asc";
        ENUM_CREATEDDESC.value = "created.desc";
        ENUM_CREATEDASC.value = "created.asc";
        ENUM_LIST_PRICEDESC.value = "list_price.desc";
        ENUM_LIST_PRICEASC.value = "list_price.asc";

        valueMap.put("relevant", RELEVANT);
        valueMap.put("recent", RECENT);
        valueMap.put("order_frequency.desc", ENUM_ORDER_FREQUENCYDESC);
        valueMap.put("order_frequency.asc", ENUM_ORDER_FREQUENCYASC);
        valueMap.put("created.desc", ENUM_CREATEDDESC);
        valueMap.put("created.asc", ENUM_CREATEDASC);
        valueMap.put("list_price.desc", ENUM_LIST_PRICEDESC);
        valueMap.put("list_price.asc", ENUM_LIST_PRICEASC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortByEnum fromString(String toConvert) {
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
     * Convert list of SortByEnum values to list of string values.
     * @param toConvert The list of SortByEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SortByEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SortByEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 