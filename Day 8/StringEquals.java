package com.Day8;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.capacity());
		sb.append(s2);
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		System.out.println(sb.reverse());

	}

}
