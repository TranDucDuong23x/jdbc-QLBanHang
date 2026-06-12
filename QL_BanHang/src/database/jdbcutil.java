package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class jdbcutil {
	public static Connection getConnection() {
		Connection c;
		try {
			Driver driver=new Driver();
			String url="jdbc:mysql://127.0.0.1:3306/ql_banhang";
			String userName="root";
			String password="";
			DriverManager.registerDriver(driver);
			c=DriverManager.getConnection(url,userName,password);
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
