package com.Day2;

import java.util.Scanner;

class ArrayDuplicate {
	int max, i, j;
	int count = 0;

	void displayDuplicate() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the max element");
		max = in.nextInt();
		int[] c = new int[max];
		System.out.println("Enter the Array");
		for (i = 0; i < max; i++) {
			c[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < max; i++) {
			for (j = i + 1; j < max; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
		}
		System.out.println("Total number of Duplicate elements is" + " " + count);
	}
}

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDuplicate ad = new ArrayDuplicate();
		ad.displayDuplicate();
	}

}
