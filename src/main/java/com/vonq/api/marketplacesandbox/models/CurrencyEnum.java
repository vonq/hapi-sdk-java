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
 * CurrencyEnum to be used.
 */
public enum CurrencyEnum {
    EUR,

    USD,

    GBP;


    private static TreeMap<String, CurrencyEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        EUR.value = "EUR";
        USD.value = "USD";
        GBP.value = "GBP";

        valueMap.put("EUR", EUR);
        valueMap.put("USD", USD);
        valueMap.put("GBP", GBP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CurrencyEnum fromString(String toConvert) {
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
     * Convert list of CurrencyEnum values to list of string values.
     * @param toConvert The list of CurrencyEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CurrencyEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CurrencyEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 