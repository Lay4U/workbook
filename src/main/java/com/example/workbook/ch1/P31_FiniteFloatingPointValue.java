package com.example.workbook.ch1;

public class P31_FiniteFloatingPointValue {
    public void playground(){
        float f1 = 4.5f;
        boolean f1f = Float.isFinite(f1);

        float f2 = f1 / 0;
        boolean f2f = Float.isFinite(f2);

        float f3 = 0f / 0f;
        boolean f3f = Float.isFinite(f3);

        double d1 = 0.000333411333d;
        boolean d1f = Double.isFinite(d1);

        double d2 = d1 / 0;
        boolean d2f = Double.isFinite(d2);

        double d3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(d3);
    }
}
