package com.company.java.car;

public abstract class Car {

	private String numberplate;
	private int height;
	private int weight;
	
	public Car() {
		
	}

	public Car(String numberplate, int height, int weight) {
		this.numberplate = numberplate;
		this.height = height;
		this.weight = weight;
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

	public void honk() {
		System.out.println("honk honk...");
	}
	
	public abstract int calculateMilage(); //must be implemented in subclasses

}
