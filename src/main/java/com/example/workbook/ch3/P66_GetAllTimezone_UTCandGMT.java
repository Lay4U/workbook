package com.example.workbook.ch3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class P66_GetAllTimezone_UTCandGMT {
    public enum OffsetType{
        UTC,
        GMT
    }

    public void playground(){
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        String current_zone_id = ZoneId.systemDefault().getId();
        ZoneId zoneId = ZoneId.of(current_zone_id);

        LocalDateTime now = LocalDateTime.now();
        String zone_id_instance = "America/Los_Angeles";
        ZonedDateTime zdt = now.atZone(ZoneId.of(zone_id_instance));

        String utcOffset = zdt.getOffset().getId().replace("Z", "+00:00");


        List<String> timezones = fetchTimeZOnes(OffsetType.GMT);
        Collections.sort(timezones);
        timezones.forEach(System.out::println);
    }

    public List<String> fetchTimeZOnes(OffsetType type){
        ArrayList<String> timezones = new ArrayList<>();
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        LocalDateTime now = LocalDateTime.now();

        zoneIds.forEach((zoneId) -> timezones.add("(" + type + now.atZone(ZoneId.of(zoneId))
                .getOffset().getId().replace("Z", "+00:00") + ") " + zoneId));

        return timezones;
    }
}
