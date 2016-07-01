package day1.exercises;

public class Example2 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++){
			
			boolean by2 = i % 2 == 0;
			boolean by6 = i % 6 == 0;
			boolean notBy12 = i % 12 != 0;
			
			if((by2 || by6) && notBy12)
			
			
			if(((i % 2 == 0) || (i % 6 == 0)) && (i % 12 != 0))
			
			
			if((i % 2 % 6)||(i% 12 != 0)){
				System.out.println(i);
				
			}
		}

	}

}
