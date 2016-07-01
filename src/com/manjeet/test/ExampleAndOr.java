package com.manjeet.test;

public class ExampleAndOr {

	public static void main(String[] args) {
		
		int x , y;
		
		x = 10;
		y = -10;
		if (x > 0 && y > 0){
		System.out.println("Both num are +ve");
		
		}else if(x > 0 || y > 0){
		System.out.println("At least 1 num +ve");
		
		}else {
			System.out.println("Both num are -ve");
			
		}
		

	}

}
