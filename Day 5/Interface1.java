package com.Day5;

interface myInterface {
	void myAbstractMethod();

	void abstractMethod();
}

class MyClass implements myInterface {
	public void myAbstractMethod() {
		System.out.println("My abstract method-1");
	}

	public void abstractMethod() {
		System.out.println("My abstract method-2");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface object = new MyClass();
		object.myAbstractMethod();
		object.abstractMethod();
	}

}
