package com.Day2;

class Mobile {
	String brand_name;
	int price;
	String Technology;

	public Mobile(String brand_name, int price, String Technology) {
		this.brand_name = brand_name;
		this.price = price;
		this.Technology = Technology;
	}

	void display() {
		System.out.println("The Brand Name is:" + " " + brand_name);
		System.out.println("The price is:" + " " + price);
		System.out.println("The technology of the mobile is:" + " " + Technology);
	}
}

public class ClassAndObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile("Nokia C02", 8000, "GSM");
		m.display();
	}

}
