package com.Day3;

class Shapes {
	double length, breadth, side, height;

	public Shapes(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Shapes(double side) {
		this.side = side;
	}

	public Shapes(double length, double breadth, double height) {
		this(8.0, 7.0);
		this.height = height;
	}

	void area() {
		System.out.println("Cannot define an Area for shape");
	}
}

class Rectangle extends Shapes {
	public Rectangle(double length, double breadth) {
		super(8.0, 7.0);
	}

	@Override
	void area() {
		double areaofRectangle = length * breadth;
		System.out.println("The Area of a Rectangle is:" + " " + areaofRectangle);
	}
}

class Square extends Shapes {
	public Square(double side) {
		super(4.0);
	}

	@Override
	void area() {
		double areaofSquare = side * side;
		System.out.println("The Area of a Square:" + " " + areaofSquare);
	}
}

class Triangle extends Shapes {
	public Triangle(double length, double breadth, double height) {
		super(7.0, 8.0, 9.0);
	}

	@Override
	void area() {
		double areaofTriangle = (length * breadth * height) / 2;
		System.out.println("The Area of a Triangle:" + " " + areaofTriangle);

	}
}

public class AreaByInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(8.0, 7.0);
		Square square = new Square(4.0);
		Triangle triangle = new Triangle(7.0, 8.0, 9.0);
		rectangle.area();
		square.area();
		triangle.area();
	}

}
