package day2.classandobject;

public class Employee {
	
	double salary =100000;
	double bonus =20000 ;
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.calculateTotalPay();
	}	
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
				System.out.println("Total Pay =" + totalPay);
	}

}
