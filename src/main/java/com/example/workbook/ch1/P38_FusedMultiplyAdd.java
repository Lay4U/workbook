package com.example.workbook.ch1;

public class P38_FusedMultiplyAdd {
    public void playground(){
        double x = 49.29d;
        double y = -28.58d;
        double z = 33.63d;
        double q = (x * y) + z;

        double fma = Math.fma(x, y, z); // 49.29 * -28.58 + 33.63 = -1391.1722
    }
}
