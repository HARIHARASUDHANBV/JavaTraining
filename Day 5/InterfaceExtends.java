package com.Day5;

//Multiple Inheritance
interface One {
	int a = 10;
}

interface Two {
	int a = 20;
}

interface Three extends One, Two {
	void sum();
}

class Add implements Three {
	public void sum() {
		int c = One.a + Two.a;
		System.out.println(c);
	}
}

public class InterfaceExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add numbers = new Add();
		numbers.sum();
	}

}
