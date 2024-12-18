package com.Day9;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		@SuppressWarnings("removal")
		Integer i = new Integer(a);
		@SuppressWarnings("unused")
		int b = i;
	}

}