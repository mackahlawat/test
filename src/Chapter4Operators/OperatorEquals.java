package Chapter4Operators;

public class OperatorEquals {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		int c = 4;
		
		a += 5;
		b *= 4;
		c = a * b;
		c %= 6;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
