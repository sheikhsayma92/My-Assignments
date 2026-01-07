package Assignment04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertRecords {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String user = "root";
		String password = "root";

		// try-with-resources ensures conn, stmt, rs are closed automatically
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

			// Step 1: Create Students table if not exists (with branch & percentage)
			String createTable = "CREATE TABLE IF NOT EXISTS Students (" + "id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "name VARCHAR(50), " + "age INT, " + "course VARCHAR(50), " + "branch VARCHAR(50), "
					+ "percentage FLOAT)";
			stmt.executeUpdate(createTable);

			// Step 2: Insert sample records
			String insert1 = "INSERT INTO Students (name, age, course, branch, percentage) "
					+ "VALUES ('Alice', 20, 'B.Tech', 'Computer Science', 80.00)";
			String insert2 = "INSERT INTO Students (name, age, course, branch, percentage) "
					+ "VALUES ('Bob', 22, 'B.Tech', 'Information Technology', 75.40)";
			String insert3 = "INSERT INTO Students (name, age, course, branch, percentage) "
					+ "VALUES ('Charlie', 21, 'B.Tech', 'Electronics', 72.80)";
			stmt.executeUpdate(insert1);
			stmt.executeUpdate(insert2);
			stmt.executeUpdate(insert3);

			System.out.println("Records inserted successfully.");

			// Step 3: Show records
			String selectQuery = "SELECT * FROM Students";
			try (ResultSet rs = stmt.executeQuery(selectQuery)) {
				System.out.println("\n--- Students Table Records ---");
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String course = rs.getString("course");
					String branch = rs.getString("branch");
					double percentage = rs.getDouble("percentage");

					System.out
							.println(id + ", " + name + ", " + age + ", " + course + ", " + branch + ", " + percentage);
				}
			}

		} catch (SQLException e) {
			System.out.println("Database operation failed!");
			e.printStackTrace();
		}
	}
}