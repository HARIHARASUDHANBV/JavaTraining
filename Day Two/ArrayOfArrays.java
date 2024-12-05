package com.Day2;

public class ArrayofArrays { // Java doesn't support 2D arrays,only 1d arrays.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int k = 0; k < b.length; k++) {
			for (int l = 0; l < b[k].length; l++) {
				System.out.print(b[k][l] + " ");
			}
			System.out.println();
		}
		for(int[]e:b) {
			for(int d:e) {
				System.out.print(d+" ");
			}
		}
        System.out.println();
	}

}
