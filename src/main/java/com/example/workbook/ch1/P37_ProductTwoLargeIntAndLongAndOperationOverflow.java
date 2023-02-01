package com.example.workbook.ch1;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class P37_ProductTwoLargeIntAndLongAndOperationOverflow {
    public void playground(){
        int x = 10;
        int y = 5;
        int z = x * y;

        int x2 = Integer.MAX_VALUE;
        int y2 = Integer.MAX_VALUE;
        int z2 = x2 * y2; // 1

        long x3 = Integer.MAX_VALUE;
        long y3 = Integer.MAX_VALUE;
        long z3 = x3 * y3; // 4611686014132420609

        long x4 = Long.MAX_VALUE;
        long y4 = Long.MAX_VALUE;
        long z4 = x * y; // 1

        int x5 = Integer.MAX_VALUE;
        int y5 = Integer.MAX_VALUE;
        int z5 = Math.multiplyExact(x5, y5);// throw ArithmeticException

        int x6 = Integer.MAX_VALUE;
        int y6 = Integer.MAX_VALUE;
        long z6 = Math.multiplyFull(x6, y6);// 4611686014132420609

        long x7 = Long.MAX_VALUE;
        long y7 = Long.MAX_VALUE;
        long z7 = Math.multiplyHigh(x7, y7);// 4611686018427387903

        int x8 = Integer.MAX_VALUE;
        int y8 = Integer.MAX_VALUE;
        BinaryOperator<Integer> operator = Math::multiplyExact;
        operator.apply(x8, y8); // throw ArithmeticException

    }
}
