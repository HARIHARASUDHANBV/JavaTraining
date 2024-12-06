package com.Day3;

class A {
	A() {
		System.out.println("The Constructor of A");
	}

	A(int b) {
		System.out.println("Parameterized Constructor of A");
	}
}

class B extends A {
	int a;

	B() {
		this(10.8f);
		System.out.println("Constructor of B");
	}

	B(float b) {
		System.out.println("Parameterized constructor of B");
	}
}

public class ConstructorInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();

	}

}