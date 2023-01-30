package com.example.workbook.ch1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P01_countDuplicateCharacters {

    public Map<Character, Integer> countDuplicateCharacters(String str){
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("ch = " + ch);

            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }
        return result;
    }

    public Map<Character, Long> countDuplicateCharactersLambda(String str){
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public Map<String, Long> countDuplicateCharactersSurrogatePair(String str){
        return str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
