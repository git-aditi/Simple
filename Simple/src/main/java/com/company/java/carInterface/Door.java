package com.company.java.carInterface;

public class Door {
	
	private String type;
	
	private boolean isAutomatic;
	
	public Door(String type, boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

}
