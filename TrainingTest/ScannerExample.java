package TrainingTest;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee id");
		int id = scan.nextInt();
		System.out.println("Enter the name");
		String name = scan.next();
		System.out.println("Enter the Salary");
		float salary = scan.nextFloat();
		scan.close();
		System.out.println(id + " " + name + " " + salary);

	}

}
