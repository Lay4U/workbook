package com.example.workbook.ch1;

public class P21_RemoveLeadingTrailingSpaces {

    public void removeLeadingTrailingSpaces(){
        String text = "\n \n\n hello \t \n \r";
        String trimmed = text.trim();

        char space = '\u2002';
        String text2 = space + "\n \n \n hello \t \n \r" + space;
        String stripped = text2.strip();

    }

}
