package com.example.workbook.ch1;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P03_reverseWords{
    private static final String WHITESPACE = " ";

    public String reverseWords(String str){
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

    private static final Pattern PATTERN = Pattern.compile(" +");
    public String reverseWords2(String str){
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

//    Apache Commons Lang's StringUtils.reverse
}
