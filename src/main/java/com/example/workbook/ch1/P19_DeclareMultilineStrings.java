package com.example.workbook.ch1;

public class P19_DeclareMultilineStrings {
    String text = """
            My high school,
            the Illinois Mathematics and Science Academy,
            showed me that anything is possible and that you're never too young to think big.
            """;

    private static final String LS = System.lineSeparator();

    String text2 = String.join(LS,
            "My high school,",
            "the Illinois Mathematics and Science Academy,",
            "showed me that anything is possible and that you're never too young to think big.");

    String text34 = String.format("%s" + LS + "%s" + LS + "%s",
            "My high school,",
            "the Illinois Mathematics and Science Academy,",
            "showed me that anything is possible and that you're never too young to think big.");


}
