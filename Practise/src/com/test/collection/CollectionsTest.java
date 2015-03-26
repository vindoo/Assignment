package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {
	
	private static List<String> grocerylist = new ArrayList<String>();
	private static List<Integer> studentid = new ArrayList<Integer>();

	public static void main(String[] args) {
	grocerylist.add("Hi");
	grocerylist.add("hello");
	Integer x = new Integer (5);
	Integer y = new Integer (6);
	studentid.add(y);
	studentid.add(x);
	System.out.println(grocerylist);
	System.out.println(studentid);
	}

}
