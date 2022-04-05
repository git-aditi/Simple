package com.company.java.patterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {
	public static void main(String[] args) throws Exception {
//		Singleton s1 = new Singleton(); // not allowed
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		
//==============================================================
//		Singleton s3 = null;
		// Serialization
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/aditithakkar/Documents/workspace/Simple/0.txt"));
//			oos.writeObject(s2);
			
//			//Deserialization
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/aditithakkar/Documents/workspace/Simple/0.txt"));
//			s3 = (Singleton)ois.readObject();
//		} catch (FileNotFoundException e) {
//			System.out.println("File does not exist!" + e);		
//		}
//==============================================================
//		// Cloneable
//		Singleton s3 = (Singleton) s2.clone();
//
//		System.out.println(s3.hashCode());
// ==============================================================

	}
}