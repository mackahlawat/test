package Ch7MethodsClasses;

public class Outer {
	
	int outer_x = 100;
	
	
	void test() {
		Inner inner = new Inner();
		   inner.display();
	}
	// this is a inner class
	class Inner {	
	void display()  {
	System.out.println("display:  outer_x = " + outer_x);
      }
	
	}
}
