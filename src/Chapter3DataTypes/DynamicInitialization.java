package Chapter3DataTypes;

public class DynamicInitialization {

	public static void main(String[] args) {
		double a = 5.0 ;
		double b = 7.0;
		
		// c is dynamically intialized
		double c = Math.sqrt(a * a + b * b);
		
		System.out.println("Hypotenuse is " + c);
				

	}

}
