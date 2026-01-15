package Assignment02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

//Interface for operations
interface EmployeeOperations {
	void addEmployee(Que4A e) throws Exception;

	void displayEmployees();

	void searchEmployee(String empId) throws Exception;

	void removeEmployee(String empId) throws Exception;

	void demonstrateNullSupport();
}

//Manager class implementing interface
class Que4B implements EmployeeOperations {
	private Map<String, Que4A> employeeMap;

	public Que4B(String type) {
		if (type.equalsIgnoreCase("hashmap")) {
			employeeMap = new HashMap<>();
		} else if (type.equalsIgnoreCase("hashtable")) {
			employeeMap = new Hashtable<>();
		} else if (type.equalsIgnoreCase("treemap")) {
			employeeMap = new TreeMap<>();
		} else {
			employeeMap = new HashMap<>(); // default
		}
	}

	// Regex validation
	private boolean validateEmpId(String empId) {
		return Pattern.matches("\\d+", empId);
	}

	private boolean validateName(String name) {
		return Pattern.matches("[A-Za-z ]+", name);
	}

	private boolean validateEmail(String email) {
		return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
	}

	@Override
	public void addEmployee(Que4A e) throws Exception {
		if (!validateEmpId(e.getEmpId()))
			throw new Exception("Invalid Employee ID!");
		if (!validateName(e.getName()))
			throw new Exception("Invalid Name!");
		if (!validateEmail(e.getEmail()))
			throw new Exception("Invalid Email!");

		if (employeeMap.containsKey(e.getEmpId())) {
			throw new Exception("Duplicate Employee ID!");
		}
		employeeMap.put(e.getEmpId(), e);
		System.out.println("Employee added successfully!");
	}

	@Override
	public void displayEmployees() {
		if (employeeMap.isEmpty()) {
			System.out.println("No employee records found.");
			return;
		}
		System.out.println("\n--- Employee Records ---");
		for (Map.Entry<String, Que4A> entry : employeeMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	@Override
	public void searchEmployee(String empId) throws Exception {
		if (employeeMap.containsKey(empId)) {
			System.out.println("Employee Found: " + employeeMap.get(empId));
		} else {
			throw new Exception("Employee with ID " + empId + " not found!");
		}
	}

	@Override
	public void removeEmployee(String empId) throws Exception {
		if (employeeMap.containsKey(empId)) {
			employeeMap.remove(empId);
			System.out.println("Employee removed successfully!");
		} else {
			throw new Exception("Employee with ID " + empId + " not found!");
		}
	}

	@Override
	public void demonstrateNullSupport() {
		System.out.println("\n--- Null Key/Value Demonstration ---");
		try {
			employeeMap.put(null, new Que4A("0", "NullKeyEmp", "null@demo.com"));
			employeeMap.put("999", null);
			System.out.println("Inserted null key and/or null value successfully!");
		} catch (Exception e) {
			System.out.println("This collection does not support null key/value: " + e.getMessage());
		}
	}
}
