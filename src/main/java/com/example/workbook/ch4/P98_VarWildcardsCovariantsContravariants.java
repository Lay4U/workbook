package com.example.workbook.ch4;

import java.io.FilterReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

public class P98_VarWildcardsCovariantsContravariants {
    public void playground(){
        Class<?> claszz = Long.class;

        Collection<?> stuff = new ArrayList<>();
//        stuff.add("hello");

        Class<? extends Number> intNumber = Integer.class;
        Class<? super FilterReader> fileReader = Reader.class;

//        Class<? extends Number> intNumber2 = Reader.class;
//        Class<? super FilterReader> fileReader2 = Integer.class;


    }
}
