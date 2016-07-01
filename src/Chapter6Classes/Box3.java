package Chapter6Classes;

public class Box3 {

	double width;
	double height;
	double depth;

	     // compute and return value
	       double volume() {
	    	   return width * height * depth;
	}
	       // set dimensions of box
	       void setDim(double w, double h, double d) {
	    	   width = w;
	    	   height = h;
	    	   depth = d;
	    	   
	       }
}
