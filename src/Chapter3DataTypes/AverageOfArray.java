package Chapter3DataTypes;

public class AverageOfArray {

	public static void main(String[] args) {
		
		double nums[] = {12.2, 13.3, 14.4, 15.5, 16.6, 17.7};
		double result = 0;
		int i;// sum = 0
		
		for(i = 0; i < 6; i++)
	     result = result + nums[i];
	     System.out.println("Average is " + result / 6);
		

	}

}
