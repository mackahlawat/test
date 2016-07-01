package com.sandeep.test.package2;

import com.sandeep.test.package1.A;

/**
 * Created by smalik3 on 6/17/16
 */
public class AnotherChildA extends A {

    public void m() {
        System.out.println(protectedString);
        System.out.println(publicString);
    }

}
