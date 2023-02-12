package com.example.workbook.ch5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class P99_SortArray {
    public void playground(){
        int[] integers = {5, 6, 4, 3, 2, 1, 0, 9, 8, 7};
        Arrays.sort(integers);
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
    }

    public void playground2(){
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

        Arrays.sort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon o1, Melon o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        });

        Arrays.sort(melons, (o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight()));

        Arrays.parallelSort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon1, Melon melon2) {
                return Integer.compare(melon1.getWeight(), melon2.getWeight());
            }
        });

        Arrays.parallelSort(melons, (melon1, melon2) -> Integer.compare(melon1.getWeight(), melon2.getWeight()));
        Arrays.parallelSort(melons, Comparator.comparingInt(Melon::getWeight));

        Arrays.sort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon o1, Melon o2) {
                return (-1) * Integer.compare(o1.getWeight(), o2.getWeight());
            }
        });

        Integer[] integers = {3, 1, 5};
        Arrays.sort(integers);
        Arrays.sort(integers, Collections.reverseOrder());


        Arrays.sort(integers);
        for (int leftHead = 0, rightHead = integers.length - 1;
        leftHead<rightHead;
        leftHead++, rightHead--){

            Integer elem = integers[leftHead];
            integers[leftHead] = integers[rightHead];
            integers[rightHead] = elem;
        }

        int[] descIntegers = Arrays.stream(integers)
                .sorted((i1, i2) -> Integer.compare(i2, i1))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                if( arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static <T> void bubbleSortWithComparator(T arr[], Comparator<? super T> c){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(c.compare(arr[j], arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public class MelonComparator implements Comparator<Melon>{
        @Override
        public int compare(Melon o1, Melon o2) {
            return o1.getType().compareTo(o2.getType());
        }
    }

    Comparator<Melon> byType = Comparator.comparing(Melon::getType);
    Comparator<Melon> byType2 = Comparator.comparing(Melon::getType).reversed();

    Melon[] melons = {
            new Melon("Gac", 2000),
            new Melon("Hemi", 1600),
            new Melon("Gac", 3000),
    };

    public void playground3(){
        bubbleSortWithComparator(melons, byType);
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i=1; i<n; ++i){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;

        }
    }

    public static <T> void insertionSortWithComparator(T arr[], Comparator<? super T> c){
        int n = arr.length;

        for (int i = 1; i < n ; ++i){
            T key = arr[i];
            int j = i-1;

            while(j >= 0 && c.compare(arr[j], key) > 0){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j+1] = key;
        }
    }

    Comparator<Melon> byType3 = Comparator.comparing(Melon::getType)
            .thenComparing(Melon::getWeight);

    public void playground4(){
        insertionSortWithComparator(melons, byType3);
    }

    public static void countingSort(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }else if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] counts = new int[max - min + 1];

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]-min]++;
        }

        int sortedIndex = 0;

        for (int i = 0; i < counts.length; i++) {
            while(counts[i] > 0){
                arr[sortedIndex++] = i + min;
                counts[i]--;
            }
        }
    }

    public static void heapSort(int[] arr){
        int n = arr.length;

        buildHeap(arr, n);

        while(n > 1) {
            swap(arr, 0, n-1);
            n--;
            heapify(arr, n, 0);
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void buildHeap(int[] arr, int n) {
        for (int i = arr.length / 2; i >=0; i--){
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int greater;

        if(left<n && arr[left] > arr[i]){
            greater = left;
        }else{
            greater = i;
        }

        if (right < n && arr[right] > arr[greater]) {
            greater = right;
        }

        if (greater != i){
            swap(arr, i, greater);
            heapify(arr, n, greater);
        }
    }


    public static void shuffleInt(int[] arr){
        int index;

        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i --){
            index = random.nextInt(i+1);
            swap(arr, index, i);
        }
    }
}
