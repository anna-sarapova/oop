package com.company.lab8;

public class Sphere implements GeometricBody{
    int radius;

    public Sphere(int side){
        this.radius = radius;
    }

    public double getSurface() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    public String name() {
        return "Sphere";
    }
}
