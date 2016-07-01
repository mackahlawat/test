package Chapter6Classes;

public class BoxDemo3 {
	
	public static void main(String args []) {
	
			Box1 mybox1 = new Box1();
			Box1 mybox2 = new Box1();
			double vol;
			
			// assign values mybox1's of instance variables
			mybox1.width = 10;
			mybox1.height = 20;
			mybox1.depth = 15;
			
			/* assign values mybox2's of instance variables*/
			mybox2.width = 3;
			mybox2.height = 6;
			mybox2.depth = 9;
			
	   // get volume first box
			vol = mybox1.volume();
			System.out.println("Volume is " + vol);
			
			// get volume second box
			vol = mybox2.volume();
			System.out.println("Volume is " + vol);
     }
}
