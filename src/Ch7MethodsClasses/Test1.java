package Ch7MethodsClasses;

public class Test1 {
	int a , b;
	
	Test1(int i , int j ) {
		a = i;
		b = j ;
		
	}
      // pass by value
	void meth(Test1 o) {
		o.a  *= 2;
		o.b /= 2;
	}
}
