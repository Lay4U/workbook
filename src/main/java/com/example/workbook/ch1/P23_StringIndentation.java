package com.example.workbook.ch1;

import java.util.List;

public class P23_StringIndentation {
    String days = "Sunday\n"
            + "Monday\n"
            + "Tuesday\n"
            + "Wednesday\n"
            + "Thursday\n"
            + "Friday\n";

    List<String> days2 = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
    public void stringIndentation(){
        System.out.println(days.indent(10));

        for (int i = 0; i < days2.size(); i++) {
            System.out.println(days2.get(i).indent(i));
        }

        days2.stream()
                .forEachOrdered(d -> System.out.println(d.indent(d.length())));
    }

}
