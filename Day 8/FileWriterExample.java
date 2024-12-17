package com.Day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileWrite {
	void displayFile() throws IOException {
		FileReader fr = new FileReader("D://File.txt");
		FileWriter fw = new FileWriter("D://File1.txt");
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");
	}
}

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWrite f = new FileWrite();
		f.displayFile();
	}

}
