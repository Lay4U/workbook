package com.example.workbook.ch1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class P14_maxOccurrenceCharacter {

    public Pair<Character, Integer> maxOccurrenceCharacter(String str){
        Map<Character, Integer> counter = new HashMap<>();
        char[] chStr = str.toCharArray();

        for (int i = 0; i < chStr.length; i++) {
            char currentCh = chStr[i];
            if(!Character.isWhitespace(currentCh)){
                Integer noCh = counter.get(currentCh);
                if( noCh == null){
                    counter.put(currentCh, 1);
                }else{
                    counter.put(currentCh, ++noCh);
                }
            }
        }

        Integer maxOccurrences = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if(entry.getValue() == maxOccurrences){
                maxCharacter = entry.getKey();
            }
        }

        return Pair.of(maxCharacter, maxOccurrences);

    }

    private static final int EXTENDED_ASCII_CODES = 256;

    public Pair<Character, Integer> maxOccurrenceCharacter2(String str){
        int maxOccurrences = -1;
        char maxCharacter = Character.MIN_VALUE;
        char[] chStr = str.toCharArray();
        int[] asciiCodes = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < chStr.length; i++) {
            char currentCh = chStr[i];
            if(!Character.isWhitespace(currentCh)){
                int code = currentCh;
                asciiCodes[code]++;
                if (asciiCodes[code] > maxOccurrences){
                    maxOccurrences = asciiCodes[code];
                    maxCharacter = currentCh;
                }
            }
        }

        return Pair.of(maxCharacter, maxOccurrences);
    }

    public Pair<Character, Long> maxOccurrenceCharacter3(String str){
        return str.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Pair.of(p.getKey(), p.getValue()))
                .orElse(Pair.of(Character.MIN_VALUE, -1L));
    }
}
