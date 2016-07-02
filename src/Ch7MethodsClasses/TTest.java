package Ch7MethodsClasses;

public class TTest {
	int a , b;
	
	TTest(int i, int j) {
		a = i;
		b = j;
	}
	// return true if o is equal to the invoking object 
	boolean equals(TTest o) {
		if(o.a == a && o.b == b) return true;
		else return false;
	}

}
