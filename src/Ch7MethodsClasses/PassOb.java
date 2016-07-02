package Ch7MethodsClasses;

public class PassOb {

	public static void main(String[] args) {
		TTest ob1 = new TTest(100, 22);
		TTest ob2 = new TTest(100, 22);
		TTest ob3 = new TTest(-1, -1);
		
		System.out.println("ob1 == ob2: " + ob1.equals(ob2));
		System.out.println("ob1 == ob3: " + ob1.equals(ob3));
 
	}

}
