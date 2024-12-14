package com.Day6;

class MyClass {
	static int count = 0;

	MyClass() {
		count++;
		System.out.println(count);
	}

	@Override
	protected void finalize() throws Throwable {
		count--;
		System.out.println(count);
	}

}

public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		obj1 = null;
		System.gc();
		obj2 = null;
		System.gc();
		Runtime.getRuntime().gc();

	}

}
