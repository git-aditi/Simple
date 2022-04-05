package com.company.java.car;

public class AppMain {

	public static void main(String[] args) {

		Car t = new Toyota("Camry", "111", 1000, 12); // upcasting
		t.honk();
		((Toyota)t).honk("custom"); // downcasting
		
		

	}

}
