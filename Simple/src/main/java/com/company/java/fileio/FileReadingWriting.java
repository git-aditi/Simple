package com.company.java.fileio;

import java.io.FileWriter;
import java.io.IOException;

import com.company.java.searchingandsorting.Employee;

public class FileReadingWriting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		try(EmployeeAuto emp = new EmployeeAuto()) {
//			
//		}
		
		try(MyFileWriter fw = new MyFileWriter("/Users/aditithakkar/Documents/workspace/Simple/src/main/java/com/company/java/testoutMyFileWriter.txt")) {
			fw.write("Welcome to JavaTPoint");
			System.out.println("Success...");
		}
		
		
	}

}

class EmployeeAuto implements AutoCloseable{
	private String name;
	
	public EmployeeAuto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Close...");
		
	}
}

class MyFileWriter implements AutoCloseable{
	private String fileName;
	
	FileWriter fw;
	
	public MyFileWriter(String fileName) throws Exception {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		fw = new FileWriter(fileName);
	}
	
	public void write(String content) throws Exception {
		// TODO Auto-generated method stub
		fw.write(content);
		System.out.println("Inside Close...");
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Close...");
		
	}
}

