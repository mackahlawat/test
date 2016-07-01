package com.manjeet.test;

import java.util.Scanner;

public class RectangleComputataion {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the length of Rectangle:");
		 double length = scanner .nextDouble();
		 System.out.println("Enter the width of rectangle:");
		 double width =  scanner .nextDouble();
		 double area = length * width;
		 double perimeter = 2*(length + width);
		 
 System.out.printf(" The Area of a Rectangle = %.5f\n",area );
		
		
        
	}

}
