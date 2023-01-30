package com.example.workbook.ch1;

public class etc {
    private static final String TO_INT = "123";
    private static final String TO_LONG = "123";
    private static final String TO_FLOAT = "123.123";
    private static final String TO_DOUBLE = "123.123";

    public void 문자열변환(){
        Integer.parseInt(TO_INT);
        Long.parseLong(TO_LONG);
        Float.parseFloat(TO_FLOAT);
        Double.parseDouble(TO_DOUBLE);
    }

    public String 여백제거(String str) {
        String trim = str.trim();
        return str.replaceAll("\\s", "");
    }

}
