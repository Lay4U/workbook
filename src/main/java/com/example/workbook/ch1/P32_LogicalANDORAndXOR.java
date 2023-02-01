package com.example.workbook.ch1;

public class P32_LogicalANDORAndXOR {
    public void playground(){
        int s = 10;
        int m = 21;

        if (Boolean.logicalAnd(s > m, m < 50)) {} else {}
        if (Boolean.logicalOr(s > m, m < 50)) {} else {}
        if (Boolean.logicalXor(s > m, m < 50)) {} else {}

        if (Boolean.logicalAnd(
                Boolean.logicalOr(s > m, m < 50),
                Boolean.logicalOr(s <= m, m > 50)
        )){} else {}
    }
}
