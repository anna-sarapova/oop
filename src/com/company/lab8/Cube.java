package com.company.lab8;

public class Cube implements GeometricBody{
    int side;

    public Cube(int side){
        this.side = side;
    }

   public double getSurface() {
        return 6 * side * side;
    }

   public double getVolume() {
        return side * side * side;
    }

   public String name() {
        return "Cube";
    }
}
