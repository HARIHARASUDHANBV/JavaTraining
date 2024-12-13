package com.Day5;

//Abstract class with constructor.
abstract class Vehicle1 {
	Vehicle1() {
		this(5);
		System.out.println("Constructor for the abstract class:");
	}

	Vehicle1(int a) {
		System.out.println("Hi");
	}

	void noOfEngine() {
		System.out.println("I have one Engine ");
	}

	abstract void noOfWheels();

	abstract void brandName();
}

class Bike extends Vehicle1 {
	Bike() {
		super();
	}

	void noOfWheels() {

		System.out.println("It has four wheels");
	}

	void brandName() {
		System.out.println("Brand name is Yamaha");

	}
}

public class AbstractClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vehicle = new Bike();
	}

}
