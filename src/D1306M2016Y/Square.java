package D1306M2016Y;

public class Square {
	
	public double side;
	
	public double perimeter() {
		return 4 * side;
		
	}
	  
	public double area() {
		return side * side;
	}
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	 public static void main(String[] args) {
      Square s = new Square();
            s.setSide(10);
            
            double area = s.area();
            double perimeter = s.perimeter();
            System.out.println("area and perimeer are: " + area + ", " + perimeter);
          }		
	   }


