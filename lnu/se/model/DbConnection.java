package lnu.se.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class DbConnection {
	
	public static String DB_URI = "jdbc:mysql://localhost:3306/messaging";
	public static String DB_USER = "root";
	public static String DB_PASS = "root";
	public static Connection connection = null;
	
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URI, DB_USER, DB_PASS);
		} catch (Exception e) {
			System.err.println(e);
		}
		return connection;
	}
	public abstract void  close();
	public static boolean insert(String sql) {
		boolean isAffected=false;
		try {
			Connection connection = connect();
			Statement stmt = connection.createStatement();
			int value = stmt.executeUpdate(sql);
			if (value != 1) 
				isAffected=false;
			else 
				isAffected=true;
		} catch (Exception e) {
			System.err.println(e);
		}
		return isAffected;
	}
	public static ResultSet view(String sql) {
		ResultSet rs=null;
		try {
			Connection connection = connect();
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			System.err.println(e);
		}
		return rs;
	}
	public static int delete(String sql) {
		int value=0;
		try {
			Connection connection = connect();
			Statement stmt = connection.createStatement();
			value = stmt.executeUpdate(sql);
		
		} catch (Exception e) {
			System.err.println(e);
		}
		return value;
	}
	public static int update(String sql) {
		int value=0;
		try {
			Connection con = connect();
			Statement stmt = con.createStatement();
			value = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			System.err.println(e);
		}
		return value;
	}
}
