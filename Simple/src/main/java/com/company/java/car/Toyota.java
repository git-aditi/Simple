package com.company.java.car;

public class Toyota extends Car {

	private String type;

	public Toyota() {

	}

	public Toyota(String type) { // constructor overloading
		this(type, "", 0, 0);
	}

	// constructor overloading
	public Toyota(String type, String numberplate, int height, int weight) {
		super(numberplate, height, weight);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void honk() { // overriding from Car
		System.out.println("tonk tonk...");
	}

	public void honk(String customVoice) { // overloaded from previous method
		System.out.println(customVoice + " " + customVoice + "...");
	}

	@Override
	public int calculateMilage() {
		// TODO Auto-generated method stub
		return this.getWeight() / 35;
	}

}
