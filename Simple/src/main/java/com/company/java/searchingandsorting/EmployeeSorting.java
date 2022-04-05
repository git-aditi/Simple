package com.company.java.searchingandsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(4);
		al.add(2);
		
		Collections.sort(al);
		System.out.println("Sorted list: " + al);
//		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			
//		}
		
		Employee e = new Employee("E", 1000, "ABC");
		Employee e1 = new Employee("E1", 1001, "PQA");
		Employee e2 = new Employee("E2", 1002, "PQR");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e);
		employeeList.add(e1);
		employeeList.add(e2);
		
		Collections.sort(employeeList);
		System.out.println("Sorted list: " + employeeList);
		
		
	}

}
