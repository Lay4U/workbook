package com.example.workbook.ch4;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class P88_VarAndTernaryOperator {
    private boolean containsEven;
    private boolean intOrString;

    public void playground(){
//        List evensOrOdd = containsEven ? List.of(10, 2, 12) : Set.of(13, 1, 11);
        Collection evensOrOdds = containsEven ? List.of(10, 2, 12) : Set.of(13, 1, 11);

//        int numberOrText = intOrString ? 2234 : "2234";
        Serializable numberOrText = intOrString ? 2234 : "2234";
        Object numberOrText2 = intOrString ? 2234 : "2234";
    }
}
