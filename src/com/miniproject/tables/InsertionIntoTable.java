package com.miniproject.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.miniproject.database.connection.DatabaseConnection;

public class InsertionIntoTable {
	
	Connection con = null;
	PreparedStatement psmt = null;
	
	public void insertIntoTable() throws ClassNotFoundException, SQLException {
		DatabaseConnection connection = new DatabaseConnection();
		con = connection.getConnetion();
		psmt = con.prepareStatement("insert into question(question, option_1, option_2, option_3, option_4) values(?,?,?,?,?)");
		psmt.setString(1, "what is jvm?");
		psmt.setString(2, "java vertual machine");
		psmt.setString(3, "java visible machine");
		psmt.setString(4, "java virtual mode?");
		psmt.setString(5, "none");
		psmt.executeUpdate();
		System.out.println("one question inserted");
		} 
		
}
