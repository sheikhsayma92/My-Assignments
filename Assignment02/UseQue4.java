package Assignment02;

import java.util.Scanner;

public class UseQue4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Choose collection type (HashMap/Hashtable/TreeMap): ");
		String type = sc.nextLine();
		Que4B manager = new Que4B(type);

		int choice;
		do {
			System.out.println("\n--- Employee Management Menu ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Remove Employee by ID");
			System.out.println("5. Demonstrate Null Key/Value Support");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter Employee ID: ");
					String empId = sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Email: ");
					String email = sc.nextLine();
					Que4A e = new Que4A(empId, name, email);
					manager.addEmployee(e);
					break;

				case 2:
					manager.displayEmployees();
					break;

				case 3:
					System.out.print("Enter Employee ID to search: ");
					String searchId = sc.nextLine();
					manager.searchEmployee(searchId);
					break;

				case 4:
					System.out.print("Enter Employee ID to remove: ");
					String removeId = sc.nextLine();
					manager.removeEmployee(removeId);
					break;

				case 5:
					manager.demonstrateNullSupport();
					break;

				case 6:
					System.out.println("Thanks for using the app...");
					break;

				default:
					System.out.println("Invalid choice! Try again.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (choice != 6);

		sc.close();
	}
}