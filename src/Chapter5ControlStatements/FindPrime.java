package Chapter5ControlStatements;

public class FindPrime {

	public static void main(String[] args) {
		int num;
	    boolean isprime = true;
	    
	    num = 16;
	    for(int i = 2; i <= num/i; i++) {
	    	if((num % i) == 0) {
	    		isprime = false;
	    		break;
	    	}
	    }
        if (isprime) System.out.println("Prime");
        else System.out.println("Not Prime");
	}

}
