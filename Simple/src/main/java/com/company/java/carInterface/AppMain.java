package com.company.java.carInterface;

public class AppMain {

	public static void main(String[] args) {

		Car t = new Toyota("Camry", "111", 1000, 12); // upcasting
		t.honk();
		((Toyota)t).honk("custom"); // downcasting
		
		Engine e = new Engine();
		e.setPower(1000);
		e.setType("v6");
		
		t.setEngine(e); // dependency injection
		
		//one to many - Has A - composition
		Door door1 = new Door("Front", true);
		Door door2 = new Door("Front", true);
		Door door3 = new Door("Rear", false);
		Door door4 = new Door("Rear", false);
		Door door5 = new Door("Trunk", false);
		
		Door[] doors = new Door[5];
		doors[0] = door1;
		doors[1] = door2;
		doors[2] = door3;
		doors[3] = door4;
		doors[4] = door5;
		
		t.setDoors(doors);
		
	}

}
