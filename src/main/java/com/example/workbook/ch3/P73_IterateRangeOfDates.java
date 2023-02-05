package com.example.workbook.ch3;

import java.time.LocalDate;
import java.time.Period;

public class P73_IterateRangeOfDates {
    public void playground() {
        LocalDate startLocalDate = LocalDate.of(2019, 2, 1);
        LocalDate endLocalDate = LocalDate.of(2019, 2, 21);

        for (LocalDate date = startLocalDate;
             date.isBefore(endLocalDate);
             date = date.plusDays(1)) {
            System.out.println(date);
        }

        startLocalDate.datesUntil(endLocalDate).forEach(System.out::println);

        startLocalDate.datesUntil(endLocalDate, Period.ofWeeks(1))
                .forEach(System.out::println);


    }


}
