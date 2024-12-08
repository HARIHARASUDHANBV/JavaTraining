package com.assessment;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("The name of the person is:" + " " + name);
		System.out.println("The age of the person is:" + " " + age);
	}
}

public class PersonInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Hari = new Person("Hariharasudhan B V", 25);
		Person Moses = new Person("Moses Ravikumar Mindi", 50);
		Hari.display();
		Moses.display();
	}

}
