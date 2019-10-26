package com.mainacad;


import com.mainacad.abstr.AbstractShape;
import com.mainacad.abstr.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {


    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();

    }

}