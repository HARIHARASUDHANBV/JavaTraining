package com.Day8;

class MyClass1 {
	String s1 = "JAVA";

	void displayString() {
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat("World"));
		System.out.println(s1.equals("java"));
		System.out.println(s1.equalsIgnoreCase("java"));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println(s1.lastIndexOf("JA"));
		System.out.println(s1.startsWith("JA"));
		System.out.println(s1.endsWith("VA"));
		System.out.println(s1.replace('A', 'z'));
		System.out.println(s1.toLowerCase());
		String s2 = "Java World";
		System.out.println(s2.substring(3, 7));
		System.out.println(s2.substring(3));

	}
}

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 mc = new MyClass1();
		mc.displayString();
	}

}
