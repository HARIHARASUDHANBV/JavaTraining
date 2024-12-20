package com.Day11;

@FunctionalInterface
interface MyInterface {
	int calc(int a, int b); // public and abstract
}

/*
 * //Without Lambda Expression
 * 
 * class Addition implements MyInterface { public int calc(int a, int b) {
 * return a + b; } }
 * 
 * class Subtraction implements MyInterface { public int calc(int a, int b) {
 * return a - b; } }
 */

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// With Lambda Expression.
		MyInterface ref = (a, b) -> a + b;
		System.out.println(ref.calc(100, 300));
		System.out.println(ref.calc(150, 100));

		ref = (a, b) -> a - b;
		System.out.println(ref.calc(100, 300));
		System.out.println(ref.calc(150, 100));
	}

}
