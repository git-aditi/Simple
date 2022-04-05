package com.company.java.searchingandsorting;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e = new Employee();

		Employee e1 = new Employee("e1", 10000, "2");
		e.name = "e";
		e.setName("e");

		e.setEmployeeID("1");
		e.setName("e");
		e.setSalary(5000);

		int result = e.calculateTax();
		int result1 = Employee.calculateTaxStatic(e.getSalary());

		Employee e2 = new Employee("e2", 20000, "3");

	}

}