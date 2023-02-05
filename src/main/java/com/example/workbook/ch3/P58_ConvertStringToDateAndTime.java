package com.example.workbook.ch3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class P58_ConvertStringToDateAndTime {
    public void playground(){
        LocalDate localDate = LocalDate.parse("2020-06-01");
        LocalTime localTime = LocalTime.parse("12:23:44");
        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T12:23:44");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-06-01T12:23:44+01:00[Asia/Seoul]");
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2020-06-01T12:23:44+01:00");
        OffsetTime offsetTime = OffsetTime.parse("12:23:44+01:00");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate1 = LocalDate.parse("01.06.2020", dateTimeFormatter);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime1 = LocalTime.parse("12|23|44", timeFormatter);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH|mm|ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse("01.06.2020 12|23|44", dateTimeFormatter1);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH|mm|ssXXXXX '[VV']'");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("01.06.2020 12|23|44+01:00 [Asia/Seoul]", dateTimeFormatter2);


    }
}
