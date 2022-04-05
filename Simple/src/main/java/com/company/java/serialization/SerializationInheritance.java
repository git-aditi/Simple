package com.company.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dog implements Serializable {
	cat c = new cat();
}

class cat implements Serializable {
	rat r = new rat();
}

class rat implements Serializable {
	
	// transient int i = 10;
	
	int i = 10;
	
	rat() {
		System.out.println("Serialization inheritance constructor call");
	}
	
	void show() {
		System.out.println("Now in show method");
	}
}

public class SerializationInheritance {
	
	public static void main(String[] args) throws Exception{
		dog d = new dog();
		
		FileOutputStream fos = new FileOutputStream("/Users/aditithakkar/Documents/workspace/Simple/src/main/java/com/company/java/serialization/serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		System.out.println("Serialization Done.");
		
		FileInputStream fis = new FileInputStream("/Users/aditithakkar/Documents/workspace/Simple/src/main/java/com/company/java/serialization/serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		dog d2 = (dog) ois.readObject();
		
		System.out.println("value of i is :: " + d2.c.r.i);
		
		d2.c.r.show();
		
	}

}
