package com.company.java.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	int salary;
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}