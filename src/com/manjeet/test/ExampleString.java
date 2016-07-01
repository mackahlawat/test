package com.manjeet.test;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "Sandeep Malik";
		
		System.out.println("Hello " + x);
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.substring(2));
		
		System.out.println(x.substring(2,12));
		
		System.out.println(x.charAt(5));
		
		String age = "30";
		String salary = "7896.50";
		//Wrapper classes
		
		int a = Integer.parseInt(age) + 2;
		System.out.println(a);
		
		double s =Double.parseDouble(salary)*.15;
		System.out.println(s);

	}

}
