package com.allibilli.common;


//import com.allibilli.jtest.Jtest1; // Jtest project is dependant on Jproject
import com.allibilli.test.test_add;

public class Addition {

	static int a;
	static int b;
	static int c;
	
	
	public static void main(String[] args) {
		a = 100;
		b= 100;
		c= 100;

	int q = addNumbers(a,b,c);
	printresult(q);
	Add_test.add(10 , 20);// no access modifier in different class
	Add_test.add2(q, q); // protected method in different class
	test_add.add1(5,6);// public method in different package
	
	abc.ab(1, 2);
	//Jtest1.sum(30, 40);// different class, package, project
						// this can be achieved by adding Jtest project to the Jproject biuld path

	
	}
	
	public static int addNumbers(int x, int y, int z)
	{
			
	int d = x+y+z;
		return d;
	}

	public static void printresult(int r)
	{
		
		System.out.println("Print the result:"+ r);
	}

static class abc
{
	private static void ab(int a, int b){
		System.out.println("print"+(a+b));
	}
	}}