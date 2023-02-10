package com.example.workbook.ch4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P91_VarBreakNestedLargeChainsOfExpressions {
    public void playground(){
        List<Integer> ints = List.of(1, 1, 2, 3, 4, 4, 6, 2, 1, 5, 4, 5);

        int result = ints.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values()
                .stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList())
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        Collection<List<Integer>> evenAndOdd = ints.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values();

        List<Integer> evenOrOdd = evenAndOdd.stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList());

        int sumEvenOrOdd = evenOrOdd.stream()
                .mapToInt(Integer::intValue)
                .sum();


        var evenAndOdd2 = ints.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values();

        var evenOrOdd2 = evenAndOdd.stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList());

        var sumEvenOrOdd2 = evenOrOdd.stream()
                .mapToInt(Integer::intValue)
                .sum();




    }
}
