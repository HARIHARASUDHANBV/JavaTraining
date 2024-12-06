package com.Day3;

class OneVehicle {
	void display() {
		System.out.println("I have a Wheel");
	}
}

class TwoWheeler extends OneVehicle {
	void noOfWheels() {
		System.out.println("I have a vehicle with two wheels");
	}
}

class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("Brand is Royal Enfield");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bullet350 = new Bike();
		bullet350.display();
		bullet350.noOfWheels();
		bullet350.brandName();

	}

}