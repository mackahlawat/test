package Ch7MethodsClasses;

public class Outer1 {

	int outer_x = 100;

	void test() {
		for (int i = 0; i < 10; i++) {
			class Inner {
				void displays() {
					System.out.println("display: outer_x " + outer_x);
				}
				}
			Inner inner = new Inner();
			inner.displays();
		}
	}

}
