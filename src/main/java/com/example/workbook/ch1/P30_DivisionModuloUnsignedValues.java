package com.example.workbook.ch1;

public class P30_DivisionModuloUnsignedValues {
    public void playground(){
        int divisionSingedMinMAx = Integer.MIN_VALUE / Integer.MAX_VALUE;
        int divisionSignedMaxMin = Integer.MAX_VALUE / Integer.MIN_VALUE;

        int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;
        int moduloSignedMaxMin = Integer.MAX_VALUE % Integer.MIN_VALUE;

        int divisionUnsignedMinMAx =
                Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int divisionUnsignedMaxMin =
                Integer.divideUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);

        int moduloUnsignedMinMAx =
                Integer.remainderUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int moduloUnsignedMaxMin = Integer.remainderUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);

    }
}
