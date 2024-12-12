package com.Day4;

class Method {
	int a, b;
	double c, d;

	public Method(String a, String b) {
		if (a.equals(b)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public Method(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
	}

	public Method(double x, double y) {
		this.c = x;
		this.d = y;
		System.out.println(x + " " + y);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method meth = new Method(5, 6);
		Method meth2 = new Method(76.4, 40.5);
		Method meth3 = new Method("Java", "Java");
	}

}
