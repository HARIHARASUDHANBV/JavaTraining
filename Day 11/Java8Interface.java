package com.Day11;

interface MyInterface1 {
	void myMethod();

	default void myDefaultMethod() {
		System.out.println("This is a Concrete method of Scope default");
	}

	static void myStaticMethod() {
		System.out.println("This is a Static method");
	}
}

class MyClass1 implements MyInterface1 {
	public void myMethod() {
		System.out.println("The Abstract method is implemented here");
	}
}

public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface1 inter = new MyClass1();
		inter.myDefaultMethod();
		MyInterface1.myStaticMethod();
		inter.myMethod();

	}

}
