package Assignment04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String user = "root";
		String password = "root";

		// try-with-resources ensures connection and statement auto-close
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

			// Step 1: Show records BEFORE deletion (only Civil branch, yop = 2024)
			String selectBefore = "SELECT id, name, age, course, branch, percentage, yop "
					+ "FROM Students WHERE branch = 'Civil' AND yop = 2024";
			try (ResultSet rsBefore = stmt.executeQuery(selectBefore)) {
				System.out.println("--- BEFORE Deletion (Civil, 2024 Students) ---");
				boolean found = false;
				while (rsBefore.next()) {
					found = true;
					int id = rsBefore.getInt("id");
					String name = rsBefore.getString("name");
					String branch = rsBefore.getString("branch");
					int year = rsBefore.getInt("yop");
					double percentage = rsBefore.getDouble("percentage");

					System.out.println(id + ", " + name + ", " + branch + ", " + year + ", " + percentage);
				}
				if (!found) {
					System.out.println("No matching records found.");
				}
			}

			// Step 2: Perform deletion (use correct column name 'yop')
			String deleteQuery = "DELETE FROM Students WHERE branch = 'Civil' AND yop = 2024";
			int rowsAffected = stmt.executeUpdate(deleteQuery);
			System.out.println("\n" + rowsAffected + " record(s) deleted successfully.\n");

			// Step 3: Show records AFTER deletion (only Civil branch, yop = 2024)
			String selectAfter = "SELECT id, name, branch, yop, percentage "
					+ "FROM Students WHERE branch = 'Civil' AND yop = 2024";
			try (ResultSet rsAfter = stmt.executeQuery(selectAfter)) {
				System.out.println("--- AFTER Deletion (Civil, 2024 Students) ---");
				boolean found = false;
				while (rsAfter.next()) {
					found = true;
					int id = rsAfter.getInt("id");
					String name = rsAfter.getString("name");
					String branch = rsAfter.getString("branch");
					int year = rsAfter.getInt("yop");
					double percentage = rsAfter.getDouble("percentage");

					System.out.println(id + ", " + name + ", " + branch + ", " + year + ", " + percentage);
				}
				if (!found) {
					System.out.println("No matching records remain.");
				}
			}

		} catch (SQLException e) {
			System.out.println("Database operation failed!");
			e.printStackTrace();
		}
	}
}