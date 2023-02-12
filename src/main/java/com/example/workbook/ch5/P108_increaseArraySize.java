package com.example.workbook.ch5;

import java.util.Arrays;

public class P108_increaseArraySize {
    public int[] add(int[] arr, int item){
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length -1] = item;
        return newArr;
    }

    public int[] remove(int[] arr){
        int[] newArr = Arrays.copyOf(arr, arr.length - 1);

        return newArr;
    }

    public int[] resize(int[] arr, int length){
        int[] newArr = Arrays.copyOf(arr, arr.length + length);

        return newArr;
    }




}
