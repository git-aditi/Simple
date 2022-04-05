package com.company.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationEx2 {

	public static void main(String[] args) {
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f1.txt"));
			Student s = (Student) in.readObject();
			// printing the data of the serialized object
			System.out.println(s.id + " " + s.name);
			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
 