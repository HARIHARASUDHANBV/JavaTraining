package com.Day6;

class FinallyExample {
	void setAge(int age) {
		try {
			if (age < 0) {
				throw new IllegalArgumentException("Age cannot be negative");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("After exception");
		}
	}
}

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		FinallyExample fe = new FinallyExample();
		fe.setAge(-1);
	}
}