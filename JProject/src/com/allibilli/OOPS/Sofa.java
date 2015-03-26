package com.allibilli.OOPS;

public abstract class Sofa extends Furniture {
	private int numberOfLegs =0;
	private String material = null;
	public Sofa(){
		System.out.println("TEST");
	}
	
/* public String getPurpose() {
		String s = super.getPurpose() + "Relax:";
		return s;
		
	}*/
public abstract void whatIsInterface();
}
