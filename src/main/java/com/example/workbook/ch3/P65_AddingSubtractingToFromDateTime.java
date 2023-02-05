package com.example.workbook.ch3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class P65_AddingSubtractingToFromDateTime {
    public void playground(){
        LocalDateTime ldt = LocalDateTime.now();

        LocalDateTime ldtAfterAddingMinutes = ldt.plusMinutes(10);
        LocalDateTime ldtAfterSubtractingMinutes = ldt.minusMinutes(10);

        Instant timestamp = Instant.now();
        Instant timestampAfterAddingHours = timestamp.plus(5, ChronoUnit.HOURS);
        Instant timestampAfterSubtractingHours = timestamp.minus(5, ChronoUnit.HOURS);

    }
}
