package com.company.java.carInterface;

public class Toyota implements Car {

	private String type;
	private String numberplate;
	private int height;
	private int weight;
	private Engine engine;
	private Door[] doors;
	

	public Toyota() {

	}

	public Toyota(String type) { // constructor overloading
		this(type, "", 0, 0);
	}

	// constructor overloading
	public Toyota(String type, String numberplate, int height, int weight) {
		this.numberplate = numberplate;
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	public String getNumberplate() {
		return numberplate;
	}

	public void setNumberplate(String numberplate) {
		this.numberplate = numberplate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Door[] getDoors() {
		return doors;
	}

	public void setDoors(Door[] doors) {
		this.doors = doors;
	}

	public void honk() { // overriding from Car
		System.out.println("tonk tonk...");
	}

	public void honk(String customVoice) { // overloaded from previous method
		System.out.println(customVoice + " " + customVoice + "...");
	}

	public int calculateMilage() {
		// TODO Auto-generated method stub
		return this.getWeight() / 35;
	}

}
