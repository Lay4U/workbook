package com.example.workbook.ch1;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class P39_CompatNumberFormat {

    public static String forLocale(Locale locale, double number){
        return format(locale, Style.SHORT, null, number);
    }

    public static String forLocaleStyle(
            Locale locale, Style style, double number){
        return format(locale, style, null, number);
    }

    public static String forLocaleStyleRound(
            Locale locale, Style style, RoundingMode mode, double number){
        return format(locale, style, mode, number);
    }

    public static String format(
            Locale locale, Style style, RoundingMode mode, double number){
        if(locale == null || style == null){
            return String.valueOf(number);
        }

        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, style);

        if (mode != null){
            nf.setRoundingMode(mode);
        }

        return nf.format(number);
    }


    public static Number parseLocale(Locale locale, String number) throws ParseException {
        return parse(locale, Style.SHORT, false, number);
    }

    public static Number parseLocaleStyle(Locale locale, Style style, String number) throws ParseException {
        return parse(locale, style, false, number);
    }

    public static Number parse(Locale locale, Style style, boolean grouping, String number) throws ParseException {
        if(locale == null || style == null){
            throw new IllegalArgumentException("Locale/style/number cannot be null");
        }

        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, style);
        nf.setGroupingUsed(grouping);

        return nf.parse(number);
    }

}
