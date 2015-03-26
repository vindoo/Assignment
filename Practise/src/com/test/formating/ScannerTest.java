package com.test.formating;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		
		Scanner scanId = new Scanner(System.in);
		
		String sPrint = "0";
		
		while(!sPrint.equals("-1")){
			sPrint = scanId.nextLine();
			System.out.println("Print Line:"+" "+  sPrint);
		}
		
		System.out.println("Terminated");

		scanId.close();
		

	}

}
