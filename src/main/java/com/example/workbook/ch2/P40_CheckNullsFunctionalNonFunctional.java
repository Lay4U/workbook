package com.example.workbook.ch2;

import java.util.*;

public class P40_CheckNullsFunctionalNonFunctional {
    public void playground(){
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
    }

    public static List<Integer> evenIntegers(List<Integer> integers){
        if(integers == null){
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers) {
            if(nr != null && nr % 2 == 0){
                evens.add(nr);
            }
        }

        return evens;
    }

    public static List<Integer> evenIntegers2(List<Integer> integers){
        if(Objects.isNull(integers)){
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();

        for (Integer nr : integers) {
            if (Objects.nonNull(nr) && nr % 2 == 0) {
                evens.add(nr);
            }
        }

        return evens;
    }

    public static int sumIntegers(List<Integer> integers){
        if(integers == null){
            throw new IllegalArgumentException("List of integers is null");
        }
        return integers.stream()
                .filter(i -> i != null)
                .mapToInt(Integer::intValue).sum();
    }

    public static int sumIntegers2(List<Integer> integers){
        if(integers == null){
            throw new IllegalArgumentException("List of integers is null");
        }

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers){
        if(integers == null){
            throw new IllegalArgumentException("List of integers is null");
        }

        return integers.stream()
                .anyMatch(Objects::isNull);
    }

    public static int sumIntegers3(List<Integer> integers){
        if(Objects.isNull(integers)){
            throw new IllegalArgumentException("List of integers is null");
        }

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNulls2(List<Integer> integers){
        if (Objects.isNull(integers)){
            return false;
        }

        return integers.stream()
                .anyMatch(Objects::isNull);
    }
}
