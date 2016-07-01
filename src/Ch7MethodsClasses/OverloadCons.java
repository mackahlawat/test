package Ch7MethodsClasses;

public class OverloadCons {

	public static void main(String[] args) {
		// create boxes when using the various constructors
		Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
	    Box mycube = new Box(7);
	    
	    double vol;
	    
	    // get volume of first box
	    vol = mybox1.volume();
	    System.out.println("Volume is " + vol);
	    
	 // get volume of second box
	    vol = mybox2.volume();
	    System.out.println("Volume is " + vol);
	    
	    // get volume of cube 
	    vol = mycube.volume();
	    System.out.println("Volume of mycube is " + vol);
	}

}
