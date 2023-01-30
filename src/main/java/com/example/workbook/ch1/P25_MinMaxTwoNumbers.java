package com.example.workbook.ch1;

import java.util.function.BinaryOperator;

public class P25_MinMaxTwoNumbers {
    public void minMaxTwoNumbers(){
        int i1 = -45;
        int i2 = -15;
        int min = Math.min(i1, i2);
        int max = Math.max(i1, i2);

        double d1 = 0.023844D;
        double d2 = 0.35468856D;
        double min2 = Double.min(d1, d2);
        double max2 = Double.max(d1, d2);

        float f1 = 33.34F;
        float f2 = 33.213F;
        Float min3 = BinaryOperator.minBy(Float::compare).apply(f1, f2);
        Float max3 = BinaryOperator.maxBy(Float::compare).apply(f1, f2);
    }
}
