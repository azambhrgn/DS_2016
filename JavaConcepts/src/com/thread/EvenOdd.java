package com.thread;

public class EvenOdd {
	static Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				for (int i = 1; i < 10; i++) {
					synchronized (lock) {

						if (i % 2 == 0) {
							System.out.println("th1 "+i);
						}

						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				for (int i = 0; i < 10; i++) {
					synchronized (lock) {

						if (i % 2 != 0) {
							System.out.println("th2 "+i);
						}

						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});

		t1.start();
		System.out.println("main");
		t2.start();
		
		try {
			t2.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
