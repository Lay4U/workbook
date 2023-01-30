package com.example.workbook.ch1;

public class P27_StringUnsignedNumberRadix {
    public void playground(){
        String nri = "255500";
        int result = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);
        int result2 = Integer.parseUnsignedInt(nri);
        int result3 = Integer.parseUnsignedInt(nri, 1, 4, Character.MAX_RADIX);
        int maxValuePlus1 = Integer.parseUnsignedInt("2147483648");

    }
}
