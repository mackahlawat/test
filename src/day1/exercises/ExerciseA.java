package day1.exercises;

public class ExerciseA {

	public static void main(String[] args) {
	
		double Salary = 20000.65;
		double tax = 0.0;
		
		
		if( Salary <= 15000){
		      tax = Salary * .10;
		      
		} else if (Salary <= 40000){
		    	  tax = Salary * .20;
		    	  
		}else {
			tax = Salary * .30;
			System.out.println("Tax  " + tax);
		    	  
		      }
		}

	}


