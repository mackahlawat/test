package com.manjeet.test.collections;

import java.util.*;

public class SortingDemo {

	public static void main(String[] args) {
		
	}
    private static void mapSort() {
    	Map<String,String> map = new TreeMap<>();
    	map.put("sandeep","malik");
    	map.put("manjeet","ahlawat");
    	map.put("monika","ahlawat");
    	map.put("bimla","ahlawat");
    	
    	System.out.println(map);
    }
    
    public static void setSort() {
    	Set<String> set = new TreeSet<>();
    	set.add("s1");
    	set.add("s2");
    	set.add("s3");
    	set.add("s4");
    	
    	System.out.println(set);
    }
    
    public static void listSort() {
    	List<Integer> list = new ArrayList<>();
    	list.add(3);
    	list.add(4);
    	list.add(1);
    	list.add(2);
    	list.add(10);
    	list.add(7);
    	
    	System.out.println(list);
    	Collections.sort(list);
    	System.out.println(list);
    	
    	
    	//Reversing a list
    	List<Integer> reversed = new ArrayList<>();
    	for(Integer integer : list) {
    		reversed.add(0, integer);
    		
    	}
    	System.out.println(reversed);
    }
    
}
