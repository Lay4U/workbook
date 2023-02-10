package com.example.workbook.ch4;

import java.util.Random;

public class P94_VarFinalANdEffectivelyFinal {
    public interface Weighter{
        float getMarginOfError();
    }

    public void playground(){
        float ratio = fetchRatio();

        var weighter = new Weighter(){
            @Override
            public float getMarginOfError() {
                return ratio;
            }
        };

//        ratio = fetchRatio();
    }


    private float fetchRatio() {
        final float limit = new Random().nextFloat();
        final float bmi = 0.000023f;

//        limit = 0.002f;
//        bmi = 0.25f;

        return limit * bmi / 100.12f;
    }
}
