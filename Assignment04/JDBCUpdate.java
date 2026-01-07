package Assignment04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test_db";
		String user = "root";
		String password = "root";

		// try-with-resources ensures connection and statement auto-close
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

			// Step 1: Show records BEFORE update (only CSE students)
			String selectBefore = "SELECT id, name, branch, percentage FROM Students WHERE branch = 'CSE'";
			try (ResultSet rsBefore = stmt.executeQuery(selectBefore)) {
				System.out.println("--- BEFORE Update (CSE Students) ---");
				while (rsBefore.next()) {
					int id = rsBefore.getInt("id");
					String name = rsBefore.getString("name");
					String branch = rsBefore.getString("branch");
					double percentage = rsBefore.getDouble("percentage");

					System.out.println(id + ", " + name + ", " + branch + ", " + percentage);
				}
			}

			// Step 2: Perform update (increase 5% for CSE students)
			String updateQuery = "UPDATE Students SET percentage = percentage + (percentage * 0.05) WHERE branch = 'CSE'";
			int rowsAffected = stmt.executeUpdate(updateQuery);
			System.out.println("\n" + rowsAffected + " record(s) updated successfully.\n");

			// Step 3: Show records AFTER update (only CSE students)
			String selectAfter = "SELECT id, name, branch, percentage FROM Students WHERE branch = 'CSE'";
			try (ResultSet rsAfter = stmt.executeQuery(selectAfter)) {
				System.out.println("--- AFTER Update (CSE Students) ---");
				while (rsAfter.next()) {
					int id = rsAfter.getInt("id");
					String name = rsAfter.getString("name");
					String branch = rsAfter.getString("branch");
					double percentage = rsAfter.getDouble("percentage");

					System.out.println(id + ", " + name + ", " + branch + ", " + percentage);
				}
			}

		} catch (SQLException e) {
			System.out.println("Database operation failed!");
			e.printStackTrace();
		}
	}
}