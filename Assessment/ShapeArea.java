package com.assessment;

import java.util.Scanner;

class Shape {
	int length, breadth;
	Scanner in = new Scanner(System.in);

	void getArea() {
		System.out.println("Calculating the Area of a Rectangle:");
	}
}

class Rectangle1 extends Shape {
	int area;
	Scanner in = new Scanner(System.in);

	@Override
	void getArea() {
		System.out.println("Enter the length:");
		length = in.nextInt();
		System.out.println("Enter the breadth:");
		breadth = in.nextInt();
		area = length * breadth;
		System.out.println("The Area of a rectangle is:" + " " + area);
	}
}

public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rectangle = new Rectangle1();
		rectangle.getArea();
	}

}
