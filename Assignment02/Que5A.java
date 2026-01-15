package Assignment02;

class Que5A {
	private String id;
	private String name;
	private String course;
	private int marks;

	public Que5A(String id, String name, String course, int marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Course: " + course + ", Marks: " + marks;
	}
}
