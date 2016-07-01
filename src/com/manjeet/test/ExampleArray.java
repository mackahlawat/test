package com.manjeet.test;

public class ExampleArray {

	public static void main(String[] args) {
	
		/*int a = 30;
		int b = 40;
		int c, d , e;
		c = 50 ;
		d = 60 ; e = 70 ;
		*/
		/*int a1 = 30;
		int a2 = 40;*/
		
		int [] a = {30, 40 ,50, 60, 70};
		
		System.out.println(a[1]  + " "+ a[3]);
		
		//enhancedfor
		  for(int temp : a){
			  System.out.println(temp);
		  }
		  System.out.println("---------");
			  int [] x = new int [5];
			  x [2] = 25;
			  x [4] = 12;
			  
			  for(int temp2: x){
				  System.out.println(temp2);
				  String [] st={"One"," Two"," Three"};
				  
				  for (String temp: st){
					  System.out.println(temp);
				  }
			  }System.out.println("---------");
			  String [] stx  =new String[5];
			  stx [3] ="25";
			  stx [0] = "12";
			  for(String temp2 :stx){
				  System.out.println(temp2); 
			  }
			  
		  }

	}









