package com.example.workbook.ch3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class P74_CalculatingAge {
    public void playground() {
        LocalDate startLocalDate = LocalDate.of(1993, 12, 9);
        LocalDate endLocalDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(startLocalDate, endLocalDate);

        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        int yearsBetween = periodBetween.getYears();
        int monthsBetween = periodBetween.getMonths();
        int daysBetween = periodBetween.getDays();

    }
}
