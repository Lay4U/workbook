package com.example.workbook.ch3;

import java.time.*;

public class P71_DefiningAndExtractingZOneOffsets {
    public void playground(){
        ZoneOffset zoneOffsetUTC = ZoneOffset.UTC;
        ZoneId defaultZoneId = ZoneOffset.systemDefault();

        LocalDateTime ldt = LocalDateTime.of(2019, 6, 15, 0, 0);
        ZoneId zoneId = ZoneId.of("Europe/Bucharest");
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(ldt);

        ZoneOffset zoneOffsetFromString = ZoneOffset.of("+02:00");

        OffsetTime offsetTime = OffsetTime.now(zoneOffsetFromString);
        OffsetDateTime offsetDateTIme = OffsetDateTime.now(zoneOffsetFromString);

        ZoneOffset zoneOffsetFromHoursMinutes = ZoneOffset.ofHoursMinutes(8, 30);

        ZoneOffset zoneOffsetFromOdt = offsetDateTIme.getOffset();

    }
}
