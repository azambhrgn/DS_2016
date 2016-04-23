package com.recursion;

public class Power {

	public static long powerRecursion(int x,int n) {
		
		if(n==0) return 1;
		if(n==1) return x;
		
		if(n%2 == 0) {
			return powerRecursion(x, n/2)*powerRecursion(x, n/2);
		} else {
			return x*powerRecursion(x, n/2)*powerRecursion(x, n/2);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The result is " + powerRecursion(2, 10));
		
	}

}
