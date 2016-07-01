package Ch7MethodsClasses;

public class OverloadCons2 {

	public static void main(String[] args) {
		// creates boxes using the various constructors
		Box1 mybox1 = new Box1(10, 20, 15);
		Box1 mybox2 = new Box1();
		Box1 mycube = new Box1(7);
		
		Box1 myclone = new Box1(); //create copy of mybox1
	
		double vol;
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		
		//get volume of clone
		vol = myclone.volume();
         System.out.println("Volume of clone is " + vol);
	}

}
