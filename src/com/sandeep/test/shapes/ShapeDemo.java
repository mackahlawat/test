package com.sandeep.test.shapes;

import com.sandeep.test.shapes.impl2D.Circle;
import com.sandeep.test.shapes.impl2D.Rectangle;

/**
 * Created by smalik3 on 6/17/16
 */
public class ShapeDemo {

    public static void main(String[] args) {

        Shape2D shape2D = new Circle(10.0);

        System.out.println(shape2D.area());
        System.out.println(shape2D.perimeter());
        System.out.println(shape2D.name());

        System.out.println("-----------");
        shape2D = new Rectangle(1, 2);
        System.out.println(shape2D.area());
        System.out.println(shape2D.perimeter());
        System.out.println(shape2D.name());



    }

}
