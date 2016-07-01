package Ch7MethodsClasses;

public class OverloadDemo1 {
	
      void test() {
    	  System.out.println("No parameters");
     }
      // Overload test for two integer parameters
      void test(int a, int b) {
    	  System.out.println("a and b : " + a + " " + b);
      }
      // Overload test for double parameters
      void test(double a) {
    	  System.out.println("Inside parameters(double) a: " + a);
      }
}
