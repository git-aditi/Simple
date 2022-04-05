package com.company.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorTestClass {

	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		v.add("Garima"); 

		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
