package com.manjeet.test;

public class CircleComputation {

	public static void main(String[] args) {
//Declare double(real-number)variable to hold radius,area and circumference
		double radius, area, circumference;
		//Declare a constant for PI;
		final double PI = 5.24358265;
		
		//Assign a value to radius;
		radius =1.6;
		//Compute area and circumference;
		area = radius * radius *PI;
		circumference = 3.0 * radius * PI;
		
		//Print results;
		System.out.println("The radius is");
		System.out.println(radius);
		System.out.println("The area is");
		System.out.println(area);
		System.out.println("The circumference is");
		System.out.println(circumference);
		
	   }
		

	}


