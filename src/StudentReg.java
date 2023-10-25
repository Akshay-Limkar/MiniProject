import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.util.Scanner;

public class StudentReg {


	    public static void main (String[]args) throws ClassNotFoundException {
	        try {
	        	  Scanner scan = new Scanner(System.in);
	        	  
	        	  System.out.println("Enter the firstname ");
	        	  String fn = scan.next();
	        	  System.out.println("Enter the last name");
	        	  String ln = scan.next();
	        	  System.out.println("Enter the username");
	        	  String un = scan.next();
	        	  System.out.println("Enter the password");
	        	  String pw = scan.next();
	        	  System.out.println("Enter the city");
	        	  String c = scan.next();
	        	  System.out.println("Enter the last nameyour maiID");
	        	  String mid = scan.next();
	        	  System.out.println("Enter your mobile number ");
	        	  Long mb = scan.nextLong();
	        	    String sql = " insert into user(firstname , lastname, username, password,city,maiID,mobileNumber)" + "values('fn' ,  'ln',  'un' ,  'c', ' mid', 'mb')"; 
	        		Class.forName("com.mysql.cj.jdbc.Driver");
	        		
	        		Connection connection = DriverManager.getConnection("jdbc:mysql://mysql://localhost:3306/sys" , "sql12655381" , "sql12655381");
	             PreparedStatement statement = connection.prepareStatement("insert into student (firstname , lastname, username, password,city,maiID,mobileNumber)values(?,?,?,?,?,?,?)"); 
	            statement.setString(1, fn);
	            statement.setString(2, ln);
	            statement.setString(3, un);
	            statement.setString(4, pw);
	            statement.setString(5, mid);
	             statement.setLong(6, mb);   
	            
	        } catch (SQLException e) {
	            // Handle exceptions
	        }
	       
	    
	
}
}

