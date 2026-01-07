package MinorProject02;

import java.util.Scanner;

public class UseEmployee {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "1234";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Login loop
		boolean loggedIn = false;
		while (!loggedIn) {
			System.out.println("\n--- Employee Management System Login ---");
			System.out.print("Enter Username: ");
			String user = sc.nextLine();
			System.out.print("Enter Password: ");
			String pass = sc.nextLine();

			if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
				System.out.println("✅ Login successful! Welcome " + user + "!");
				loggedIn = true;
			} else {
				System.out.println("❌ Invalid credentials. Please try again.\n");
			}
		}

		// After login, show menu
		EmployeeManager manager = new EmployeeManager();
		while (true) {
			System.out.println("\n--- Employee Management System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Update Employee Salary");
			System.out.println("5. Delete Employee");
			System.out.println("6. Display Sorted Employees");
			System.out.println("7. Display Departments");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Department: ");
					String dept = sc.nextLine();
					System.out.print("Enter Salary: ");
					double sal = sc.nextDouble();
					manager.addEmployee(new Employee(id, name, dept, sal));
					break;
				case 2:
					manager.displayAll();
					break;
				case 3:
					System.out.print("Enter ID: ");
					id = sc.nextInt();
					manager.searchById(id);
					break;
				case 4:
					System.out.print("Enter ID: ");
					id = sc.nextInt();
					System.out.print("Enter New Salary: ");
					sal = sc.nextDouble();
					manager.updateSalary(id, sal);
					break;
				case 5:
					System.out.print("Enter ID: ");
					id = sc.nextInt();
					manager.deleteEmployee(id);
					break;
				case 6:
					manager.displaySorted();
					break;
				case 7:
					manager.displayDepartments();
					break;
				case 8:
					System.out.println("👋 Exiting... Thank you for using the app!");
					sc.close();
					System.exit(0);
				default:
					System.out.println("⚠ Invalid choice!");
				}
			} catch (Exception e) {
				System.out.println("❌ Error: " + e.getMessage());
			}
		}
	}
}
