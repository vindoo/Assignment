package com.thread.test;

public class TestThread {

	public static void main(String[] args) {
		  
		System.out.println("TEST");
	        FileRead1 fr1 = new FileRead1();
	        fr1.start();
	        FileRead2 fr2 = new FileRead2();
	        fr2.start();
	        
	        System.out.println("DONE");

	}

}
