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
 * TypeEnum to be used.
 */
public enum TypeEnum {
    AUTOCOMPLETE,

    DATE,

    SELECT,

    TEXT,

    TEXTAREA,

    TEXTEXPAND,

    AREACOUNT,

    HIER,

    STATISCH,

    MULTIPLE,

    SELECTMAP_ONLY;


    private static TreeMap<String, TypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        AUTOCOMPLETE.value = "AUTOCOMPLETE";
        DATE.value = "DATE";
        SELECT.value = "SELECT";
        TEXT.value = "TEXT";
        TEXTAREA.value = "TEXTAREA";
        TEXTEXPAND.value = "TEXTEXPAND";
        AREACOUNT.value = "AREACOUNT";
        HIER.value = "HIER";
        STATISCH.value = "STATISCH";
        MULTIPLE.value = "MULTIPLE";
        SELECTMAP_ONLY.value = "SELECT-MAP_ONLY";

        valueMap.put("AUTOCOMPLETE", AUTOCOMPLETE);
        valueMap.put("DATE", DATE);
        valueMap.put("SELECT", SELECT);
        valueMap.put("TEXT", TEXT);
        valueMap.put("TEXTAREA", TEXTAREA);
        valueMap.put("TEXTEXPAND", TEXTEXPAND);
        valueMap.put("AREACOUNT", AREACOUNT);
        valueMap.put("HIER", HIER);
        valueMap.put("STATISCH", STATISCH);
        valueMap.put("MULTIPLE", MULTIPLE);
        valueMap.put("SELECT-MAP_ONLY", SELECTMAP_ONLY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static TypeEnum fromString(String toConvert) {
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
     * Convert list of TypeEnum values to list of string values.
     * @param toConvert The list of TypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 