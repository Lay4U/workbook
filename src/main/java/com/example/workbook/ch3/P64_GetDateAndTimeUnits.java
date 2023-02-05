package com.example.workbook.ch3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class P64_GetDateAndTimeUnits {
    public void playground(){
        LocalDateTime ldt = LocalDateTime.now();

        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();

        int yearLDT = ldt.get(ChronoField.YEAR);
        int monthLDT = ldt.get(ChronoField.MONTH_OF_YEAR);
        int dayLDT = ldt.get(ChronoField.DAY_OF_MONTH);
        int hourLDT = ldt.get(ChronoField.HOUR_OF_DAY);
        int minuteLDT = ldt.get(ChronoField.MINUTE_OF_HOUR);
        int secondLDT = ldt.get(ChronoField.SECOND_OF_MINUTE);
        int nanoLDT = ldt.get(ChronoField.NANO_OF_SECOND);

    }
}
