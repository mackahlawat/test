package Ch7MethodsClasses;

public class Box {
	double width;
	double height;
	double depth;

	// constructors used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// constructors used when no dimensions specified
	Box() {
     width = -1;// -1 used to indicate 
     height = - 1;// uninitialized
     depth = -1;//box
	}
	//constructors used when cube is created
	Box(double len) {
		width = height = depth = len;
	}
	// compute and return volume
	double volume() {
	return width * height * depth;
	}
}
