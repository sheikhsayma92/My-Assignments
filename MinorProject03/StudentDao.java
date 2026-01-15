package MinorProject03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class StudentDao {

	// Add Student
	public void addStudent(Student s) throws Exception {
		if (s.getPercentage() <= 0)
			throw new Exception("Percentage must be positive!");
		if (s.getBranch() == null || s.getBranch().isEmpty())
			throw new Exception("Branch cannot be empty!");
		if (s.getSem() <= 0)
			throw new Exception("Semester cannot be empty or negative!");

		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement("INSERT INTO stu_mgmt VALUES (?,?,?,?,?)")) {
			ps.setInt(1, s.getEno());
			ps.setString(2, s.getName());
			ps.setString(3, s.getBranch());
			ps.setInt(4, s.getSem());
			ps.setDouble(5, s.getPercentage());
			ps.executeUpdate();
			System.out.println("Student Added Successfully!");
		} catch (SQLIntegrityConstraintViolationException e) {
			throw new Exception("Enrollment No must be unique!");
		}
	}

	// Display All
	public void displayAll() throws SQLException {
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM stu_mgmt")) {
			while (rs.next()) {
				System.out.println(rs.getInt("eno") + ", " + rs.getString("name") + ", " + rs.getString("branch")
						+ ", Sem: " + rs.getInt("sem") + ", %: " + rs.getDouble("percentage"));
			}
		}
	}

	// Search by Eno
	public void searchByEno(int eno) throws SQLException {
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM stu_mgmt WHERE eno=?")) {
			ps.setInt(1, eno);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					System.out.println(
							"Found: " + rs.getInt("eno") + ", " + rs.getString("name") + ", " + rs.getString("branch")
									+ ", Sem: " + rs.getInt("sem") + ", %: " + rs.getDouble("percentage"));
				} else {
					System.out.println("No Student Found with Eno " + eno);
				}
			}
		}
	}

	// Update Branch
	public void updateBranch(int eno, String newBranch) throws SQLException {
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement("UPDATE stu_mgmt SET branch=? WHERE eno=?")) {
			ps.setString(1, newBranch);
			ps.setInt(2, eno);
			int rows = ps.executeUpdate();
			if (rows > 0)
				System.out.println("Branch Updated Successfully!");
			else
				System.out.println("No Student Found with Eno " + eno);
		}
	}

	// Delete by Eno
	public void deleteByEno(int eno) throws SQLException {
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement("DELETE FROM stu_mgmt WHERE eno=?")) {
			ps.setInt(1, eno);
			int rows = ps.executeUpdate();
			if (rows > 0)
				System.out.println("Student Deleted Successfully!");
			else
				System.out.println("No Student Found with Eno " + eno);
		}
	}

	// Display Sorted (by name)
	public void displaySorted() throws SQLException {
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM stu_mgmt ORDER BY name ASC")) {
			while (rs.next()) {
				System.out.println(rs.getInt("eno") + ", " + rs.getString("name") + ", " + rs.getString("branch")
						+ ", Sem: " + rs.getInt("sem") + ", %: " + rs.getDouble("percentage"));
			}
		}
	}
}