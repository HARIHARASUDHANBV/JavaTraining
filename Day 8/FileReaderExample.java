package com.Day8;

import java.io.FileReader;
import java.io.IOException;

class MyFileClass {
	void displayFile() throws IOException{
		FileReader fr = new FileReader("D://File.txt");
		int ch;
		try {
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			fr.close();
		}
	}
}

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyFileClass fc = new MyFileClass();
		fc.displayFile();
	}

}
