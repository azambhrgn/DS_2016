package com.sort;

public class MergeSort {

	public void mergeSort(int[] arr) {

		int l = arr.length;
		int mid = l / 2;
		if (l < 2) {
			return;
		}

		int[] left = new int[mid];
		int[] right = new int[l - mid];
		int i = 0;
		for (; i < mid; i++) {
			left[i] = arr[i];
		}

		for (; i < l; i++) {
			right[i - mid] = arr[i];
		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);

	}

	public void merge(int[] left, int[] right, int[] arr) {
		int l = left.length;
		int r = right.length;
		int i = 0, j = 0, k = 0;

		while (i < l && j < r) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < r) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public void display(int[] arr) {
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 2, 2, 1, 3, 5 };
		MergeSort mrg = new MergeSort();
		mrg.mergeSort(arr);
		mrg.display(arr);

	}

}
