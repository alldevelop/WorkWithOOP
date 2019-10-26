package com.mainacad;


import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {


    public static void main(String[] args) {
//square runner
        Square square = new Square();
        square.setSide(12.0);

        System.out.println(
                "Square with "+
                        "side " + square.getSide() +
                        " has area " + square.getArea());
//circle runner
        Circle circle = new Circle();
        circle.setRadius(15.0);

        System.out.println(
                "Circle with "+
                        "side " + circle.getRadius() +
                        " has area " + circle.getArea());
//triangle runner
        Triangle triangle = new Triangle();
        triangle.setHeight(18.0);
        triangle.setBase(26.0);

        System.out.println(
                "Triangle with "+
                        "height " + triangle.getHeight() +
                        " base " +triangle.getBase()+ " has area " + triangle.getArea());
    }

}