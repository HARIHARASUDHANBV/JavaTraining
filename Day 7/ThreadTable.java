package com.Day7;

class TwoTable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 2 = " + (i * 2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

class FiveTable extends Thread {
	@Override
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * 5 = " + (i * 5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class TablesThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new TwoTable());
		t1.setName("Two");
		t1.start();

		FiveTable t2 = new FiveTable();
		t2.setName("Five");
		t2.start();

	}

}
