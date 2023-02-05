package com.example.workbook.ch3;

import java.time.*;

public class P68_DisplayDateTimeInfomationAboutFlight {
    // 호주 퍼스에서 유럽 부쿠레슈티로 가는 15시간 30분짜리 항공편에 대해서
    // UTC 날짜와 시간으로 춫ㄹ발과 도착 시간 표시
    // 퍼스 날짜와 시간으로 출발 시간과 부쿠레슈티 도착 시간 표시
    // 부쿠레슈티의 날짜와 시간으로 출발과 도착 시간 표시

    public void playground(){
        LocalDateTime ldt = LocalDateTime.of(2019, Month.FEBRUARY, 25, 16, 00);

        ZonedDateTime auPerthDepart = ldt.atZone(ZoneId.of("Australia/Perth"));
        ZonedDateTime auPerthArrive = auPerthDepart.plusHours(15).plusMinutes(30);

        ZonedDateTime euBucharestDepart = auPerthDepart.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));
        ZonedDateTime euBucharestArrive = auPerthArrive.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));

        OffsetDateTime ucAtDepart = auPerthDepart.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        OffsetDateTime ucAtArrive = auPerthArrive.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();

    }
}
