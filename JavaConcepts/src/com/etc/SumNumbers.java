package com.etc;

public class SumNumbers {

	public static void summation(int[] a, int[] b, int[] result,int k) {
		int la = a.length;
		int lb = b.length;
		int carry = 0;
		la--;
		lb--;
		while (la >= 0 && lb >= 0) {
			int sum = 0;
			sum = a[la] + b[lb] + carry;
			carry = sum / 10;
			// System.out.println("carry " + carry);
			if (carry > 0) {
				result[k] = sum % 10;

			} else {
				result[k] = sum;
			}
			k--;
			la--;
			lb--;
		}

		while (la >= 0) {
			int sum = 0;
			sum = a[la] + carry;
			carry = sum / 10;
			if (carry > 0) {
				result[k] = sum % 10;

			}
			result[k] = sum;
			k--;
			la--;

		}

		while (lb >= 0) {
			int sum = 0;
			sum = b[lb] + carry;
			carry = sum / 10;
			if (carry > 0) {
				result[k] = sum % 10;

			}
			result[k] = sum;
			k--;
			lb--;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2 ,3};
		int[] b = { 1,9,0,0};

		int l = (a.length > b.length ? a.length : b.length) + 1;
		int[] result = new int[l];
		summation(a, b, result,l-1);

		for (int i = 0; i < l; i++) {
			System.out.print(result[i]);
		}
	}

}
