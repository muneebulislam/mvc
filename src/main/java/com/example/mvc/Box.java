package com.example.mvc;

public class Box {
 private double x;
 private double y;
 private double side;


    public Box(double x, double y) {
        this.x = x;
        this.y = y;
        this.side = 20;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSide() {
        return side;
    }


}
