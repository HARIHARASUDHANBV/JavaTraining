package com.assessment;

class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}

public class DogInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog("Kruger", "Doberman");
		Dog two = new Dog("Ace", "pug");
		one.setName("Ace");
		one.setBreed("Pommerian");
		System.out.println("The information of first dog is:" + " " + one.getName() +" "+ "of breed " + " " + one.getBreed());
		two.setName("Kruger");
		two.setBreed("Dobermann");
		System.out.println("The information of first dog is:" + " " + two.getName() + " "+"of breed" +" "+ two.getBreed());

	}

}
