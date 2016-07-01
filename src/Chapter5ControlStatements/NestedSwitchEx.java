package Chapter5ControlStatements;

public class NestedSwitchEx {

	public static void main(String[] args) {
	    int i = 0;
	    switch (i) {
	    case 0:
	    	int j = 1;
	    	switch (j) {
	    	case 0:
	    		System.out.println("i is 0 and j is 0");
	    		break;
	    	case 1:
	    		System.out.println("i is 0 and j is 1");
	    		break;
	    		default:
	    			System.out.println("Nested default case!!");
	    	
	    	}
	    	break;
	    	default:
	    	System.out.println("No matching case found!!");
	    }

	}

}
