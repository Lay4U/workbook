package com.example.workbook.ch2;

import com.google.gson.Gson;
import org.springframework.util.SerializationUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class P53_CloningObjects implements Cloneable{
    public class Point{
        private double x;
        private double y;

        public Point() {}

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point another){
            this.x = another.x;
            this.y = another.y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public Point clonePoint(){
            Point point = new Point();
            point.setX(this.x);
            point.setY(this.y);
            return point;
        }

        @Override
        protected Point clone() throws CloneNotSupportedException {
            return (Point) super.clone();
        }
    }


    public void playgrond() throws CloneNotSupportedException {
        Point point = new Point(1, 2);
        Point clone = point.clonePoint();
        Point clone1 = point.clone();
        Point point2 = new Point(point);
    }

    private static <T> T cloneThroughSerialization(T t){
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(t);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            return (T) ois.readObject();
        }catch (Exception e) {
            return t;
        }
    }

    public void playground2(){
        Point point = new Point(1, 2);
        Point clone = cloneThroughSerialization(point);
    }

    private static <T> T cloneThroughJson(T t){
        Gson gson = new Gson();
        String json = gson.toJson(t);

        return (T) gson.fromJson(json, t.getClass());
    }


}
