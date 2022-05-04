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
 * RuleEnum to be used.
 */
public enum RuleEnum {
    DATE,

    EMAIL,

    ENUM_INT,

    ENUM_FLOAT,

    REGEX,

    LOWER,

    HIGHER,

    MIN,

    MAX,

    MINITEMS,

    MAXITEMS,

    MINLENGTH,

    MAXLENGTH,

    BEFORE,

    AFTER,

    URL,

    BEPC,

    BELGIUMCITY,

    DECITY,

    DUTCHCITY,

    ISODATEOPTIONALTIE,

    MAXLENGTHCOMBINED,

    MAXLEVELS,

    NLPC,

    NLPCSTRAAT,

    NOTEQUAL,

    PROPERTYID,

    PUSHVALUE,

    SEPARATOR,

    UKPC,

    ENUM_VALIDATORCHECKKEYWORDS,

    ENUM_VALIDATORINRANGE,

    ENUM_VALIDATORKRUISPUNT,

    ENUM_VALIDATORNOTEMPTYIF;


    private static TreeMap<String, RuleEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DATE.value = "date";
        EMAIL.value = "email";
        ENUM_INT.value = "int";
        ENUM_FLOAT.value = "float";
        REGEX.value = "regex";
        LOWER.value = "lower";
        HIGHER.value = "higher";
        MIN.value = "min";
        MAX.value = "max";
        MINITEMS.value = "minitems";
        MAXITEMS.value = "maxitems";
        MINLENGTH.value = "minlength";
        MAXLENGTH.value = "maxlength";
        BEFORE.value = "before";
        AFTER.value = "after";
        URL.value = "url";
        BEPC.value = "be-pc";
        BELGIUMCITY.value = "belgiumcity";
        DECITY.value = "de-city";
        DUTCHCITY.value = "dutchcity";
        ISODATEOPTIONALTIE.value = "isodateoptionaltie";
        MAXLENGTHCOMBINED.value = "maxlengthcombined";
        MAXLEVELS.value = "maxlevels";
        NLPC.value = "nl-pc";
        NLPCSTRAAT.value = "nl-pc-straat";
        NOTEQUAL.value = "notequal";
        PROPERTYID.value = "propertyId";
        PUSHVALUE.value = "pushvalue";
        SEPARATOR.value = "separator";
        UKPC.value = "uk-pc";
        ENUM_VALIDATORCHECKKEYWORDS.value = "validator:checkKeywords";
        ENUM_VALIDATORINRANGE.value = "validator:inRange";
        ENUM_VALIDATORKRUISPUNT.value = "validator:kruispunt";
        ENUM_VALIDATORNOTEMPTYIF.value = "validator:notEmptyIf";

        valueMap.put("date", DATE);
        valueMap.put("email", EMAIL);
        valueMap.put("int", ENUM_INT);
        valueMap.put("float", ENUM_FLOAT);
        valueMap.put("regex", REGEX);
        valueMap.put("lower", LOWER);
        valueMap.put("higher", HIGHER);
        valueMap.put("min", MIN);
        valueMap.put("max", MAX);
        valueMap.put("minitems", MINITEMS);
        valueMap.put("maxitems", MAXITEMS);
        valueMap.put("minlength", MINLENGTH);
        valueMap.put("maxlength", MAXLENGTH);
        valueMap.put("before", BEFORE);
        valueMap.put("after", AFTER);
        valueMap.put("url", URL);
        valueMap.put("be-pc", BEPC);
        valueMap.put("belgiumcity", BELGIUMCITY);
        valueMap.put("de-city", DECITY);
        valueMap.put("dutchcity", DUTCHCITY);
        valueMap.put("isodateoptionaltie", ISODATEOPTIONALTIE);
        valueMap.put("maxlengthcombined", MAXLENGTHCOMBINED);
        valueMap.put("maxlevels", MAXLEVELS);
        valueMap.put("nl-pc", NLPC);
        valueMap.put("nl-pc-straat", NLPCSTRAAT);
        valueMap.put("notequal", NOTEQUAL);
        valueMap.put("propertyId", PROPERTYID);
        valueMap.put("pushvalue", PUSHVALUE);
        valueMap.put("separator", SEPARATOR);
        valueMap.put("uk-pc", UKPC);
        valueMap.put("validator:checkKeywords", ENUM_VALIDATORCHECKKEYWORDS);
        valueMap.put("validator:inRange", ENUM_VALIDATORINRANGE);
        valueMap.put("validator:kruispunt", ENUM_VALIDATORKRUISPUNT);
        valueMap.put("validator:notEmptyIf", ENUM_VALIDATORNOTEMPTYIF);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RuleEnum fromString(String toConvert) {
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
     * Convert list of RuleEnum values to list of string values.
     * @param toConvert The list of RuleEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RuleEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RuleEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 