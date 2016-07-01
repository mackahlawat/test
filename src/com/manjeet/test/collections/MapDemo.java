package com.manjeet.test.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("sandeep",35);
		map.put("manjeet", 28);
		map.put("pinki", 29);
		
		System.out.println(map.size());
		System.out.println(map.containsKey("pinki"));
		System.out.println(map.containsKey("manjeet"));
		System.out.println(map.get("sandeep"));
		System.out.println(map.remove("manjeet"));
		
		//iteration:
		Set<String> keys = map.keySet();
        for (String key : keys) {
        final Integer i = map.get(key);
        System.out.println("key = " + key + ", value = " + i);
       }
		
		       // other way:
		       Iterator<String> itr = keys.iterator();
		        while (itr.hasNext()) {
		           String key = itr.next();
		            final Integer i = map.get(key);
		            System.out.println("key = " + key + ", value = " + i);
		        }
		
	}
}

