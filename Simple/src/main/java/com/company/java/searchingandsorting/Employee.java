package com.company.java.searchingandsorting;

public class Employee implements Comparable {

	public String name;

	private String employeeID;

	private int salary;

	private static int TAX_RATE = 13;

	private static String companayName = "MiIT";

	public Employee() {

	}

	public Employee(String name, int salary, String employeeID) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}

	public int calculateTax() {
		int taxAmount = this.getSalary() * 13 / 100;
		return taxAmount;
	}

	public static int calculateTaxStatic(int salary) {
		int taxAmount = salary * 13 / 100;
		return taxAmount;
	}

	public String getName() {
		return "Department ::" + name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static int getTAX_RATE() {
		return TAX_RATE;
	}

	public static void setTAX_RATE(int tAX_RATE) {
		TAX_RATE = tAX_RATE;
	}

	public static String getCompanayName() {
		return companayName;
	}

	public static void setCompanayName(String companayName) {
		Employee.companayName = companayName;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (this.getSalary() > ((Employee) o).getSalary())
			return 1;
		else if (this.getSalary() < ((Employee) o).getSalary())
			return -1;

		return 0;

	}

	public String toString() {
		return this.getEmployeeID() + ":" + this.getName() + ":" + this.getSalary();
	}

}