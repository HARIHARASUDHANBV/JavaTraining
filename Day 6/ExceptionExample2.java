package com.Day6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class ExceptionPropogation {
	void businessLogic() throws FileNotFoundException, IOException {
		int a = 10 / 0;
		FileReader fr = new FileReader("Hari.txt");
		fr.close();
	}

	void myMethod() {
		try {
			businessLogic();
			try {
				businessLogic();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}

public class ExceptionExample2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ExceptionPropogation ep = new ExceptionPropogation();
		ep.myMethod();

	}

}
