package com.manjeet.test.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(0, 6);

		System.out.println(list.get(0));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add(12);
		System.out.println(list.size());
		System.out.println(list.contains(13));
		System.out.println(list.contains(12));

		//Example to iterator over the list
		Iterator<Integer> itr = list.iterator();
		 while(itr.hasNext()) {
		Integer i = itr.next();
		System.out.println(i);
		 }
	}
	}
/*		
		//for each loop
		for(Integer element :list)
			System.out.println(element);
	}

	for loop for(int i = 0;i<list.size;i++){

		System.out.println(list.get(i));
	}
	
	// lambda syntax :(Java 8)
	list.forEach(System.out::println(i));
	
	//another form
	list.forEach(System.out::println);
	
	//delete
	System.out.println(list);
	list.remove(0);
	System.out.println(list);
	
	//add more
	System.out.println(list);
	for(int i = 0; i < 10; i++);
	list.add(i);
	}

System.out.println(list);

// sublist
List<Integer> sublist = list.sublist(2, 6);System.out.println(subList);

}*/

