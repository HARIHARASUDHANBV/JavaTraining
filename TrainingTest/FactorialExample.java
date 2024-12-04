package TrainingTest;

import java.util.Scanner;

class Factorial {
	int num;
	int fact = 1;

	void displayFactorial() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to calculate Factorial");
		num = s.nextInt();
		s.close();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		fact.displayFactorial();
	}

}
