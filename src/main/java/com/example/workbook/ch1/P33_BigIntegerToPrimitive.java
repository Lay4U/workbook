package com.example.workbook.ch1;

import java.math.BigInteger;

public class P33_BigIntegerToPrimitive {
    public void playground(){
        BigInteger nr = BigInteger.valueOf(Long.MAX_VALUE);
        long nrLong = nr.longValue();

        int nrInt = nr.intValue();

        long nrExactLong = nr.longValueExact();
        int nrExact = nr.intValueExact(); // throw ArithmeticException
    }
}
