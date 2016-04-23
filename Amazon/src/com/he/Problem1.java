package com.he;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
	public static int findGCD(int a, int b) {
		/*int gcd = 1;

		for (int i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
*/
		if(b == 0) {
			return a;
		}
		return findGCD(b,a%b);
	}

	public static int func(int x) {
		int sum = 0;
		int gcd =0;
		for (int i = 1; i <= x; i++) {
			if(x == i) {
				gcd =x;
			} else if(i%2 != 0 && x/2 == 0) {
				gcd =1;
			} else {
				gcd = findGCD(i, x);
			}
			sum += gcd;
		}

		return sum;
	}

	public static int calculateC(int[] arr, int x, int y) {
		int res = 0;
		int M = 1000000007;
		while (x <= y) {
			res = (res + func(arr[x]))%M;
			x++;
		}
		//System.out.println("M " + M);
		return res%M;
	}

	public static void calculateU(int[] arr, int x, int y) {

		arr[x] = y;

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Test input
		3
		3 4 3
		6
		C 1 2
		C 1 3
		C 3 3
		U 1 4
		C 1 3
		C 1 2
		*/

		//System.out.println("Input ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		//System.out.println("t " + t);
		int[] ar = new int[t + 1];
		ar[0] = 0;
		
		String str = br.readLine();
		String[] inp = str.split(" ");

		for (int i = 1; i <= t; i++) {
			ar[i] = Integer.parseInt(inp[i-1]);
		}
		//printArray(ar);
		t = Integer.parseInt(br.readLine());
		//System.out.println("t " + t);
		String fnct;
		int a, b;

		while (t > 0) {
			//System.out.println("t in loop "+t);
			str = br.readLine();
			inp = str.split(" ");

			fnct = inp[0];
			a = Integer.parseInt(inp[1]);
			b = Integer.parseInt(inp[2]);
			//System.out.println(fnct + a + b);
			if (fnct.equals("C")) {
				//System.out.println("hello");
				System.out.println(calculateC(ar, a, b));
			} else {
				//System.out.println("hi");
				calculateU(ar, a, b);
			}
			//System.out.println("No way");
			t--;
		}

		/*int[] arr = { 0, 3, 4, 3 };
		printArray(arr);
		System.out.println(calculateC(arr, 1, 2));
		System.out.println(calculateC(arr, 1, 3));
		System.out.println(calculateC(arr, 3, 3));
		calculateU(arr, 1, 4);
		printArray(arr);
		System.out.println(calculateC(arr, 1, 3));
		System.out.println(calculateC(arr, 1, 2));*/

	}

}
