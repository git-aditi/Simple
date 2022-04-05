package com.company.java.innerouter;

public class TestMemberOuter1 {

	private int data = 30;
	
	// Class inside a class is a Member Inner Class
	class Inner{
		
		void msg() {
			System.out.println("Data is " + data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// You can only access obj of inner class by creating obj of outer class
		TestMemberOuter1 obj = new TestMemberOuter1();
		
		// Then create a type of inner class. And using the obj of outer class 
		// create new Inner
		TestMemberOuter1.Inner in = obj.new Inner();
		
		in.msg();
//		obj.msg(); // Not possible 

	}

}
