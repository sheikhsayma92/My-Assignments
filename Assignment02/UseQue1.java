package Assignment02;

import java.util.Scanner;

public class UseQue1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create account
		System.out.println("Welcome to Bank Management System");
		System.out.print("Enter Account Holder Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Account Number: ");
		String accNo = sc.nextLine();
		System.out.print("Enter Initial Balance: ");
		double initialBalance = sc.nextDouble();

		Que1 account;
		try {
			account = new Que1(name, accNo, initialBalance);
			System.out.println("Account created successfully!");
		} catch (IllegalArgumentException e) {
			System.out.println("Error creating account: " + e.getMessage());
			sc.close();
			return;
		}

		int choice;
		do {
			System.out.println("\n--- Banking Menu ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance Enquiry");
			System.out.println("4. Display Account Details");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			try {
				switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = sc.nextDouble();
					account.deposit(depositAmount);
					break;

				case 2:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = sc.nextDouble();
					account.withdraw(withdrawAmount);
					break;

				case 3:
					System.out.println("Current Balance: " + account.getBalance());
					break;

				case 4:
					account.displayAccountDetails();
					break;

				case 5:
					System.out.println("Thank you for using Bank Management System!");
					break;

				default:
					System.out.println("Invalid choice! Try again.");
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (choice != 5);

		sc.close();
	}
}
