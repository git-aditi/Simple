package com.company.java.collections;

import java.util.*;

public class QueueTestClass {

	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		// Adds the specified elements into the queue

		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Rahul");
		queue.add("Jai"); // does not order the elements in FIFO manner - Check at Console after printing.
		// Because PriorityQueue inherits AbstractQueue class.

		// Retrieves, but does not remove head of queue
		System.out.println("head:" + queue.element());

		// Retrieves head of queue - does not remove - returns null if queue is empty
		System.out.println("head:" + queue.peek());

		System.out.println("============");

		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Retrieves and removes head of queue
		queue.remove();

		System.out.println("============");

		// Retrieves and removes head of queue or returns null if queue is empty
		queue.poll();
		
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
