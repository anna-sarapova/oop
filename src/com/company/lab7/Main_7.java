package com.company.lab7;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Main_7 {
    public static void main(String[] args) {

        Figure circle = new Figure() {
            int radius = 5;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public String name() {
                return "Circle";
            }
        };

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(2,4);
        Triangle triangle = new Triangle(2,3,4);

        //System.out.println(triangle.getArea());
        //System.out.println(triangle.getPerimeter());
        ArrayList<Figure>figures = new ArrayList<Figure>();
        figures.add(0,square);
        figures.add(1,rectangle);
        figures.add(2,triangle);
        figures.add(3,circle);

        FigureController maxFigure = new FigureController();
        System.out.println("The largest Area is  " + maxFigure.maxAreaFigureController(figures).name());
        System.out.println("The largest Perimeter is  " +maxFigure.maxPerimeterFigureController(figures).name());

    }
}
