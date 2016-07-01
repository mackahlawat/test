package Chapter3DataTypes;

public class ConversionTCandCasting {

	public static void main(String[] args) {
	 byte b;
	 int i = 233;
	 double d = 350.423;
	 
	 System.out.println("\nConversion of int to byte.");
	 b = (byte) i;
	 System.out.println("i and b " + i + " " + b);
	 
	 System.out.println("\nCoversion of double to int.");
	 i = (int) d;
	 System.out.println("d and i " + d + " " + i);
	 
	 System.out.println("\nConversion of double to byte.");
	 b = (byte) d;
	 System.out.println("d and b " + d + " " + b);

	}

}
