package com.example.workbook.ch1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P17_countStringInString {
    public int countStringInString(String string, String toFind){
        int position = 0;
        int count  = 0;
        int n = toFind.length();

        while((position = string.indexOf(toFind, position)) != -1){
            position = position + n;
            count++;
        }

        return count;
    }

    public int countStringInString2(String string, String toFind){
        int result = string.split(Pattern.quote(toFind), -1).length - 1;
        return result < 0 ? 0 : result;
    }

    public int countStringInString3(String string, String toFind){
        Pattern pattern = Pattern.compile(Pattern.quote(toFind));
        Matcher matcher = pattern.matcher(string);

        int position = 0;
        int count = 0;

        while (matcher.find(position)){
            position = matcher.start() + 1;
            count++;
        }

        return count;
    }
}
