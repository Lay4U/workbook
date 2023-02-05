package com.example.workbook.ch3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class P70_FindFirstAndLastDayOfMonth {
    public void playground(){
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 27);

        LocalDate firstDayOfFeb = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfFeb = date.with(TemporalAdjusters.lastDayOfMonth());

        LocalDate datePlus21Days = getDayAfterDays(date, 21);

        LocalDate nextSaturday = date.with(NEXT_SATURDAY);
    }

    public LocalDate getDayAfterDays(LocalDate startDate, int days){
        Period period = Period.ofDays(days);
        TemporalAdjuster ta = p -> p.plus(period);
        LocalDate endDate = startDate.with(ta);
        return endDate;
    }

    static TemporalAdjuster NEXT_SATURDAY = TemporalAdjusters.ofDateAdjuster(today -> {
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return today;
        }

        if (dayOfWeek == DayOfWeek.SUNDAY){
            return today.plusDays(6);
        }

        return today.plusDays(6 - dayOfWeek.getValue());
    });

    public class NextSaturdayAdjusters implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dayOfWeek = DayOfWeek.from(temporal);

            if (dayOfWeek == DayOfWeek.SATURDAY) {
                return temporal;
            }

            if (dayOfWeek == DayOfWeek.SUNDAY){
                return temporal.plus(6, ChronoUnit.DAYS);
            }

            return temporal.plus(6 - dayOfWeek.getValue(), ChronoUnit.DAYS);
        }
    }
}
