package com.example.workbook.ch4;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class P95_VarInLambdas {
    public void playground(){
//        var incrementX = x -> x + 1;
//        var exceptionalAE = IllegalArgumentException::new;

        Function<Integer, Integer> incrementX = x -> x + 1;
        Supplier<IllegalArgumentException> runnable = IllegalArgumentException::new;

    }

    @FunctionalInterface
    public interface Square {
        int calculate(int x);
    }

    Square sqaure = x -> x * x;
//    var sqauare2 = x -> x * x;
}
