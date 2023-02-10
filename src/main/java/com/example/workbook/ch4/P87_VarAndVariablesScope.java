package com.example.workbook.ch4;

import java.util.ArrayDeque;
import java.util.Stack;

public class P87_VarAndVariablesScope {
    public void playground(){
//        var stack = new Stack<String>();
        var stack = new ArrayDeque<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");

//        .........
        stack.forEach(System.out::println);

    }

}
