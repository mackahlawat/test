package D1306M2016Y;

public class ElementsArrayA {

     public int findLess(int[] array, int number) {
    	 int less  = 0;
        for (int i = 0; i < array.length; i++) {
        	if(array[i] < number) {
        		less++;
        	}
        }
        return less;
     }
	}


