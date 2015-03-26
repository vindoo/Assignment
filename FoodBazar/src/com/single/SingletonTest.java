package com.single;

public class SingletonTest implements Cloneable{

	
	private static SingletonTest s = null;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		
	}
	private SingletonTest() {
		System.out.println("Object Created");

	}
	 
	public static SingletonTest getInstance(){
		
		if(s == null){
			System.out.println("No object available- So creating a new one");
			s = new SingletonTest();
			return s;
		}
		else 
		{
			System.out.println("Returning the existing object");
			return s;
			
		}
	}

}
