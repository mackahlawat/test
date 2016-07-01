package D1306M2016Y;

import java.util.Scanner;

public class Rectangle {
	double length;
	double width ;
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}
	 public double perimeter() {
		 return 2 *(length + width);
	 }
	public double area() {
		return length*width;
		
	}
	
	 public static void main(String[] args) {
       Rectangle r = new Rectangle();
             r.setLength(10);
             r.setWidth(20.3);
	
		 double area = r.area();
		 double perimeter = r.perimeter();
		 
         System.out.printf(" The Area of a Rectangle = %.5f\n",area );
         System.out.printf(" The Perimeter of a Rectangle = %.5f\n", perimeter );
		
		
	}

}
