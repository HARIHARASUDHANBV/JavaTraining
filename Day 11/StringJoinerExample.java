package com.Day11;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("One");
		joiner.add("Two");
		joiner.add("Three");
		String result = joiner.toString();
		StringJoiner joiner1 = new StringJoiner(",", "[", "]");
		joiner1.add("Red");
		joiner1.add("Blue");
		joiner1.add("Green");
		String result1 = joiner1.toString();
		System.out.println(result + " " + result1);

	}

}
