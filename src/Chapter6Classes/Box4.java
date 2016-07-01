package Chapter6Classes;

public class Box4 {
	double width;
	double height;
	double depth;
	
     // this is the constructor for box.
	Box4() {
		System.out.println("Constructor box");
		width = 10;
		height = 10;
		depth = 10;
	}
      // compute and return volume
	double volume() {
		return width * height * depth;
	}
}
