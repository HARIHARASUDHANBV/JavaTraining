package com.Day4;

import java.util.Scanner;

class Bank {
	String name;
	int id;
	Scanner in = new Scanner(System.in);

	void display() {
		System.out.println("Enter the name of the bank");
		name = in.nextLine();
		System.out.println("Enter the id:");
		id = in.nextInt();
		System.out.println(name + " " + id);
		in.close();
	}

	static void show() {
		System.out.println("Superclass");
	}
}

class Finance extends Bank {
	@Override
	void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the repo rate:");
		int repo = input.nextInt();
		System.out.println("Enter the reverse repo rate:");
		int reverse = input.nextInt();
		System.out.println(repo + " " + reverse);
		input.close();
	}

	static void show() { // Static method cannot be overriden and while upcasting the subclass with a
							// static method will result in the execution of superclass method
		System.out.println("Subclass");
	}
}

public class MethodOverriding {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finance fin = new Finance();
		fin.display();
		Bank b = new Finance();
		b.show();
	}

}
