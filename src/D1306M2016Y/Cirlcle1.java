package D1306M2016Y;

public class Cirlcle1 {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double perimeter() {
		return 2 * 3.14 * radius;
	}
	public double area() {
		return 3.14 * radius * radius;
	}
	public static void main(String[] args)  {
		Cirlcle1 c = new Cirlcle1();
		c.setRadius(30.6);
		double area = c.area();
		double perimeter = c.perimeter();
		System.out.println("area and perimeer are: " + area + ", " + perimeter);
		
		
		
		
		
		
	}
  }

			
		
	


