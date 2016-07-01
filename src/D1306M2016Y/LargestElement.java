package D1306M2016Y;

public class LargestElement {
	
	public int findLargest(int[] array) {
		
		int largest = 0;
		
		int n = array.length;
		for (int i = 0; i < array.length; i++) {
		 if (array[i] > largest) {
			 largest = array[i]; 
		 }
		}
		return largest;
		
	}
	public static void main(String[] args) {
		int [] array = {2,1,5,7};
		LargestElement le = new LargestElement();
		int largest = le.findLargest(array);
		System.out.println("largest is : " + largest);
		
	}
}
