


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class AdminLogin {

		public static void adminLogin()  throws ClassNotFoundException, SQLException {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12655381" , "sql12655381" , "7C1BhmxHMh");
			
			System.out.println("connection established");
			
			PreparedStatement ps = con.prepareStatement("select * from adminLogin");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			
			Scanner sc =  new Scanner(System.in);
			
			System.out.println("welcome");
			System.out.println("enter username:");
			String uname =sc.next();
			
			System.out.println("Enter password");
		    String pw = sc.next();
		    
		    if(uname.equals(rs.getString(2)) && pw.equals(rs.getString(3))) {
		    	
		    	System.out.println("login successful");
		    }
		    else {
		    	System.out.println("Enter correct credentials");
		    }
			
			
			
			}
			
			
			

		}

	}

