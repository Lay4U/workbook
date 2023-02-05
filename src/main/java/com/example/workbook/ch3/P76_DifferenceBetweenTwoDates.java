package com.example.workbook.ch3;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class P76_DifferenceBetweenTwoDates {
    public void playground() {
        LocalDate ld1 = LocalDate.of(2018, 1, 1);
        LocalDate ld2 = LocalDate.of(2019, 3, 1);

        long betweenInDays = Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
        long betweenInMonths = Math.abs(ChronoUnit.MONTHS.between(ld1, ld2));
        long betweenInYears = Math.abs(ChronoUnit.YEARS.between(ld1, ld2));

        Period period = ld1.until(ld2);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long untilInDays = Math.abs(ld1.until(ld2, ChronoUnit.DAYS));
        long untilInMonths = Math.abs(ld1.until(ld2, ChronoUnit.MONTHS));
        long untilInYears = Math.abs(ld1.until(ld2, ChronoUnit.YEARS));

        LocalDateTime ldt1 = LocalDateTime.of(2018, 1, 1, 22, 15, 15);
        LocalDateTime ldt2 = LocalDateTime.of(2018, 1, 1, 23, 15, 15);

        long betweenInMinutesWithoutZone = Math.abs(ChronoUnit.MINUTES.between(ldt1, ldt2));
        long untilInMinutesWithZone = Math.abs(ldt1.until(ldt2, ChronoUnit.MINUTES));

        ZonedDateTime zdt1 = ldt1.atZone(ZoneId.of("Europe/Bucharest"));
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("Austrailia/Perth")).plusHours(1);

        long betweenInMinutesWithZone = Math.abs(ChronoUnit.MINUTES.between(zdt1, zdt2));
        long untilInHoursWithZone = Math.abs(zdt1.until(zdt2, ChronoUnit.HOURS));


        ZonedDateTime zdt3 = ldt1.atZone(ZoneId.of("Europe/Bucharest"));
        ZonedDateTime zdt4 = ldt2.atZone(ZoneId.of("Australia/Perth"));

        long betweenInMinutesWithZone2 = Math.abs(ChronoUnit.MINUTES.between(zdt3, zdt4));
        long untilInHoursWithZone2 = Math.abs(zdt3.until(zdt4, ChronoUnit.HOURS));

    }
}
