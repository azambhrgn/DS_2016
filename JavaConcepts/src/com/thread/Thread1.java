package com.thread;

public class Thread1 extends Thread {

	public void run() {

		System.out.println("Theard 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 thr=new Thread1();
		thr.start();
	}

}
