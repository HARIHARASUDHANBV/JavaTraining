package com.Day2;

import java.util.Arrays;
import java.util.Scanner;

class SortArrays {
	int max, i;
	int choice;

	void displayOrder() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of max");
		max = scan.nextInt();
		int[] d = new int[max];
		System.out.println("Enter the Array:");
		for (i = 0; i < d.length; i++) {
			d[i] = scan.nextInt();
		}
		Arrays.sort(d);
		System.out.println("Enter the choice");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Printing the sorted array in Ascending order");
			for (i = 0; i < d.length; i++) {
				System.out.println(" " + d[i]);
			}
			break;
		case 2:
			System.out.println("Printing the sorted array in Descending order");
			for (i = d.length - 1; i > 0; i--) {
				System.out.println(" " + d[i]);
			}
			break;
		default:
			System.out.println("Enter valid choice");
			break;
		}
		scan.close();
	}
}

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArrays sa = new SortArrays();
		sa.displayOrder();
	}

}
