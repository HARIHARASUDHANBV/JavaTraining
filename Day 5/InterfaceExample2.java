package com.Day5;

//implements multiple interfaces
interface myInterface1 {
	void myAbstractMethod();
}

interface myInterface2 {
	void abstractMethod();
}

class MyClass1 implements myInterface1, myInterface2 {
	public void myAbstractMethod() {
		System.out.println("My abstract method-1");
	}

	public void abstractMethod() {
		System.out.println("My abstract method-2");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 class1 = new MyClass1();
		class1.myAbstractMethod();
		class1.abstractMethod();
	}

}
