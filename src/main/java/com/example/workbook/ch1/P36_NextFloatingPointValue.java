package com.example.workbook.ch1;

public class P36_NextFloatingPointValue {
    public void playground(){
        float f = 0.1f;

        float nextf = Math.nextAfter(f, Float.NEGATIVE_INFINITY); // 0.099999994f

        float f2 = 0.1f;

        float nextdownf = Math.nextDown(f2);// 0.099999994f
        float nextupf = Math.nextUp(f);// 0.10000001f

        double d = 0.1d;

        double nextdownd = Math.nextDown(d);// 0.09999999999999999d
        double nextupd = Math.nextUp(d);// 0.10000000000000001d
    }
}
