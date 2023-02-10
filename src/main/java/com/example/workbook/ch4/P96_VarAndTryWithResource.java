package com.example.workbook.ch4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P96_VarAndTryWithResource {
    public void playground(){
        try (var writer = new PrintWriter("test.txt")){
            writer.println("Hello World");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
