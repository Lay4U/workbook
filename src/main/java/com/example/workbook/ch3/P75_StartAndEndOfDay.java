package com.example.workbook.ch3;

import java.time.*;
import java.time.temporal.ChronoField;

public class P75_StartAndEndOfDay {
    public void playground() {
        LocalDate localDate = LocalDate.of(2019, 2, 28);

        LocalDateTime ldDayStart = localDate.atStartOfDay();
        LocalDateTime ldDayStart2 = LocalDateTime.of(localDate, LocalTime.MIN);

        LocalDateTime ldDayEnd = localDate.atTime(LocalTime.MAX);
        LocalDateTime ldDayEnd2 = LocalTime.MAX.atDate(localDate);

        ZonedDateTime ldDayStartZone = localDate.atStartOfDay(ZoneId.of("Austrailia/Perth"));
        ZonedDateTime ldDayStartZone2 = LocalDateTime.of(localDate, LocalTime.MIN).atZone(ZoneId.of("Austrailia/Perth"));

        ZonedDateTime ldDayEndZone = localDate.atTime(LocalTime.MAX).atZone(ZoneId.of("Austrailia/Perth"));
        ZonedDateTime ldDayEndZone2 = LocalTime.MAX.atDate(localDate).atZone(ZoneId.of("Austrailia/Perth"));

        LocalDateTime localDateTime = LocalDateTime.of(2019, 2, 28, 18, 0, 0);

        LocalDateTime ldtDayStart = localDateTime.with(ChronoField.NANO_OF_DAY, LocalTime.MIN.toNanoOfDay());
        LocalDateTime ldtDayStart2 = localDateTime.with(ChronoField.HOUR_OF_DAY, 0);

        LocalDateTime ldtDayEnd = localDateTime.with(ChronoField.NANO_OF_DAY, LocalTime.MAX.toNanoOfDay());

    }
}
