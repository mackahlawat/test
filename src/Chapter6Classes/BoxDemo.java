package Chapter6Classes;

class BoxDemo {
	double width;
	double height;
	double depth;
	
	public static void main(String[] args) {
		BoxDemo mybox = new BoxDemo();
		double vol;
		
		// assign values for instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		
		// compute the volume of box
		vol = 	mybox.width * mybox.height * mybox.depth;
		
		System.out.println("Volume is " + vol);

	}

}
