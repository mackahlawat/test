package Chapter3DataTypes;

public class PromotionRules {

	public static void main(String[] args) {
	byte b = 30;
	char c = 'b';
	short s = 432;
	int i = 40000;
	float f =6.54f;
	double d = 33.6352;
	
	double result = (f * b) + (i / c) - (d * s);
	System.out.println((f * b) + " + " + (i / c) + " - " +(d * s));
	System.out.println("result = " + result);
	}

}
