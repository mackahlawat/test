package com.sandeep.test.shapes.impl3D;

import com.sandeep.test.shapes.Shape3D;

/**
 * Created by smalik3 on 6/17/16
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
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
        return "Sphere";
    }
}
