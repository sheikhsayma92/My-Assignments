package Assignment04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static void main(String[] args) {
		// Database URL, username and password
		String url = "jdbc:mysql://localhost:3306/test_db";
		String user = "root";
		String password = "root";

		// try-with-resources ensures connection is closed automatically
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			if (conn != null) {
				System.out.println("Connection Successful!");
			} else {
				System.out.println("Unable to connect");
			}
		} catch (SQLException e) {
			System.out.println("Unable to connect");
			e.printStackTrace();
		}
	}
}