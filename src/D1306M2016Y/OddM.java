package D1306M2016Y;

public class OddM {

	public int findOdd(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				count++;
			}
		}
		return count;

	}
	 public static void main(String[] args){
		 int[] s = {2,5,1,7, 4, 5, 4, 6, -1 , 101};
		 OddM o = new OddM();
		 int odd = o.findOdd(s);
		 System.out.println(odd);
	}
		
}
