package MinorProject02;

import java.io.Serializable;

class Employee implements Comparable<Employee>, Serializable {
	private int id;
	private String name;
	private String department;
	private double salary;

	// Constructor
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// String representation of Employee
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary;
	}

	// Sorting employees by ID
	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}
}
