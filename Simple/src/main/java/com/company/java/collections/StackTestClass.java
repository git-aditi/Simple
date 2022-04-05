package com.company.java.collections;

import java.util.*;

public class StackTestClass {

	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");

		String s = stack.pop();

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("========");
		System.out.println(s); // Prints Garima
	}

}
