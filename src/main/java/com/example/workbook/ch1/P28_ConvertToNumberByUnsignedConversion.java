package com.example.workbook.ch1;

public class P28_ConvertToNumberByUnsignedConversion {
    public void playground(){
        long result = Integer.toUnsignedLong(Integer.MIN_VALUE);

        int result2 = Short.toUnsignedInt(Short.MIN_VALUE);
        int result3 = Short.toUnsignedInt(Short.MAX_VALUE);
    }
}
