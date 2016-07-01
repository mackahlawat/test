package Chapter3DataTypes;

public class LifeTime {

	public static void main(String[] args) {
		int x ;
		
		for(x = 0 ; x < 6; x++) {

		int y = -1;// y is initialized to block enter the number
		System.out.println("y is: " + y);// this prints -1
		y = 100;
		System.out.println("y is now: " + y);
		
		}
	}

}
