package day1.exercises;

public class ExampleSum {

	public static void main(String[] args) {
	   int lowerbound = 9;
	   int upperbound = 888;
	   int sum = 0;
	   
	   int number = lowerbound;
	   while (number <= upperbound){
		   sum = sum + number;
		   ++ number;
		   
System.out.println("The sum from "+ lowerbound+" to "+ upperbound+" is "+  sum);
		   
	   }
	   

	}

}
