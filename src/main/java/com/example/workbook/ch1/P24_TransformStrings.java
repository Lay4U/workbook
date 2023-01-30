package com.example.workbook.ch1;

import java.util.stream.Stream;

public class P24_TransformStrings {
    public void transformStrings() {
        String resultMap = Stream.of("hello")
                .map(s -> s + " world")
                .findFirst()
                .get();

        String resultMap2 = Stream.of("gooooool! ")
                .map(String::toUpperCase)
                .map(s -> s.repeat(2))
                .map(s -> s.replace("O", "OOOO"))
                .findFirst()
                .get();
    }

    public void transformStrings2(){
        String result = "hello".transform(s -> s + " world");

        String result2 = "gooool!".transform(String::toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replace("O", "OOOO"));
    }
}
