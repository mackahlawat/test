package Chapter6Classes;

public class BoxDemo5 {

	public static void main(String[] args) {
		// declare,allocate and initialize of box objects
		Box4 mybox1 = new Box4();
		Box4 mybox2 = new Box4();
		
		double vol;
		
		// get volume of my first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// get volume of my second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);

	}

}
