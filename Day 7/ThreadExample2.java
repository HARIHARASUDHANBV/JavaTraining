package com.Day7;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + " is Running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t2 = new MyThread();
		t2.setName("T1");
		t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println(t2.getState());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}

}
