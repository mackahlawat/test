package Chapter6Classes;

public class BoxDemo2 {

	public static void main(String[] args) {
		Box2 mybox1 = new Box2();
		Box2 mybox2 = new Box2();

		// assign value to mybox1's of instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;

		/* assign value to mybox2's of instance variables*/
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		//display volume 1st box
		mybox1.volume();
		
		// display volume 2nd box
		mybox2.volume();
	}

}
