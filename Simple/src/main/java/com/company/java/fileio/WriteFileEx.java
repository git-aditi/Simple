package com.company.java.fileio;

import java.io.FileReader;
import java.io.FileWriter;

public class WriteFileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("----------- WRITING DATA IN THE FILE -----------");

		try {
			FileWriter fw = new FileWriter("/Users/aditithakkar/Documents/workspace/Simple/src/main/java/com/company/java/practice/testWrite,txt");
			
			fw.write("Writing in the file...");
			
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("File updated successfully.");
		}
		
		
		
		System.out.println("----------- READING DATA FROM THE FILE -----------");
		
		try {
			FileReader fr = new FileReader("/Users/aditithakkar/Documents/workspace/Simple/src/main/java/com/company/java/practice/testWrite.txt");
			
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char) i);
			}
			
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
