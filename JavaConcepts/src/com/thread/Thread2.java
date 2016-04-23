package com.thread;

public class Thread2 implements Runnable{

	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread2 t2=new Thread2();
		Thread thr2=new Thread(t2);
		
		thr2.start();
	}

}
