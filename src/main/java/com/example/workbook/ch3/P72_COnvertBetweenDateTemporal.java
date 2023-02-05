package com.example.workbook.ch3;

import java.time.*;
import java.util.Date;

public class P72_COnvertBetweenDateTemporal {

    public static final ZoneId DEFAULT_TIME_ZONE = ZoneId.systemDefault();
    public void playground(){
        Date date = new Date();
        Instant instantFromDate = date.toInstant();

        Instant instant = Instant.now();
        Date dateFromInstant = Date.from(instant);

    }

    public Instant dateToInstant(Date date){
        return date.toInstant();
    }

    public Date instantToDate(Instant instant){
        return Date.from(instant);
    }

    public LocalDate dateToLocalDate(Date date){
        return dateToInstant(date).atZone(DEFAULT_TIME_ZONE).toLocalDate();
    }

    public Date localDateToDate(LocalDate localDate){
        return Date.from(localDate.atStartOfDay(DEFAULT_TIME_ZONE).toInstant());
    }

    public LocalDateTime dateToLocalDateTime(Date date){
        return dateToInstant(date).atZone(DEFAULT_TIME_ZONE).toLocalDateTime();
    }

    public Date localDateTimeToDate(LocalDateTime localDateTime){
        return Date.from(localDateTime.atZone(DEFAULT_TIME_ZONE).toInstant());
    }

    public ZonedDateTime dateToZonedDateTime(Date date){
        return dateToInstant(date).atZone(DEFAULT_TIME_ZONE);
    }

    public Date zonedDateTimeToDate(ZonedDateTime zonedDateTime){
        return Date.from(zonedDateTime.toInstant());
    }

    public OffsetDateTime dateToOffsetDateTime(Date date){
        return dateToInstant(date).atZone(DEFAULT_TIME_ZONE).toOffsetDateTime();
    }

    public Date offsetDateTImeToDate(OffsetDateTime offsetDateTime){
        return Date.from(offsetDateTime.toLocalDateTime()
                .toInstant(ZoneOffset.of(offsetDateTime.getOffset().getId())));
    }

    public LocalTime dateToLocalTime(Date date){
        return LocalTime.ofInstant(dateToInstant(date), DEFAULT_TIME_ZONE);
    }

    public Date localTimeToDate(LocalTime localTime){
        return Date.from(localTime.atDate(LocalDate.EPOCH)
                .toInstant(DEFAULT_TIME_ZONE.getRules().getOffset(Instant.now())));
    }

    public OffsetTime dateToOffsetTime(Date date){
        return OffsetTime.ofInstant(dateToInstant(date), DEFAULT_TIME_ZONE);
    }

    public Date offsetTimeToDate(OffsetTime offsetTime){
        return Date.from(offsetTime.atDate(LocalDate.EPOCH).toInstant());
    }

}
