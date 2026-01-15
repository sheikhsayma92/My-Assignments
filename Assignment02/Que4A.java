package Assignment02;

class Que4A {
	private String empId;
	private String name;
	private String email;

	public Que4A(String empId, String name, String email) {
		this.empId = empId;
		this.name = name;
		this.email = email;
	}

	public String getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "ID: " + empId + ", Name: " + name + ", Email: " + email;
	}
}
