package com.sandeep.test.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by smalik3 on 6/19/16
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("sandeep", 35);
        map.put("manjeet", 28);
        map.put("pinki", 29);

        System.out.println(map.size());
        System.out.println(map.containsKey("pinki"));
        System.out.println(map.containsKey("Manjeet"));
        System.out.println(map.get("sandeep"));
        System.out.println(map.remove("manjeet"));

        // iteration:
        Set<String> keys = map.keySet();
        for (String key : keys) {
            final Integer i = map.get(key);
            System.out.println("key = " + key + ", value = " + i);
        }

        // other way:
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            final Integer i = map.get(key);
            System.out.println("key = " + key + ", value = " + i);
        }
    }

}
