package com.example.workbook.ch2;

public class P50_PassReturnMutablesToImmutables {
    public class Radius{
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

    public final class Point{
        private final double x;
        private final double y;
        private final Radius radius;

        public Point(double x, double y, Radius radius) {
            this.x = x;
            this.y = y;
//            this.radius = radius;
            Radius clone = new Radius();
            clone.setStart(radius.getStart());
            clone.setEnd(radius.getEnd());

            this.radius = clone;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Radius getRadius() {
//            return radius;
            Radius clone = new Radius();
            clone.setStart(this.radius.getStart());
            clone.setEnd(this.radius.getEnd());

            return clone;
        }
    }


    public void playground(){
        Radius r = new Radius();
        r.setStart(0);
        r.setEnd(120);

        Point point = new Point(1.234, 4.12, r);

        System.out.println("Radius start: " + point.getRadius().getStart());
        r.setStart(5);
        System.out.println("Radius start: " + point.getRadius().getStart());
    }
}
