package com.assessment;

class Vehicle {
	void drive() {
		System.out.println("This is superclass method");
	}
}

class Car extends Vehicle {
	@Override
	void drive() {
		System.out.println("The Car is being repaired");
	}
}

public class VehicleImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car lamborghini = new Car();
		lamborghini.drive();
	}

}
