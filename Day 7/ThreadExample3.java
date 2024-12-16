package com.Day7;

class Thread3 extends Thread {
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

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread3 obj = new Thread3();
		obj.setName("T3");
		obj.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		obj.join();
	}

}
