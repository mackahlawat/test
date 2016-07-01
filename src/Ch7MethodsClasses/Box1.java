package Ch7MethodsClasses;

public class Box1 {
	double width;
	double height;
	double depth;

	// Notice this constructor.it takes an object type box
	Box1(Box ob) { // pass object the constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor when all dimensions specified
	Box1(double w, double h, double d) {                
		width = w;
       height = h;
       depth = d;
       
	   }

	// constructor when no dimensions specified
	Box1() {
		   width = -1; // use -1 to indicates
		   height = -1; // uninitialized
		   depth = -1; // box
	   }

	// constructor when cube is created
	Box1(double len) {
		   width = height = depth = len;
	   }

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}