package com.array;

public class Majority {

	// Majority Element: A majority element in an array A[] of size n is an
	// element that appears more than n/2 times (and hence there is at most one
	// such element).

	// Write a function which takes an array and emits the majority element (if
	// it exists), otherwise prints NONE

	public void findMajority(int arr[]) {
		int ind = 0;
		int count = 1;
		int l = arr.length;
		for (int i = 1; i < l; i++) {
			if (arr[i] == arr[ind]) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				ind = i;
				count = 1;
			}
		}

		if (count > 0 && isMajority(arr, arr[ind])) {
			System.out.println("Majority element is " + arr[ind]);
		} else {
			System.out.println("No majority");
		}
	}

	public boolean isMajority(int a[], int k) {

		int n = 0;
		int l = a.length;
		for (int i = 0; i < l; i++) {
			if (a[i] == k) {
				n++;
			}
		}
		if (n > l / 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Majority maj = new Majority();
		int arr[] = { 3, 3, 4, 3, 3, 4, 2, 4, 3, };

		maj.findMajority(arr);

	}

}
