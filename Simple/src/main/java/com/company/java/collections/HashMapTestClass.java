package com.company.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestClass {

	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");

		map.put(1, "Grapes"); // Duplicate key - replaces Mango
		map.put(2, "Pomegranate"); // Duplicate key - replaces Apple

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
