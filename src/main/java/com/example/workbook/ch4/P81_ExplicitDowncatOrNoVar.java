package com.example.workbook.ch4;

public class P81_ExplicitDowncatOrNoVar {
    public void playground(){
        byte byteNumber = 25;
        short shortNumber = 1463;

        var byteNumber2 = 25; //int
        var shortNumber2 = 1463; //int

        var byteNumber3 = (byte) 25; //byte
        var shortNumber3 = (short) 1463; //short
    }
}
