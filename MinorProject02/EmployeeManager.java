package MinorProject02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class EmployeeManager {
	private Map<Integer, Employee> employees = new HashMap<>();
	private final String fileName = "employees.dat";

	// Constructor loads existing employees from file
	public EmployeeManager() {
		loadFromFile();
	}

	// Add Employee with validation
	public void addEmployee(Employee emp) throws Exception {
		if (employees.containsKey(emp.getId())) {
			throw new Exception("Employee ID must be unique!");
		}
		if (emp.getSalary() <= 0) {
			throw new Exception("Salary must be positive!");
		}
		if (emp.getDepartment().trim().isEmpty()) {
			throw new Exception("Department cannot be empty!");
		}
		employees.put(emp.getId(), emp);
		saveToFile();
		System.out.println("✅ Employee added successfully!");
	}

	// Display all employees
	public void displayAll() {
		if (employees.isEmpty()) {
			System.out.println("⚠ No employees found.");
			return;
		}
		System.out.println("\n--- Employee List ---");
		for (Employee e : employees.values()) {
			System.out.println(e);
		}
	}

	// Search employee by ID
	public void searchById(int id) {
		Employee e = employees.get(id);
		if (e != null) {
			System.out.println("🔍 Employee Found: " + e);
		} else {
			System.out.println("⚠ Employee not found!");
		}
	}

	// Update salary
	public void updateSalary(int id, double newSalary) throws Exception {
		Employee e = employees.get(id);
		if (e == null) {
			throw new Exception("Employee not found!");
		}
		if (newSalary <= 0) {
			throw new Exception("Salary must be positive!");
		}
		e.setSalary(newSalary);
		saveToFile();
		System.out.println("✅ Salary updated successfully!");
	}

	// Delete employee
	public void deleteEmployee(int id) throws Exception {
		if (!employees.containsKey(id)) {
			throw new Exception("Employee not found!");
		}
		employees.remove(id);
		saveToFile();
		System.out.println("✅ Employee deleted successfully!");
	}

	// Display employees sorted by ID
	public void displaySorted() {
		if (employees.isEmpty()) {
			System.out.println("⚠ No employees to sort.");
			return;
		}
		TreeSet<Employee> sorted = new TreeSet<>(employees.values());
		System.out.println("\n--- Sorted Employees (by ID) ---");
		for (Employee e : sorted) {
			System.out.println(e);
		}
	}

	// Display all unique departments
	public void displayDepartments() {
		Set<String> depts = new HashSet<>();
		for (Employee e : employees.values()) {
			depts.add(e.getDepartment());
		}
		if (depts.isEmpty()) {
			System.out.println("⚠ No departments found.");
		} else {
			System.out.println("\n--- Departments ---");
			for (String d : depts) {
				System.out.println(d);
			}
		}
	}

	// Save employees to file
	private void saveToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(employees);
		} catch (IOException e) {
			System.out.println("❌ Error saving file: " + e.getMessage());
		}
	}

	// Load employees from file
	private void loadFromFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			employees = (Map<Integer, Employee>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// Ignore if file doesn't exist yet
		}
	}
}
