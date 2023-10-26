	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;
	
public class StudentLogin {

	
	    public void studentLogin() throws ClassNotFoundException, SQLException {
	        Scanner sc = new Scanner(System.in);

	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12655381", "sql12655381", "7C1BhmxHMh");

	        System.out.println("Welcome");
	        System.out.println("Enter username:");
	        String uname = sc.next();
	        System.out.println("Enter password:");
	        String pw = sc.next();

	        
	        PreparedStatement ps = con.prepareStatement("SELECT * FROM Student WHERE usrname = ?");
	        ps.setString(1, uname);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            String storedPassword = rs.getString("password");
	            if (pw.equals(storedPassword)) {
	                System.out.println("Login successful");
	            } else {
	                System.out.println("Incorrect password");
	            }
	        } else {
	            System.out.println("Username not found");
	        }

	        // Close resources
	        rs.close();
	        ps.close();
	        con.close();
	    }
	}


