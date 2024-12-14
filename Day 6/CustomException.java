package com.Day6;

import java.util.Scanner;

class AgeException extends Exception {
	@Override
	public String toString() {
		return "INELIGIBLE";
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the valid age:");
		age = scan.nextInt();
		if (age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
			try {
				throw new AgeException();
			} catch (AgeException e) {
				System.out.println(e);
			}
		}
	}

}
