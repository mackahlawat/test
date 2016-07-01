package day2.classandobject;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee alex,linda,john;
		
	/*	alex = new Employee();
		linda = new Employee();
		john = new Employee();*/
		  
	    alex = new Employee();
		 linda = new Employee();
		 john = new Employee();
		
		alex.salary = 90000;
		alex.bonus = 20000;
		alex.calculateTotalPay();
		
		linda.salary = 230000;
		linda.bonus = 10000;
		linda.calculateTotalPay();
		
		john.salary = 300000;
		john.bonus =12000;
		john.calculateTotalPay();

	}

}
