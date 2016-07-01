package com.sandeep.test.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by smalik3 on 6/19/16
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Mark");
        names.add("John");
        names.add("Udta Punjab");
        names.add("Tommy Singh");
        names.add("Biharin");
        names.add("Biharin");
        names.add("John");

        System.out.println(names.size());

        // iterator:
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for-each:
        for (String name : names) {
            System.out.println(name);
        }

        // lambda:
        names.forEach(name -> System.out.println(name));

        // lambda 2:
        names.forEach(System.out::println);

        System.out.println(names.contains("mark"));
    }

}
