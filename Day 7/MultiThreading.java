package com.Day7;

class MyThread extends Thread {
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

public class MultiThreading {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		int t1 = Thread.MAX_PRIORITY;
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t2.setName("T1");
		t3.setName("T2");
		t2.start();
		t3.start();
		System.out.println("Main End");
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getState());
		System.out.println(t.getStackTrace());
		System.out.println(t.getContextClassLoader());

	}

}
