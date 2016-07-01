package Chapter6Classes;

public class Box5 {
                 
        double width;
        double height;
        double depth;
        
        // this is a constructor Box
        Box5(double w, double h, double d) {
        	width = w;
        	height = h;
        	depth = d;
        	
        }
        // compute and return volume
        double volume() {
        	return width * height * depth;
        }
	}

