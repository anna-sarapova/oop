package com.company.lab2;

public class Box {
    int height = 1; //these are the default
    int width = 1;  //values of the
    int length = 1; //Box object
    int Aria = 0;
    int Volume = 0;

    public Box(){ //create a constructor that will show
        this.height = height; //default introduced values
        this.width = width;
        this.length = length;
    }

    public Box(int height) { //constructor with the same
        this.height = height; //parameter value
        this.width = height;
        this.length = height;
    }

    public Box(int height, int width, int length) { //constructor
        this.height = height; // with 3 different parameters
        this.width = width;
        this.length = length;
    }

    public int surfaceArea(int height, int width, int length){
    Aria = 2 * (height*width + width*length + length*height);
    return Aria;
    }

    public int Volume(int height, int width, int length){
        Volume = height * width * length;
        return Volume;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
