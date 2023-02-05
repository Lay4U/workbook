package com.example.workbook.ch3;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class P63_DefinePeriodOrDuraionUsingTime {
    public void playground(){
        // Period
        Period fromDays = Period.ofDays(120);

        Period periodFromUnits = Period.of(2000, 11, 24);

        LocalDate localDate = LocalDate.now();
        Period periodFromLocalDate = Period.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());

        Period periodFromString = Period.parse("P2019Y2M25D");

        LocalDate startLocalDate = LocalDate.of(2018, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2020, 5, 24);
        Period periodBetween = Period.between(startLocalDate, endLocalDate); // P2Y2M12D
        periodToYMD(periodBetween); // 2y:2m:12d

        periodBetween.isNegative();

        Period periodBetweenPlus1Year = periodBetween.plusYears(1);

        Period p1 = Period.ofDays(5);
        Period p2 = Period.ofDays(10);
        Period p3 = p1.plus(p2); // P15D

    }

    public String periodToYMD(Period period){
        StringBuilder sb = new StringBuilder();
        sb.append(period.getYears())
                .append("y:")
                .append(period.getMonths())
                .append("m:")
                .append(period.getDays())
                .append("d");
        return sb.toString();
    }

    public void playground2(){
        // Duration
        Duration fromHours = Duration.ofHours(10);
        Duration fromMinutes = Duration.of(3, ChronoUnit.MINUTES);

        LocalDateTime localDateTime = LocalDateTime.of(2018, 3, 12, 4, 14, 20, 670);
        Duration fromLocalDateTime = Duration.ofMinutes(localDateTime.getMinute());

        LocalTime localTime = LocalTime.of(4, 14, 20, 670);
        Duration fromFlocalTime = Duration.ofNanos(localTime.getNano());

        Duration durationFromString = Duration.parse("P2DT3H4M");

        Instant startInstant = Instant.parse("2015-05-03T10:15:30.00Z");
        Instant endInstant = Instant.parse("2015-05-03T10:16:30.00Z");
        Duration durationBetweenInstant = Duration.between(startInstant, endInstant);// PT1M
        durationBetweenInstant.getSeconds(); // 60

        LocalDateTime startLocaDateTime = LocalDateTime.of(2018, 3, 12, 4, 14, 20, 670);
        LocalDateTime endLocalDateTime = LocalDateTime.of(2019, 7, 20, 6, 10, 10, 720);
        Duration durationBetweenLocalDateTime = Duration.between(startLocaDateTime, endLocalDateTime); // PT1H55M50.050S


    }

    public String durationToDHMSN(Duration duration){
        StringBuilder sb = new StringBuilder();
        sb.append(duration.toDays())
                .append("d:")
                .append(duration.toHours())
                .append("h:")
                .append(duration.toMinutes())
                .append("m:")
                .append(duration.getSeconds())
                .append("s:")
                .append(duration.getNano())
                .append("n");
        return sb.toString();
    }
}
