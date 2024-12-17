package com.Day8;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("madam");
		if (sb.equals(sb.reverse())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		String s1 = "malayalam";
		String s2 = new StringBuffer(s1).reverse().toString();
		if (s1.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
