package Assignment02;

import java.util.Scanner;

public class UseQue5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Que5B manager = new Que5B();

		int choice;
		do {
			System.out.println("\n--- University Student Management Menu ---");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Remove Student by ID");
			System.out.println("4. Search Student by ID");
			System.out.println("5. Sort Students by Marks");
			System.out.println("6. Convert HashMap to TreeMap");
			System.out.println("7. Count Students Course-wise");
			System.out.println("8. Display All Courses");
			System.out.println("9. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter ID: ");
					String id = sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Course: ");
					String course = sc.nextLine();
					System.out.print("Enter Marks: ");
					int marks = sc.nextInt();
					sc.nextLine();
					Que5A s = new Que5A(id, name, course, marks);
					manager.addStudent(s);
					break;

				case 2:
					manager.displayStudents();
					break;

				case 3:
					System.out.print("Enter ID to remove: ");
					String rid = sc.nextLine();
					manager.removeStudent(rid);
					break;

				case 4:
					System.out.print("Enter ID to search: ");
					String sid = sc.nextLine();
					manager.searchStudent(sid);
					break;

				case 5:
					manager.sortByMarks();
					break;

				case 6:
					manager.convertHashMapToTreeMap();
					break;

				case 7:
					manager.countCourseWise();
					break;

				case 8:
					manager.displayCourses();
					break;

				case 9:
					System.out.println("Thanks for using the app...");
					break;

				default:
					System.out.println("Invalid choice!");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (choice != 9);

		sc.close();
	}
}