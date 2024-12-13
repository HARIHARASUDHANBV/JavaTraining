package com.Day5;

interface VehiclePlan {
	void noOfEngines();

	void noOfWheels();

	void brandName();
}

abstract class Wheels implements VehiclePlan {
	public void noOfEngines() {
		System.out.println("I have one Engine");
	}
}

class SkateBoard extends Wheels {
	public void noOfWheels() {
		System.out.println("I have four wheels");
	}

	public void brandName() {
		System.out.println("The brand Name is Honda");
	}

}

public class InterfaceExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclePlan vic = new SkateBoard();
		vic.noOfEngines();
		vic.noOfWheels();
		vic.brandName();

	}

}
