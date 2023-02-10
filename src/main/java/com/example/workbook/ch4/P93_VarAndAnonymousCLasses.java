package com.example.workbook.ch4;

public class P93_VarAndAnonymousCLasses {
    public interface Weighter {
        int getWeight(Player player);
    }

    public void playground(){
        Weighter weighter = player -> 0;
        var weighter2 = new Weighter() {
            @Override
            public int getWeight(Player player) {
                return 0;
            }
        };
    }

    private static class Player {
    }
}
