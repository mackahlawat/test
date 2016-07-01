package Ch7MethodsClasses;

public class Overload1 {

	public static void main(String[] args) {
	 OverloadDemo1 ob = new OverloadDemo1();
	 int i = 88;
	 
	 ob.test();
	 ob.test(10, 20);
	 
	 ob.test(i);// this is invoke test(double)
	 ob.test(123.2); // this will invoke test(double)

	}

}
