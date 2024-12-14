package com.Day6;

import java.util.Scanner;

public class ExceptionMultiple {
	int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size:");
		size = input.nextInt();
		switch (size) {
		case 1:
			try {
				int dividend = 100;
				int divisor = 0;
				int result = divisor / divisor;
				int a[] = { 10, 20, 30 };
				System.out.println(a[3]);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			break;
		}

	}

}
