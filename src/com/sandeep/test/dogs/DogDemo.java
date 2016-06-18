package com.sandeep.test.dogs;

/**
 * Created by smalik3 on 6/17/16
 */
public class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Labrador();
        dog.bark();

        dog = new Pug();
        dog.bark();
    }

}
