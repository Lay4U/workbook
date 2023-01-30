package com.example.workbook.ch1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P12_removeDuplicates {
    public String removeDuplicates(String str){
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : chArray) {
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String removeDuplicates2(String str){
        char[] chArrray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();

        for (char c : chArrray) {
            if(chHashSet.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String removeDuplicates3(String str){
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
