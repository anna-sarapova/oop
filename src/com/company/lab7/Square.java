package com.company.lab7;

public class Square extends Figure{
    private int side;

    public Square(int side){
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return  4 * side;
    }

    public String name(){
       return "Square";
    }
}
