package com.manjeet.test;

public class RunningNumberSum {

	public static void main(String[] args) {
		
		int lowerbound = 1; //store to lowerbound
		int upperbound =1000; //store to Upperbound
int sum = 0; //Declare an int variable "sum" to accumulate the no 
             //Set the initial sum = 0
 //Use a while loop repeatedly sum from the lowerbound to upperbound
        int number = lowerbound;
        while (number <= upperbound){
        	sum = sum + number ;//Accumulate number into sum
        	++ number;         //Next number
        	
        }
        //print the result
System.out.println("The sum from"+lowerbound +"to"+upperbound+"is" +sum);

	}

}
