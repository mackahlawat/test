package day1.exercises;

public class ExercisesB {

	public static void main(String[] args) {
		
		String[] nums = {"50" ,"60" ,"70" ,"80"};
		int total = 0;
		
		for( String temp: nums){
		total += Integer.parseInt(temp);
		}
		
		System.out.println("Total = " + total);
		
		
	}

	}


