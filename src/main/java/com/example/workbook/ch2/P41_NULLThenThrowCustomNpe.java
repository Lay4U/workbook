package com.example.workbook.ch2;

import java.awt.*;
import java.util.Objects;

public class P41_NULLThenThrowCustomNpe {
    public class Car{
        private final String name;
        private final Color color;

        public Car(String name, Color color) {
            if(name == null){
                throw new NullPointerException("name cannot be null");
            }
            if (color == null){
                throw new NullPointerException("color cannot be null");
            }
            this.name = name;
            this.color = color;
        }

        public void assignDriver(String license, Point location){
            if(license == null){
                throw new NullPointerException("license cannot be null");
            }
            if(location == null){
                throw new NullPointerException("location cannot be null");
            }
        }
    }

    public class Car2{
        private final String name;
        private final Color color;

        public Car2(String name, Color color) {
            String name1;
            name1 = Objects.requireNonNull(name);
            this.color = Objects.requireNonNull(color);

            name1 = Objects.requireNonNull(name, () ->
                    "Car name cannot be null ... Consider one from " );
            this.name = name1;
        }

        public void assignDriver(String license, Point location){
            Objects.requireNonNull(license);
            Objects.requireNonNull(location);
        }
    }
}
