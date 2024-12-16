package com.Day7;

//Static Import
import static java.lang.Math.PI;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class Static {
	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ways to call Static variable.
		out.println(a);
		out.println(Static.a);
		out.println(new Static().a); // Ill-advised.Variable 'a' should be accessed in a static way
		out.println(PI);
		int a1 = parseInt("345");
		out.println(a1);
	}

}