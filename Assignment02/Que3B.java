package Assignment02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;

//Interface for operations
interface StudentOperations {
	void addStudent(Que3A s) throws Exception;

	void displayStudents();

	void removeStudent(String rollNo) throws Exception;

	void searchStudent(String rollNo) throws Exception;
}

//Manager class implementing interface
class Que3B implements StudentOperations {
	private List<Que3A> studentList; // can be ArrayList or Vector

	public Que3B(String type) {
		if (type.equalsIgnoreCase("arraylist")) {
			studentList = new ArrayList<>();
		} else if (type.equalsIgnoreCase("vector")) {
			studentList = new Vector<>();
		} else {
			studentList = new ArrayList<>(); // default
		}
	}

	// Regex validation
	private boolean validateRollNo(String rollNo) {
		return Pattern.matches("\\d+", rollNo);
	}

	private boolean validateName(String name) {
		return Pattern.matches("[A-Za-z ]+", name);
	}

	private boolean validateEmail(String email) {
		return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
	}

	@Override
	public void addStudent(Que3A s) throws Exception {
		if (!validateRollNo(s.getRollNo()))
			throw new Exception("Invalid Roll Number!");
		if (!validateName(s.getName()))
			throw new Exception("Invalid Name!");
		if (!validateEmail(s.getEmail()))
			throw new Exception("Invalid Email!");

		for (Que3A st : studentList) {
			if (st.getRollNo().equals(s.getRollNo())) {
				throw new Exception("Duplicate Roll Number!");
			}
		}
		studentList.add(s);
		System.out.println("Student added successfully!");
	}

	@Override
	public void displayStudents() {
		if (studentList.isEmpty()) {
			System.out.println("No student records found.");
			return;
		}
		System.out.println("\n--- Student Records ---");
		for (Que3A s : studentList) {
			System.out.println(s);
		}
	}

	@Override
	public void removeStudent(String rollNo) throws Exception {
		boolean found = false;
		Iterator<Que3A> it = studentList.iterator();
		while (it.hasNext()) {
			Que3A s = it.next();
			if (s.getRollNo().equals(rollNo)) {
				it.remove();
				found = true;
				System.out.println("Student removed successfully!");
				break;
			}
		}
		if (!found)
			throw new Exception("Student with RollNo " + rollNo + " not found!");
	}

	@Override
	public void searchStudent(String rollNo) throws Exception {
		for (Que3A s : studentList) {
			if (s.getRollNo().equals(rollNo)) {
				System.out.println("Student Found: " + s);
				return;
			}
		}
		throw new Exception("Student with RollNo " + rollNo + " not found!");
	}
}
