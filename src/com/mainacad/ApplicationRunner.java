package com.mainacad;


import com.mainacad.abstr.AbstractShape;
import com.mainacad.abstr.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(18);
        triangle.setHeight(28);
        Circle circle = new Circle();
        circle.setRadius(18);
        Square square = new Square();
        square.setSide(22);
        Shape maxShape;

        if(circle.getArea() > square.getArea()) {
            maxShape = circle;
        } else { maxShape = square;
        }
        if (maxShape.getArea() < triangle.getArea()){
            maxShape = triangle;
        }
        LOGGER.info("Max Shape іs " + maxShape.getClass().getSimpleName()+ " and has area "+ maxShape.getArea());
        //maxShape.getClass().getSimpleName() - рефлексія, за якої просимо отримати у maxShape структуру класу, а внього відповідно ім'я класу
    }


}