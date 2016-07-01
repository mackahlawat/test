package day1.exercises;

public class SumAndAverage {

	public static void main(String[] args) {
		int lowerbound = 1;
		double upperbound = 1000;
		double average ;
		int sum = 0;
		
		int number = lowerbound;
		while (number <= upperbound) {
			sum = sum + number;
			++number;
			average = sum/upperbound;
			
			
System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum); 
		System.out.println("The average = " + average);

		}
	
	
	
     }

}


