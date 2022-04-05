package com.company.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTestClass {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in ArrayList
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		
		// For each loop 1.8 - LAMBDA - is missing

		// For loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========");

		// New Enhanced For loop
		for (String i : list) {
			System.out.println(i);
		}

		System.out.println("==========");

		// While loop
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

		System.out.println("==========");

		// Iterator - Returns an iterator over the elements
		// in this list in proper sequence.
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	

}
