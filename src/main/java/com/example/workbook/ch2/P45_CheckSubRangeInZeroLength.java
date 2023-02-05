package com.example.workbook.ch2;

import java.util.Objects;

public class P45_CheckSubRangeInZeroLength {
    public class Function{
        private final int n;
        private static final int N_UPPER_BOUND = 10;

        public Function(int n) {
//            if(n < 0 || n >= N_UPPER_BOUND){
//                throw new IndexOutOfBoundsException("...");
//            }
//            this.n = n;
            this.n = Objects.checkIndex(n, N_UPPER_BOUND);
        }

        public int yMinusX(int x, int y){
//            if ( x < 0 || x > y || y >= n){
//                throw new IndexOutOfBoundsException("...");
//            }
            Objects.checkFromToIndex(x, y, n);
            return y - x;
        }
    }
}
