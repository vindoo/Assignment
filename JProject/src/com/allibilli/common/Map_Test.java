package com.allibilli.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Test {

	private Map <String, Integer> studentInfo = new HashMap<String, Integer>();
	
		  private void populateMap() {
		        // groceryList.add()
		        studentInfo.put("Ankit", 85);
		        studentInfo.put("Sindo", 86);
		        studentInfo.put("jaggi", 85);
		        studentInfo.put("Ankit", 86);
		        studentInfo.remove("Ankit");
		    }
		    
		    private void printMap() {
		        // Ankit, Sindo, Jaggi
		        Set<String> keySetMap = studentInfo.keySet();
		        for (String key : keySetMap) {
		            System.out.println("Student Name:" + key + " Student marks:" +studentInfo.get(key));
		            
		        }
		    }
		    
		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Map_Test demo = new Map_Test();
		        demo.populateMap();
		        demo.printMap();
		    }

	}


