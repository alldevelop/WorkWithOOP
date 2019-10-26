package com.mainacad.triangle;

import com.mainacad.abstr.AbstractShape;
import com.mainacad.abstr.Shape;

public class Triangle extends AbstractShape {
    private double height;
    private double base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double getArea() {
        return 0.5 * height * base;
    }
}
