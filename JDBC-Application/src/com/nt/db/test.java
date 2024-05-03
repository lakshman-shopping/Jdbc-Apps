package com.nt.db;
import java.sql.*;
public class test {
public static void main(String[] args) {
		try {
			//loading driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Creating connection object			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","lakshman","865");
			//preparing statement;
			Statement stm = con.createStatement();
			// executing queries
			ResultSet rs = stm.executeQuery("select * from product59");
			System.out.println("...productdetails...");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+
			     rs.getString(4));
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
	}
  }

}
