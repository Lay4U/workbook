package com.example.workbook.ch1;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class P26_SumTwoLargeIntsAndLongsOperationOverflow {
    public void sandbox(){
        int x = 2;
        int y = 7;
        int z = x + y;

        int x2 = Integer.MAX_VALUE;
        int y2 = Integer.MAX_VALUE;
        int z2 = x + y;

        long x3 = Integer.MAX_VALUE;
        long y3 = Integer.MAX_VALUE;
        long z3 = x + y;

        int z4 = Math.addExact(x, y);

        BinaryOperator<Integer> operator = Math::addExact;
        Integer z5 = operator.apply(x, y);


    }

}
