package com.Day5;

abstract class Vehicle {
}

class Car extends Vehicle {
	Vehicle noOfWheels() {
		System.out.println("It has four wheels");
		return null;
	}

	Vehicle noOfEngines() {
		System.out.println("Six Cylinder engines");
		return null;
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Vehicle Revuelto = new Car().noOfEngines();
		@SuppressWarnings("unused")
		Vehicle Revuelto1 = new Car().noOfWheels();

	}

}
