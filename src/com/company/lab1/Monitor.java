package com.company.lab1;

public class Monitor {
    private String color = "Grey";
    private int resolution = 300;
    private int width = 1920;
    private int height = 1080;

    public Monitor(String color, int resolution, int width, int height){
        this.color = color;
        this.resolution = resolution;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
