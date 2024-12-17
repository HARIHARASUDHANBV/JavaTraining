package com.Day8;

class MyClass {
	String s1 = "Java";
	String s2 = new String("Java");
	char[] ch = { 'H', 'I' };
	String s3 = new String(ch);

	void display() {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		myclass.display();

	}

}
