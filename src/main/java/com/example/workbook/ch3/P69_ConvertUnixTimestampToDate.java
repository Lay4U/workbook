package com.example.workbook.ch3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class P69_ConvertUnixTimestampToDate {
    long unixTimestamp = 1573768800;

    public void playground(){
        Date date = new Date(unixTimestamp * 1000);
        Date date1 = new Date(TimeUnit.MILLISECONDS.convert(unixTimestamp, TimeUnit.SECONDS));

        Instant instant = Instant.ofEpochSecond(unixTimestamp);
        Date date2 = Date.from(instant);

        LocalDateTime date3 = LocalDateTime.ofInstant(instant, ZoneId.of("Australia/Perth"));
        ZonedDateTime date4 = ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Bucharest"));


    }
}
