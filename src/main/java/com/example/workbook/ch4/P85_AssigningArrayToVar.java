package com.example.workbook.ch4;

public class P85_AssigningArrayToVar {
    public void playground(){
        int[] numbers = new int[10];

//        var[] numberArray = new int[10];

        var numberArray = new int[10];
        numberArray[0] = 3;

        int[] numbers2 = {1,2,3};
//        var numberArray2 = {1,2,3};
        var numberArray2 = new int[]{1,2,3};

    }
}
