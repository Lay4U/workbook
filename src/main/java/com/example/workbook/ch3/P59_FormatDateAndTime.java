package com.example.workbook.ch3;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class P59_FormatDateAndTime {
    public void playground(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = formatter.format(date);

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String stringLD = formatterLocalDate.format(localDate);

        stringLD = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String stringLT = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        String stringLDT = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String stringZDT = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSZ"));

        String stringODT = OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSZ"));

        String stringOT = OffsetTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSSZ"));

        LocalDateTime now = LocalDateTime.now(); //

    }
}
