package com.Day4;

class Singleton {
	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		} else {
			singleton = null;
		}
		return singleton;
	}

	public void showMessage() {
		System.out.println("Hello from the Singleton class!");
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}
}
