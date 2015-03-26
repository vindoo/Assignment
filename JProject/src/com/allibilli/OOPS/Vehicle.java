package com.allibilli.OOPS;

public class Vehicle // SuperClass of car
{

	public int numberOfWheels;
	public String purpose;
	public boolean isCommercial;
	
	public int getNumberOfWheels(){
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int nWheels){
		numberOfWheels = nWheels;
	}
}
