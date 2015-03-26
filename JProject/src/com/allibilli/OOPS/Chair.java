package com.allibilli.OOPS;

public class Chair extends Furniture {
	public Chair(){
		System.out.println("chair");
	}
	
	public String getPurpose(){
		String s = super.getPurpose() + "this is a chair";
		return s;
	}

}
