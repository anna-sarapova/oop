package com.company.lab7;

import java.util.ArrayList;

public class FigureController {
    public Figure maxAreaFigureController(ArrayList<Figure> figures){
        Figure max = null;
        for (Figure figure : figures){
            if (max == null || figure.getArea() > max.getArea()){
                max = figure;
            }
        } return max;
    }

    public Figure maxPerimeterFigureController(ArrayList<Figure> figures){
        Figure max = null;
        for (Figure figure : figures){
            if (max == null || figure.getPerimeter() > max.getPerimeter()){
                max = figure;
            }
        } return max;
    }
}
