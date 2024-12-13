package com.Day5;

interface I1 {
	void abstraction();
}

interface I2 extends I1 {
	void abstraction1();
}

class AbstractImplement implements I2 {
	public void abstraction() {
		System.out.println("The Interface extended another interface");
	}

	public void abstraction1() {
		System.out.println("Multiple Inheritance achieved");
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I2 interfaced = new AbstractImplement();
		interfaced.abstraction();
		interfaced.abstraction1();

	}

}
