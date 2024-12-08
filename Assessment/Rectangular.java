package com.assessment;

import java.util.Scanner;

class Rectangle {
	int width, height;
	int area, perimeter;
	Scanner in = new Scanner(System.in);

	void areaOfRectangle() {
		System.out.println("Enter the width:");
		width = in.nextInt();
		System.out.println("Enter the height:");
		height = in.nextInt();
		area = width * height;
		System.out.println("Area of a rectangle:" + " " + area);
	}

	void Perimeter() {
		System.out.println("Enter the width:");
		width = in.nextInt();
		System.out.println("Enter the height:");
		height = in.nextInt();
		perimeter = 2 * (width + height);
		System.out.println("Perimeter of a rectangle:" + " " + perimeter);

	}
}

public class Rectangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.areaOfRectangle();
		rectangle.Perimeter();

	}

}
