package com.Day2;

import java.util.Scanner;

class OddorEven {
	int i, max;

	void displayOddEven() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		max = in.nextInt();
		int[] value = new int[max];
		System.out.println("Enter the elements of the Array");
		for (i = 0; i < max; i++) {
			value[i] = in.nextInt();
			if (value[i] % 2 == 0) {
				System.out.println("The even numbers in the array at index" + " " + i + " " + "is" + " " + value[i]);
			} else {
				System.out.println("The odd numbers in the array at index" + " " + i + " " + "is" + " " + value[i]);
			}
		}
		in.close();
	}
}

public class ArraysTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddorEven o = new OddorEven();
		o.displayOddEven();
	}

}
