package com.sandeep.test.package1;

/**
 * Created by smalik3 on 6/17/16
 */
public class ChildA extends A {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.defaultString);
        System.out.println(a.protectedString);
        System.out.println(a.publicString);
    }

}
