package D1306M2016Y;

public class Triangle {
	
      private double a;
      private double b;
      private double c;
	
	  public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	 public double perimeter() {
	        return 2*(a + b + c)/2;
	 }
	 public double area() {
	         double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }

    public boolean isEquilateral() {
    	 if (a == b && b == c)
    	 return false;
    	 else return true;
    }


      public boolean isIsoceles() {
        if (a == b || b == c || c == a)
        return true;
        else return false;
}
       public boolean isScalan() {
    	  if(a != b && b!= c && c != a)
    	  return true;
    	  else return false;
    	  
	  
  }
    
      public static void main(String[] args) {
		  Triangle t = new Triangle();
		  
		         t.setA(6.6);
		         t.setB(5.9);
		         t.setC(7.5);
	
		         
		         
		         double area = t.area();
		            double perimeter = t.perimeter();
		            System.out.println("area and perimeer are: " + area + ", " + perimeter);
		            System.out.println(t.isEquilateral());
		            System.out.println(t.isIsoceles());
		            System.out.println(t.isScalan());
	   
	    
	}
}
