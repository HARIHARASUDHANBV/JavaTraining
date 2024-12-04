package TrainingTest;

import java.util.Scanner;

class Calculator {
	int a, b, choice;
	String response = "";

	void displayCalculator() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = in.nextInt();
		System.out.println("Enter the value of b:");
		b = in.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		System.out.println("Enter the choice:");
		choice = in.nextInt();
		do {
			System.out.println("Enter the choice:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				int c = a + b;
				System.out.println("Addition of two numbers:" + " " + c);
				break;
			case 2:
				int d = a - b;
				System.out.println("Subtraction of two numbers:" + " " + d);
				break;
			case 3:
				int e = a * b;
				System.out.println("Multiplication of two numbers:" + " " + e);
				break;
			case 4:
				int f = a / b;
				System.out.println("Division of two numbers:" + " " + f);
				break;
			case 5:
				System.out.println("None of the above");
				break;
			default:
				System.out.println("Enter a valid choice");
				break;
			}
			System.out.println("Do you wish to Continue ? (yes/no):");
			response = in.next();
		} while (response.equalsIgnoreCase("yes"));
		in.close();
	}
}

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.displayCalculator();

	}

}
