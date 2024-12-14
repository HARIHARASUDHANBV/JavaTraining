package com.Day6;

import java.util.Scanner;

public class ExceptionHandling {
	int a = 10;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner in = new Scanner(System.in);
		ExceptionHandling exe = null;

		System.out.println("Enter the num:");
		num = in.nextInt();
		switch (num) {
		case 1:
			try {
				@SuppressWarnings("unused")
				int dividend = 100;
				int divisor = 0;
				@SuppressWarnings("unused")
				int result = divisor / divisor;

			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			break;
		case 2:
			try {
				int a[] = { 10, 20, 30 };
				System.out.println(a[3]);
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
			break;
		case 3:
			try {
				@SuppressWarnings("unused")
				int a[] = new int[-5];
			} catch (Exception e2) {
				System.out.println(e2);
			}
			break;
		case 4:
			try {
				@SuppressWarnings("unused")
				int a = Integer.parseInt("ABC");
			} catch (NumberFormatException e3) {
				System.out.println(e3);
			}
			break;
		case 5:
			try {
				System.out.println(exe.a);
			} catch (NullPointerException e4) {
				System.out.println(e4);
			}
			break;
		default:
			System.out.println("After exception:");

		}
	}
}
