package com.example.workbook.ch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class P61_LocalDateTimeFromLcalDateAndLocalTime {
    public void playground(){
        LocalDateTime ldt = LocalDateTime.of(2020, 4, 1, 12, 33, 21, 675);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        String localDateTimeAsString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a"));
    }
}
