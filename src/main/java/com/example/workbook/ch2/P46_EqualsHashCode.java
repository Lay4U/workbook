package com.example.workbook.ch2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class P46_EqualsHashCode {
    public class Player{
        private int id;
        private String name;

        public Player(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj){
                return true;
            }

            if (obj == null){
                return false;
            }

            if (getClass() != obj.getClass()){
                return false;
            }

            final Player other = (Player) obj;

            if(this.id != other.id){
                return false;
            }

            if(!Objects.equals(this.name, other.name)){
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 79 * hash + this.id;
            hash = 79 * hash + Objects.hashCode(this.name);

            return hash;
        }
    }

    public void playground(){
        Player p1 = new Player(1, "Rafeal Nadal");
        Player p2 = new Player(1, "Rafeal Nadal");
        System.out.println(p1.equals(p2)); // false
        System.out.println("p1 hash code: " + p1.hashCode()); // 1809787067
        System.out.println("p2 hash code: " + p2.hashCode()); // 157627084

        Set<Player> players = new HashSet<>();
        players.add(p1);
        players.add(p2);

        System.out.println("players size: " + players.size()); // 2
        System.out.println("Set contains Refael Nadal: " +
                players.contains(new Player(1, "Rafeal Nadal"))); // false


    }



}
