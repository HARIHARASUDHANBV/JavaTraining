package com.Day4;

import java.util.Scanner;

//Method overloading 
class MyClass {
	void myMethod(int a) {
		int s, n, r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of years for interest:");
		n = scan.nextInt();
		System.out.println("Enter the rate of interest:");
		r = scan.nextInt();
		s = a * n * r / 100;
		System.out.println("The Simple Interest is:" + " " + s);
		scan.close();
	}

	int myMethod(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("The values after swap:" + " " + a + " " + b);
		return temp;
	}

	void myMethod(String name) {
		System.out.println("Welcome" + " " + name);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass overload = new MyClass();
		overload.myMethod(5000);
		overload.myMethod(5, 7);
		overload.myMethod("Inzamam");

	}

}
