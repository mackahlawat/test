package com.manjeet.test;

public class StarBoth {

	public static void main(String[] args) {
	
		
		for(int i = 0; i < 2*5 -1; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("* ");
			}
			if(i >= 5) {
				for(int j = 0; j < i + 1 - 5 + 1; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
	}
}


