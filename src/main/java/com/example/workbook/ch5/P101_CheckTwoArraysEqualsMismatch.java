package com.example.workbook.ch5;

import java.util.Arrays;

public class P101_CheckTwoArraysEqualsMismatch {
    public void playground(){
        int[] integers1 = {3, 4, 5, 6, 1, 5};
        int[] integers2 = {3, 4, 5, 6, 1, 5};
        int[] integers3 = {3, 4, 5, 6, 1, 3};

        boolean i12 = Arrays.equals(integers1, integers2);
        boolean i13 = Arrays.equals(integers1, integers3);

        boolean is13_14 = Arrays.equals(integers1, 1, 4, integers3, 1, 4);

        int mi12 = Arrays.mismatch(integers1, integers2);
        int mi13 = Arrays.mismatch(integers1, integers3);
    }
}
