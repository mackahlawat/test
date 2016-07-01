package Chapter6Classes;

public class BoxDemo4 {

	public static void main(String[] args) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		double vol;
		
		// initialize each box
		mybox1.setDim(12, 30, 45);
		mybox2.setDim(4, 8 , 9);
		
		// get volume mybox1's
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of mybox2's
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		

	}

}
