package TrainingTest;

public class CommandLineArguments2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("insufficient input");
		} else {
			int a = Integer.parseInt(args[0]); // Wrapper class;
			int b = Integer.parseInt(args[1]);
			int sum = a + b;
			System.out.println("Addition of two Strings:" + sum);

		}
	}
}
