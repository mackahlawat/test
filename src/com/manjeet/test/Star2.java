package com.manjeet.test;

public class Star2 {

	public static void main(String[] args) {
		
		/*int i , j;
		
			for(i = 5; i >= 1;i--)
			{
			for(j = 1; j <= i ; j++)
			{
				System.out.print("* ");
			
		}
        System.out.println();
	}*/
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
 