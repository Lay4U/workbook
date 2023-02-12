package com.example.workbook.ch5;

import java.util.Arrays;

public class P106_FillingSettingArray {
    public void playground(){
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        Arrays.fill(arr, 1);

        for (int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + 1;
        }

        Arrays.setAll(arr, t -> {
            if (t == 0) {
                return arr[t];
            }else{
                return arr[t-1] + 1;
            }
        });

        Arrays.parallelSetAll(arr, t -> {
            if (arr[t] % 2 == 0){
                return arr[t] * arr[t];
            }else{
                return arr[t] - 1;
            }
        });

        Arrays.parallelPrefix(arr, Integer::sum);

    }


}
