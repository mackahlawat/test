package Chapter6Classes;

public class Box {
	double width;
	double height;
	double depth;

	public static void main(String[] args) {
	    Box mybox1 = new Box();
	    Box mybox2 = new Box();
	    double vol;
	    
	    //assign the values of 1st instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		/*assign the values of 2nd instance variables*/
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// compute volume 1st mybox
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol);
		
		// compute volume 2nd mybox
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume is " + vol);


	}

}
