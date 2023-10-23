package com.miniproject.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.miniproject.database.connection.DatabaseConnection;

public class AddQuestionStatement {

	Connection con = null;
	PreparedStatement psmt = null;

	public void addQuestion(String question, String option_1, String option_2, String option_3, String option_4)
			throws ClassNotFoundException, SQLException {
		DatabaseConnection connection = new DatabaseConnection();
		con = connection.getConnetion();
		psmt = con.prepareStatement(
				"insert into question(question, option_1, option_2, option_3, option_4) values(?,?,?,?,?)");

		psmt.setString(1, question);
		psmt.setString(2, option_1);
		psmt.setString(3, option_2);
		psmt.setString(4, option_3);
		psmt.setString(5, option_4);
		psmt.executeUpdate();
		
		System.out.println("one question added");

	}

}
