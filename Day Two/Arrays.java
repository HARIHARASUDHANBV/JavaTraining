package com.Day2;

import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size");
		max = in.nextInt();
		int[] a = new int[max];
		System.out.println("Enter the elements of the Array");
		for (int i = 0; i < max; i++) {
			a[i] = in.nextInt();
			System.out.println("The elements of the array at" + " " + "index" + " " + i + " " + "is" + " " + a[i]);
			sum = sum + a[i];
			System.out.println("The Sum of All Array Elements is:" + " " + sum);
		}
		in.close();
	}

}
