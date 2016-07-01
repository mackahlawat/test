package com.sandeep.test.shapes.impl2D;

import com.sandeep.test.shapes.Shape2D;

/**
 * Created by smalik3 on 6/17/16
 */
public class Circle extends Shape2D {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
