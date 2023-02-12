package com.example.workbook.ch5;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P103_StreamFromArray {
    public static void main(String[] args) {
        String[] arr = {"One", "Two", "Three", "Four", "Five"};

        Stream<String> stream = Arrays.stream(arr);

        Stream<String> stream1 = Arrays.stream(arr, 0, 2);

        Stream<String> stream2 = Arrays.asList(arr).stream();
        Stream<String> stream3 = Arrays.asList(arr).subList(0, 2).stream();

        Stream<String> stream4 = Stream.of(arr);
        Stream<String> stream5 = Stream.of("One", "Two", "Three", "Four", "Five");

        String[] array = stream.toArray(String[]::new);

        int[] integers = {2, 3, 4, 1};

        IntStream intStream = Arrays.stream(integers);
        IntStream intStream1 = IntStream.of(integers);
        IntStream intStream2 = IntStream.range(0, integers.length);
        IntStream intStream3 = IntStream.rangeClosed(0, integers.length);

        int[] ints = intStream.toArray();


    }
}
