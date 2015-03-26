package com.test.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		String text ="Test";
		String text1 = "Time";
		File file = new File("C:/test/text.txt");
		BufferedWriter output = new BufferedWriter(new FileWriter(file));
		output.write(text); //Prints Test
		output.newLine(); // goes next line
		output.write(text1); // prints Time
		output.close();

	}

}
