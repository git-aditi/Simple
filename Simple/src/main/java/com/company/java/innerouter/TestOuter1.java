package com.company.java.innerouter;

public class TestOuter1 {
	
	static int data = 30;
	
	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOuter1.Inner obj = new TestOuter1.Inner();
		obj.msg();
		
	}

}
