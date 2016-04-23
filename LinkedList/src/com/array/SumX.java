package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumX {

	// Write a C program that, given an array A[] of n numbers and another
	// number x, determines whether or not
	// there exist two elements in S whose sum is exactly x.
	public boolean sol1(int arr[], int X) {
		Arrays.sort(arr);

		int l = arr.length;
		int last = l - 1;
		for (int i = 0; i < l; i++) {
			if (arr[i] + arr[last] > X) {
				last--;
			} else if (arr[i] + arr[last] < X) {
				i++;
			} else {
				System.out.println(arr[i] + "  "+ arr[last]);
				return true;
			}

		}

		return false;
	}

	public boolean sol2(int arr[]) {

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumX obj=new SumX();
		
		int arr[] = {1,3,2,5,9};
		int X=7;
		System.out.println(obj.sol1(arr, X));
		
	}

}
