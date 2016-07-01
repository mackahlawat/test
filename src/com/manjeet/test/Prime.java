package com.manjeet.test;

public class Prime {
	
	public static void main(String[] args) {
		//System.out.println(isPrime(18));
		findPrimes(100);
	}
	
	public static void findPrimes(int n) {
		
		for(int i = 2; i <= n; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		int sqrt = (int) Math.sqrt(n);
		for(int i = 3; i <= sqrt; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

}
