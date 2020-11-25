package com.company.lab7;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String name(){
        return "Rectangle";
    }
}
