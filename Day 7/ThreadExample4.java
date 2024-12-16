package com.Day7;

//Thread creation by implementing Runnable interface
class Thread4 implements Runnable {
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

public class ThreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Thread4());
		t1.setName("T5");
		t1.start();
	}

}
