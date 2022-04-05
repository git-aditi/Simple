package com.company.java.innerouter;

public class LocalInner1 {
	
	private int data = 30;
	
	void display() {
		// Class inside method is Local Inner Class
		class Local{
			void msg() {
				System.out.println(data);
			}
		}
		
		Local l = new Local();
		l.msg();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalInner1 obj = new LocalInner1();
		obj.display();

	}

}
