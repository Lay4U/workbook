package com.example.workbook.ch4;

import java.util.List;

public class P89_VarForLoops {
    public void playground(){
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        List<Player> players = List.of(new Player(), new Player(), new Player());
        for (Player player : players) {
            System.out.println(player);
        }

        int[] array = {1,2,3};
        String[] array2 = {"1","2","3"};

        for (var i : array) {
            System.out.println("i = " + i);
        }
        for (var s : array2) {
            System.out.println("s = " + s);
        }
    }

    private class Player {
    }
}
