package com.example.workbook.ch4;

import java.util.ArrayList;
import java.util.List;

public class P97_VarAndGenericTypes {
    public static <T extends Number> T add(T t) {
        T temp = t;

        return temp;
    }

    public static <T extends Number> T add2(T t){
        var temp = t;

        return temp;
    }

    public <T extends Number> T add3(T t){
//        List<T> numberList = new ArrayList<>();
        var numberList = new ArrayList<T>();
        numberList.add(t);
        numberList.add((T) Integer.valueOf(3));
        numberList.add((T) Double.valueOf(3.9));

//        numberList.add("5");

        return numberList.get(0);
    }
}
