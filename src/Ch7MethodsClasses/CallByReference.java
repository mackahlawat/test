package Ch7MethodsClasses;

public class CallByReference {

	public static void main(String[] args) {
	     Test1 ob = new Test1(15, 20);
	     
	     System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
	     
	     ob.meth(ob);;
	     
	     System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);

	}

}
