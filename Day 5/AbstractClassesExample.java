package com.Day5;

abstract class MyAbstractClass {
	void myConcreteMethod() {
		System.out.println("This is a method definition");
	}

	abstract void myAbstractMethod();

	abstract void myAbstractMethod1();
}

class AbstractExtend extends MyAbstractClass {
	void myAbstractMethod() {
		System.out.println("Class wich extends abstract class must imoplement the abstract methods");
	}

	void myAbstractMethod1() {
		System.out.println("My Abstract Method-2");
	}
}

public class AbstractClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractClass obj;
		obj = new AbstractExtend();
		obj.myAbstractMethod();
		obj.myAbstractMethod1();
	}

}
