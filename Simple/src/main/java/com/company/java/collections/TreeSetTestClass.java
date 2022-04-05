package com.company.java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTestClass {

	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		al.add("Ajay"); // Ignores!!

		// Traversing elements in Ascending Order
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=========");
		
		// Descending Order
		Iterator<String> itr2 = al.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
