package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
	
	 private static Connection conn;
	   
	   public static Connection getConnection() {
		   
	      try {
	         Class.forName("org.mariadb.jdbc.Driver");
	         String url = "jdbc:mariadb://localhost:3307/green";
	         String id="root";
	         String pw="1234"; 
	         
	         conn = DriverManager.getConnection(url,id,pw);
	         
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	       
	      return conn;
	   }


}
