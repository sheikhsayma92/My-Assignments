package Assignment02;

class Que3A {
	private String rollNo;
	private String name;
	private String email;

	public Que3A(String rollNo, String name, String email) {
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "RollNo: " + rollNo + ", Name: " + name + ", Email: " + email;
	} 
}
