package Assignment02;

import java.util.Scanner;

public class UseQue3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Choose collection type (ArrayList/Vector): ");
		String type = sc.nextLine();
		Que3B manager = new Que3B(type);

		int choice;
		do {
			System.out.println("\n--- Student Management Menu ---");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Remove Student by RollNo");
			System.out.println("4. Search Student by RollNo");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter RollNo: ");
					String rollNo = sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Email: ");
					String email = sc.nextLine();
					Que3A s = new Que3A(rollNo, name, email);
					manager.addStudent(s);
					break;

				case 2:
					manager.displayStudents();
					break;

				case 3:
					System.out.print("Enter RollNo to remove: ");
					String rno = sc.nextLine();
					manager.removeStudent(rno);
					break;

				case 4:
					System.out.print("Enter RollNo to search: ");
					String srno = sc.nextLine();
					manager.searchStudent(srno);
					break;

				case 5:
					System.out.println("Thank you for using the app...");
					break;

				default:
					System.out.println("Invalid choice! Try again.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (choice != 5);

		sc.close();
	}
}