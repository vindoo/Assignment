package com.test.fileIO;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws Exception {
	String sCurrentLine;
	File file = new File("c:/test/text.txt");
	BufferedReader rd = new BufferedReader(new FileReader(file));
	while((sCurrentLine = rd.readLine())!= null)
	{
		System.out.println("sCurrentLine");
	}
	rd.close();
	

	}

}
