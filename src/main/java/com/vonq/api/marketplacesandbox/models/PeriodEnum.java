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
 * PeriodEnum to be used.
 */
public enum PeriodEnum {
    YEARLY,

    MONTHLY;


    private static TreeMap<String, PeriodEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        YEARLY.value = "yearly";
        MONTHLY.value = "monthly";

        valueMap.put("yearly", YEARLY);
        valueMap.put("monthly", MONTHLY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PeriodEnum fromString(String toConvert) {
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
     * Convert list of PeriodEnum values to list of string values.
     * @param toConvert The list of PeriodEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PeriodEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PeriodEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 