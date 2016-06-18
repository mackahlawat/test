package com.sandeep.test.shapes;

/**
 * Created by smalik3 on 6/17/16
 */
public abstract class Shape {

    public abstract double area();
    public abstract double perimeter();
    public abstract String name();

    /*

    non-abstract method:

    [a_s] [static] [final] $ret_type $name([$type1 $name1, $type2 $name2.....]) [throws $exception1, $exception2, ..] {
        // body
        [$return $value;]
    }

    abstract-method:

    [a_s] abstract $ret_type $name([$type1 $name1, $type2 $name2.....]) [throws $exception1, $exception2, ..];

    An abstract class can not be instantiated

     */
}
