package com.sandeep.test.shapes.impl2D;

import com.sandeep.test.shapes.Shape2D;

/**
 * Created by smalik3 on 6/17/16
 */
public class Rectangle extends Shape2D {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}
