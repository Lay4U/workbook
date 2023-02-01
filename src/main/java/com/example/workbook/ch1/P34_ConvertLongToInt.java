package com.example.workbook.ch1;

public class P34_ConvertLongToInt {
    public void playground(){
        long nr = Integer.MAX_VALUE;
        int intNrCast = (int) nr;

        int intNrValue = Long.valueOf(nr).intValue();

        long nrMaxLong = Long.MAX_VALUE;
        int intNrMaxExact = Math.toIntExact(nrMaxLong); // throw ArithmeticException
    }
}
