package com.allibilli.common;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in);
		String sWhatever = "-2";
		
		while (!sWhatever.equals("-1")) {				
          sWhatever = scanIn.nextLine(); 
          try {
          int x = Integer.parseInt(sWhatever);
          
	      System.out.println("Entered string is not a number "+ x);
          } catch (Exception ne) {
        	  break;
          }
		
		}
		System.out.println("DONE!");
		scanIn.close();

	}

}
