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
 * RangeEnum to be used.
 */
public enum RangeEnum {
    DAYS,

    MONTHS,

    YEARS;


    private static TreeMap<String, RangeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DAYS.value = "days";
        MONTHS.value = "months";
        YEARS.value = "years";

        valueMap.put("days", DAYS);
        valueMap.put("months", MONTHS);
        valueMap.put("years", YEARS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RangeEnum fromString(String toConvert) {
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
     * Convert list of RangeEnum values to list of string values.
     * @param toConvert The list of RangeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RangeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RangeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 