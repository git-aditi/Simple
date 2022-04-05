package com.company.java.fileio;

public class Simple {

	
	int i;
	static {
		System.out.println("Inside static block");
	}
	
	{
		i=100;
		System.out.println("Inside instance Initializer block");
	}
	
	public static void main(String[] args) {

		Simple simple = new Simple();
		Simple simple1 = new Simple();
		System.out.println("Value of i is: " + simple.i);
		
		
	}

}
