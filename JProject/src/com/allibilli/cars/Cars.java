package com.allibilli.cars;

import com.allibilli.OOPS.Vehicle;

public class Cars {
	
		private int numberOfDoors;
		private boolean isallWheelDrive;
		
		public static void main(String[] args){
			
			Vehicle r = new Vehicle();
			//r.getNumberOfWheels();
			r.setNumberOfWheels(6);
			System.out.println(" number of wheels:"+ r.getNumberOfWheels());
			
		}
		
}
