package com.example.workbook.ch1;

public class P04_containsOnlyDigits {
    public boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean containsOnlyDigits2(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }

    public boolean containsOnlyDigits3(String str) {
        return str.matches("[0-9]+");
    }


}
