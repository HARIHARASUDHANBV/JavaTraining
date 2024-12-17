package com.Day8;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		char[] ch = s1.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		String s2 = "Welcome to Java World";
		String[] temp = s2.split(" ");
		for (String s : temp) {
			System.out.println(s);
		}
	}

}