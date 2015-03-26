package com.test.formating;

import java.util.Scanner;

public class ParsingTest {

	public static void main(String[] args) {
		Scanner scanId = new Scanner(System.in);
		String sWhatever = "-2";
		
		while (!sWhatever.equals("-1")) {				
          sWhatever = scanId.nextLine(); 
          try {
          int x = Integer.parseInt(sWhatever);
          
	      System.out.println("Entered string is not a number "+ x);
          } catch (Exception ne) {
        	  break;
          }
		
		}
		System.out.println("DONE!");

		scanId.close();

	}

}
