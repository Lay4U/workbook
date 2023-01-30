package com.example.workbook.ch1;

import java.util.stream.IntStream;

public class P10_permuteAndPrint {

    public void permuteAndPrint(String str){
        permuteAndPrint("", str);
    }

    public void permuteAndPrint(String prefix, String str){
        int n = str.length();

        if(n==0){
            System.out.println(prefix + " ");
        }else{
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i+1, n) + str.substring(0, i));
            }
        }
    }

    public void permuteAndPrintStream(String prefix, String str){
        int n = str.length();
        if(n ==0){
            System.out.println(prefix + " ");
        }else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permuteAndPrintStream(prefix + str.charAt(i),
                            str.substring(i + 1, n) + str.substring(0, i)));
        }
    }
}
