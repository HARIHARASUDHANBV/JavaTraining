package com.assessment;

class Circle {
	private int radius;
	final double pi = 3.14;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	void area() {
		double Area = pi * radius * radius;
		System.out.println("Area of a circle:" + " " + Area);
	}

	void circumference() {
		double Circumference = 2 * pi * radius;
		System.out.println("Circumference of a circle:" + " " + Circumference);

	}
}

public class Circular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(4);
		circle.setRadius(9);
		circle.area();
		circle.circumference();
	}

}
