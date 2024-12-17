package com.Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Image {
	void displayFile() throws IOException {
		FileInputStream fi = new FileInputStream("D://Gargoyles.jpg");
		FileOutputStream fo = new FileOutputStream("D:\\GargoylesCopy.jpg");
		int ch;
		try {
			while ((ch = fi.read()) != -1) {
				fo.write(ch);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			fi.close();
			fo.close();
			System.out.println("Image Copied");
		}
	}
}

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Image image = new Image();
		image.displayFile();
	}

}
