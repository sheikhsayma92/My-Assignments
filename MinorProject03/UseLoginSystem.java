package MinorProject03;

import java.util.Scanner;

public class UseLoginSystem {
	public static void main(String[] args) {
		if (!LoginSystem.login())
			return;

		Scanner sc = new Scanner(System.in);
		StudentDao dao = new StudentDao();

		while (true) {
			System.out.println("\n ------- Student Management System -------");
			System.out.println("\n1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Search Student by Eno");
			System.out.println("4. Update Student Branch");
			System.out.println("5. Delete Student by Eno");
			System.out.println("6. Display Sorted Students");
			System.out.println("7. Exit");
			System.out.print("Enter Choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter Eno: ");
					int eno = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Branch: ");
					String branch = sc.nextLine();
					System.out.print("Enter Sem: ");
					int sem = sc.nextInt();
					System.out.print("Enter Percentage: ");
					double percentage = sc.nextDouble();

					Student s = new Student(eno, name, branch, sem, percentage);
					dao.addStudent(s);
					break;

				case 2:
					dao.displayAll();
					break;

				case 3:
					System.out.print("Enter Eno: ");
					dao.searchByEno(sc.nextInt());
					break;

				case 4:
					System.out.print("Enter Eno: ");
					int enoUpdate = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter New Branch: ");
					String newBranch = sc.nextLine();
					dao.updateBranch(enoUpdate, newBranch);
					break;

				case 5:
					System.out.print("Enter Eno: ");
					dao.deleteByEno(sc.nextInt());
					break;

				case 6:
					dao.displaySorted();
					break;

				case 7:
					System.out.println("Thank you for using the app...");
					return;

				default:
					System.out.println("Invalid Choice!");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}