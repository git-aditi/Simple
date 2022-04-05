package com.company.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlCon {

	// THREE

	static Connection con = null;

	static {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_company", "root", "A1d9i9t8i");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// ONE

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_company", "root",
//					"A1d9i9t8i");
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from Employee");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
//						+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " "
//						+ rs.getString(8));
//			}
//			con.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		// TWO

//		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_company", "root",
//				"A1d9i9t8i");) {
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from Employee");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
//						+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " "
//						+ rs.getString(8));
//			}
//		
//		}

		// THREE

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
						+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " "
						+ rs.getString(8));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
