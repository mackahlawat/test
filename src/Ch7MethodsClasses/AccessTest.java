package Ch7MethodsClasses;

public class AccessTest {

	public static void main(String[] args) {
	    Test3 ob = new Test3();
	    
	    // These are OK ,a and b are accessed directly
	    ob.a = 10;
	    ob.b = 20;
	    
	    // you must access c through this method
	    ob.setc(100);
	    System.out.println(" a, b and c: " + ob.a +" "+ ob.b+" "+ ob.getc());
		

	}

}
