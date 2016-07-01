package com.manjeet.test;

public class PrintDayInWord {

	public static void main(String[] args) {
		
		int print = 6;
		if(print >=0 && print<=6)
		switch (print)
		{
		case 1:System.out.println("SUNDAY");
		break;
		case 2:System.out.println("MONDAY");
		break;
		case 3:System.out.println("TUESDAY");
		break;
		case 4:System.out.println("WEDNESDAY");
		break;
		case 5:System.out.println("THRUSDAY");
		break;
		case 6:System.out.println("FRIDAY");
		break;
		case 7:System.out.println("SATURDAY");
		break;
		default:System.out.print("Not a Valid Day");
		
	}

}
}
