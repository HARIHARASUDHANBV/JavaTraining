package com.assessment;

class Animal {
	void makeSound() {
		System.out.println("This is the animal class");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("The cat is mewing");
	}
}

public class AnimalSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat anubis = new Cat();
		anubis.makeSound();
	}

}
