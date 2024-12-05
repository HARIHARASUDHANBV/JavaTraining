// Types Of Variables
package com.Day2;

public class Variables {
	int b = 10; // Instance or Object variable
	static int c = 20; // Static or class Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30; // Local variable
		System.out.println(a);
		Variables obj = new Variables();
		System.out.println(obj.b);
		System.out.println(Variables.c);

	}

}
