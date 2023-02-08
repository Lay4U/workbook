package com.example.workbook.ch4;

public class P79_VarPrimitiveTypes {
    public void playground() {
        boolean valid = true;
        char c = 'c';

        var valid2 = true;
        var c2 = 'c';

        int intNumber = 10;
        long longNumber = 10;
        float floatNumber = 10;
        double doubleNumber= 10;

        var intNumber2 = 10;
        var longNumber2 = 10;
        var floatNumber2 = 10;
        var doubleNumber2 = 10;
        // 위 모두 int로 컴파일 된다.

        var intNumber3 = 10;
        var longNumber3 = 10L;
        var floatNumber3 = 10F;
        var doubleNumber3 = 10D;

    }
}
