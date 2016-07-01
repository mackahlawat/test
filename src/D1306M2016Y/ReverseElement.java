package D1306M2016Y;

public class ReverseElement {

	public int[] reverse(int[] array) {

		int[] reverse = new int[array.length];

		int n = array.length;

		for (int i = 0; i < array.length; i++) {
			reverse[n - 1 - i] = array[i];

		}
		return reverse;
	}
	
	public static void main(String[] args) {
		int[] s = {2,3,6,5};
		ReverseElement re = new ReverseElement();
		int[] answer = re.reverse(s);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

}
