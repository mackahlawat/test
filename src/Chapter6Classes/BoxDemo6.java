package Chapter6Classes;

public class BoxDemo6 {

	public static void main(String[] args) {
		// allocates,declares initialize of Box objects
		Box5 mybox1 = new Box5(20 , 30 ,45);
		Box5 mybox2 = new Box5(7 , 9 , 8);
		
		double vol;
		
		// get volume of first box
		 vol = mybox1.volume();
			System.out.println("Volume is " + vol);
			
        // get volume of second box
			vol = mybox2.volume();
			System.out.println("Volume is " + vol);
	}

}
