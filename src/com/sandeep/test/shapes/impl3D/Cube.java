package com.sandeep.test.shapes.impl3D;

import com.sandeep.test.shapes.Shape3D;

/**
 * Created by smalik3 on 6/17/16
 */
public class Cube extends Shape3D {

    private double side;

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public String name() {
        return "Cube";
    }
}
