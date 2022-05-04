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
 * EmploymentTypeEnum to be used.
 */
public enum EmploymentTypeEnum {
    PERMANENT,

    TEMPORARY,

    FIXED_TERM,

    FIXED_TERM_WITH_OPTION_FOR_PERMANENT,

    FREELANCE,

    TRAINEESHIP,

    INTERNSHIP;


    private static TreeMap<String, EmploymentTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PERMANENT.value = "permanent";
        TEMPORARY.value = "temporary";
        FIXED_TERM.value = "fixed_term";
        FIXED_TERM_WITH_OPTION_FOR_PERMANENT.value = "fixed_term_with_option_for_permanent";
        FREELANCE.value = "freelance";
        TRAINEESHIP.value = "traineeship";
        INTERNSHIP.value = "internship";

        valueMap.put("permanent", PERMANENT);
        valueMap.put("temporary", TEMPORARY);
        valueMap.put("fixed_term", FIXED_TERM);
        valueMap.put("fixed_term_with_option_for_permanent", FIXED_TERM_WITH_OPTION_FOR_PERMANENT);
        valueMap.put("freelance", FREELANCE);
        valueMap.put("traineeship", TRAINEESHIP);
        valueMap.put("internship", INTERNSHIP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static EmploymentTypeEnum fromString(String toConvert) {
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
     * Convert list of EmploymentTypeEnum values to list of string values.
     * @param toConvert The list of EmploymentTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EmploymentTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EmploymentTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 