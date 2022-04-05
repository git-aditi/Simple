package com.company.java.carInterface;

public interface Car {
	
	public static final String companyName = "MIIT";

	public abstract int calculateMilage(); //must be implemented in subclasses

	public void honk();
	
	public Engine getEngine();

	public void setEngine(Engine engine);
	
	public Door[] getDoors();

	public void setDoors(Door[] doors);
}
