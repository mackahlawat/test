package Chapter3DataTypes;

public class Scope {

	public static void main(String[] args) {
		int x ; // known to all code with in main
		
		x = 20;
		if(x == 20) { //start anew scope
			int y = 30;//known only to this block 
			
			// x and y are both known here
			System.out.println("x and y : " + x + " " + y);
			x = y * 2;
			
			// y = 100; shows an error
			// x is known here x
			System.out.println("x is :" + x);
		}
	}
}
