package com.example.workbook.ch5;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class P105_ReverseArray {

    static int[] integers = {3, 4, 5, 6, 1, 5};

    public static void reverse(int[] arr){
        for (int leftHead = 0, rightHead = arr.length - 1;
        leftHead < rightHead;
        leftHead++, rightHead--){
            int elem = arr[leftHead];
            arr[leftHead] = arr[rightHead];
            arr[rightHead] = elem;
        }
    }
    int[] reversed = IntStream.rangeClosed(1, integers.length)
            .map(i -> integers[integers.length-i]).toArray();

    public class Melon {
        private final String type;
        private final int weight;

        public Melon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }
    }

    Melon[] melons = {new Melon("Gac", 3000), new Melon("Hemi", 2000), new Melon("Cren", 1000)};

    public static <T> void reverse3(T[] arr){
        for (int leftHead = 0, rightHead = arr.length - 1;
        leftHead < rightHead;
        leftHead++, rightHead--){
            T elem = arr[leftHead];
            arr[leftHead] = arr[rightHead];
            arr[rightHead] = elem;
        }
    }

    public void reverse4(){
        Collections.reverse(Arrays.asList(melons));
    }

    Melon[] reversed2 = IntStream.rangeClosed(1, melons.length)
            .mapToObj(i -> melons[melons.length-i])
            .toArray(Melon[]::new);



}
