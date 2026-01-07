package Assignment04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBSCDisplay {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String user = "root";
		String password = "root";

		// try-with-resources ensures connection and statement auto-close
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

			// Query: Display all Students whose sem = 7 and branch = 'EC'
			String selectQuery = "SELECT id, name, age, course, branch, percentage, yop, sem "
					+ "FROM Students WHERE branch = 'EC' AND sem = 7";

			try (ResultSet rs = stmt.executeQuery(selectQuery)) {
				System.out.println("--- EC Branch, Semester 7 Students ---");
				boolean found = false;
				while (rs.next()) {
					found = true;
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String course = rs.getString("course");
					String branch = rs.getString("branch");
					double percentage = rs.getDouble("percentage");
					int yop = rs.getInt("yop");
					int sem = rs.getInt("sem");

					System.out.println("ID=" + id + ", " + "Name=" + name + ", " + "Age=" + age + ", " + "Course="
							+ course + ", " + "Branch=" + branch + ", " + "Percentage=" + percentage + ", " + "YOP="
							+ yop + ", " + "Sem=" + sem);
				}
				if (!found) {
					System.out.println("No matching records found.");
				}
			}

		} catch (SQLException e) {
			System.out.println("Database operation failed!");
			e.printStackTrace();
		}
	}
}