package com.example.workbook.ch1;

import java.util.regex.Pattern;

public class P16_contains {

    String text = "hello world!";
    String subtext = "orl";

    boolean contains = text.contains(subtext);

    public boolean contains(String text, String subtext){
        return text.indexOf(subtext) != -1;
    }

    public boolean contains2(String text, String subtext){
        return text.matches("(?i).*" + Pattern.quote(subtext) + ".*");
    }
}
