package com.recursion;

public class DigitSeq {

	public static void auxa(char[] in,char[] out,int d,int k) {
		
		if(d == k) {
			for(int i=0; i<k; i++) {
				System.out.print(out[i]);
			}
			System.out.println();
			return;
		}
		
		
		for(int i=0; i<k; i++) {
			out[d] = in[i];
			auxa(in, out, d+1,k);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=3;
		char[] in={'a','b','c'};
		char[] out=new char[k];
		auxa(in,out,0,k);
		
	}

}
