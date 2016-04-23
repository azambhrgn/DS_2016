package com.array;

public class ArrayRotation {

	// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d
	// elements.
	// There are some better algorithm for rotation please check
	public static void rotate(int[] arr, int d) {
		
		for (int i=0;i<d ;i++) {
			moveArray(arr);
		}
		
		System.out.println(arr);
	}

	public static void moveArray(int[] arr) {

		int temp = arr[0];
		int l = arr.length;
		for (int i = 0; i < (l-1); i++) {
			arr[i] = arr[i+1];
		}
		arr[l-1] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3;

		rotate(arr, d);
		
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
