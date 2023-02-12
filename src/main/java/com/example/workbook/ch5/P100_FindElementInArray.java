package com.example.workbook.ch5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;

public class P100_FindElementInArray {

    int[] numbers = {4, 5, 1, 3, 7, 4, 1};

    public static boolean containsElement(int[] arr, int toContain){
        for (int elem : arr) {
            if(elem == toContain){
                return true;
            }

        }
        return false;
    }

    public static boolean containsElement2(int[] arr, int toContain){
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, toContain);
        return (index >= 0);
    }

    public static boolean containsElement(int[] arr, int toContain){
        return Arrays.stream(arr)
                .anyMatch(e -> e===toContain);
    }

    public class Melon{
        private final String type;
        private final int weight;

        public Melon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Melon melon = (Melon) o;

            if (weight != melon.weight) return false;
            return Objects.equals(type, melon.type);
        }

        @Override
        public int hashCode() {
            int result = type != null ? type.hashCode() : 0;
            result = 31 * result + weight;
            return result;
        }
    }

    public static <T> boolean containsElementObject(T[] arr, T toContain){
        for (T elem : arr) {
            if(elem.equals(toContain)){
                return true;
            }
        }

        return false;
    }

    Melon[] melons = {
            new Melon("Gac", 2000),
            new Melon("Hemi", 1600),
            new Melon("Gac", 3000),
            new Melon("Hemi", 2000),
            new Melon("Cantal", 2000),
            new Melon("Hemi", 1500),
            new Melon("Cantal", 1500),
            new Melon("Gac", 2000),
            new Melon("Cantal", 6000),
            new Melon("Hemi", 1700),
            new Melon("Gac", 3000),
            new Melon("Cantal", 2000)
    };
    boolean found = containsElementObject(melons, new Melon("Gac", 1200));

    public static <T> boolean containsElementObject2(T[] arr, T toContain, Comparator<? super T> c) {
        for (T elem : arr) {
            if (c.compare(elem, toContain) == 0) {
                return true;
            }
        }

        return false;
    }

    Comparator<Melon> byType = Comparator.comparing(Melon::getType);

    boolean found2 = containsElementObject2(melons, new Melon("Gac", 1205), byType);

    public static <T> boolean containsElementObject(T[] arr, T toContain, Comparator<? super T> c) {
        Arrays.sort(arr, c);
        int index = Arrays.binarySearch(arr, toContain, c);
        return (index >= 0);
    }

    Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);

    boolean found3 = containsElementObject2(melons, new Melon("Honeydew", 12000), byWeight);

    public static int findIndexOfElement(int[] arr, int toFind){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind){
                return i;
            }
        }

        return -1;
    }

    public static int findIndexOfElement2(int[] arr, int toFind){
        return IntStream.range(0, arr.length)
                .filter(i -> toFind == arr[i])
                .findFirst()
                .orElse(-1);
    }


    public static <T> int findIndexOfElementObject(T[] arr, T toFind){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(toFind)){
                return i;
            }
        }

        return -1;
    }

    public static <T> int findIndexOfElementObject2(T[] arr, T toFind, Comparator<? super T> c) {
        for (int i = 0; i < arr.length; i++) {
            if(c.compare(arr[i], toFind) == 0){
                return i;
            }
        }

        return -1;
    }

    public static <T> int findIndexOfElementObject3(T[] arr, T toFind, Comparator<? super T> c) {
        return IntStream.range(0, arr.length)
                .filter(i -> c.compare(toFind, arr[i]) == 0)
                .findFirst()
                .orElse(-1);
    }


}
