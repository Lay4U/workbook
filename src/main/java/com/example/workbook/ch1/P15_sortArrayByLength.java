package com.example.workbook.ch1;

import java.util.Arrays;
import java.util.Comparator;

public class P15_sortArrayByLength {

    public enum Sort{
        ASC, DESC
    }

    public void sortArrayByLength(String[] strs, Sort direction){
        if (direction.equals(Sort.ASC)){
//            Arrays.sort(strs, (String s1, String s2) ->
//                    Integer.compare(s1.length(), s2.length()))
            Arrays.sort(strs, Comparator.comparingInt(String::length));
        }else{
            Arrays.sort(strs, Comparator.comparingInt(String::length).reversed());
        }
    }

    public String[] sortArrayByLength2(String[] strs, Sort direction){
        if(direction.equals(Sort.ASC)){
            return Arrays.stream(strs)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        }else {
            return Arrays.stream(strs)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toArray(String[]::new);
        }

    }
}
