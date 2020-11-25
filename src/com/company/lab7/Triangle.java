package com.company.lab7;

public class Triangle extends Figure {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return  Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - side1) *
                (getPerimeter()/2 - side2) * (getPerimeter()/2 - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String name(){
        return "Triangle";
    }
}
