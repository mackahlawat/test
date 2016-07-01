package com.manjeet.test;

public class ArraySum {

	public static void main(String[] args) {
		
		int i = 0;
		int  sum =0;
		int [] a = {30, 40 ,50, 60, 70};
		for( i = 0; i < 5; i++){
			sum = sum + a[i];
			
			// i++ = i + 1	
			//for (initial value; condition; increment/decrement)
			System.out.println("Sum:" + sum);
		}
		System.out.println("outside Sum:" + sum);
	}

}
