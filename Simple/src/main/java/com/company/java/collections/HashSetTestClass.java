package com.company.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTestClass {

	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");

		set.add("Five"); // Ignores!!

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
