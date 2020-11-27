package com.company.lab8;

public class Parallelepiped implements GeometricBody{
    int side1;
    int side2;
    int side3;

    public Parallelepiped(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSurface() {
        return (2 * side1 * side2) + (2 * side2 * side3) + (2 * side1 * side3);
    }

    public double getVolume() {
        return side1 * side2 * side3;
    }

    public String name() {
        return "Parallelepiped";
    }
}
