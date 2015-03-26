package com.test.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int []a= {};
		do{
			try
			{
			int x= a[1];
			System.out.println(x);
			} catch(Exception e){
			System.out.println("Exception found");
			e.printStackTrace();
			break;
		} 
		}while(true);
		
}}
