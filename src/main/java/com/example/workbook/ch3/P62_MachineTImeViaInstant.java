package com.example.workbook.ch3;

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class P62_MachineTImeViaInstant {
    public void playground(){
        Instant timestamp = Instant.now();
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        Clock clock = Clock.systemUTC();

        Instant timestampFromString = Instant.parse("2019-02-24T10:15:30.197021300Z");

        Instant twoHourLater = Instant.now().plus(2, ChronoUnit.HOURS);
        Instant tenMinutesEarlier = Instant.now().minus(10, ChronoUnit.MINUTES);

        Instant timestamp1 = Instant.now();
        Instant timestamp2 = timestamp1.plusSeconds(10);
        boolean isAfter = timestamp1.isAfter(timestamp2);
        boolean isBefore = timestamp1.isBefore(timestamp2);
        long difference = timestamp1.until(timestamp2, ChronoUnit.SECONDS);

    }
}
