package com.miniproject.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	Connection con = null;

	public Connection getConnetion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12655381", "sql12655381",
				"7C1BhmxHMh");
		return con;
	}

}
