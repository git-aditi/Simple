package com.company.java.innerouter;

public class AnonymousEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person() {

			@Override
			void something() {
				// TODO Auto-generated method stub
				
				System.out.println("Inside Anonymous Inner class");
				
			}
			
		};
		
		p.something();

	}
	
//	PersonI i = new PersonI(); // Not correct as you can never instantiate an interface
	
	PersonI i = new PersonI() { // Anonymous inner class // Less reusability
		
		@Override
		public void something() {
			// TODO Auto-generated method stub
			
		}
	};

}

abstract class Person {
	
	abstract void something();
	
}

class Employee extends Person {

	@Override
	void something() {
		// TODO Auto-generated method stub
		
	}
	
}

interface PersonI {
	
	abstract void something();
	
}

class EmployeeI implements PersonI {

	@Override
	public void something() {
		// TODO Auto-generated method stub
		
		
	}
	
}