package com.example.workbook.ch1;

import java.util.Collections;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class P20_concatRepeat {
    public String concatRepeat(String str, int n){
        StringBuilder sb = new StringBuilder(str.length() * n);

        for (int i=1; i<=n; i++){
            sb.append(str);
        }

        return sb.toString();
    }

    String result = "hello".repeat(5);

    String result2 = String.join("", Collections.nCopies(5, "hello"));

    String result3 = Stream.generate(() -> "hello")
            .limit(5)
            .collect(joining());

    String result4 = String.format("%0" + 5 + "d", 0).replace("0", "hello");

    String result5 = new String(new char[5]).replace("\0", "hello");

    public boolean hasOnlySubstrings(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));
            String resultStr = str.replaceAll(sb.toString(), "");
            if (resultStr.length() == 0) {
                return true;
            }
        }

        return false;
    }
}
