package com.miniproject.quizapplication;
import java.sql.SQLException;
import com.miniproject.database.connection.DatabaseConnection;
import com.miniproject.tables.InsertionIntoTable;

public class QuizApplication {
	
	public static void main(String[] args) {
		
		System.out.println("Start");

		DatabaseConnection con = new DatabaseConnection();
		try {
			con.getConnetion();
			System.out.println("Connection Established");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
		InsertionIntoTable insert= new InsertionIntoTable();
		try {
			insert.insertIntoTable();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("End");
	}

}
