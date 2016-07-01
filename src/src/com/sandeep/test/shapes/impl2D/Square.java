package com.sandeep.test.shapes.impl2D;

import com.sandeep.test.shapes.Shape2D;

/**
 * Created by smalik3 on 6/17/16
 */
public class Square extends Shape2D {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String name() {
        return "Square";
    }
}
