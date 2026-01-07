package MinorProject01;

import java.util.Scanner;

public class UseBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();

		while (true) {
			System.out.println("\n--- Bank Management System ---");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance Enquiry");
			System.out.println("5. Display Account Details");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Account Number: ");
				String accNo = sc.next();
				sc.nextLine();
				System.out.print("Enter Holder Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Initial Balance: ");
				double balance = sc.nextDouble();
				System.out.print("Enter Account Type (Savings/Current): ");
				String type = sc.next();
				bank.createAccount(accNo, name, balance, type);
				break;
			case 2:
				System.out.print("Enter Account Number: ");
				accNo = sc.next();
				System.out.print("Enter Amount: ");
				double depAmt = sc.nextDouble();
				bank.deposit(accNo, depAmt);
				break;
			case 3:
				System.out.print("Enter Account Number: ");
				accNo = sc.next();
				System.out.print("Enter Amount: ");
				double withAmt = sc.nextDouble();
				bank.withdraw(accNo, withAmt);
				break;
			case 4:
				System.out.print("Enter Account Number: ");
				accNo = sc.next();
				bank.checkBalance(accNo);
				break;
			case 5:
				System.out.print("Enter Account Number: ");
				accNo = sc.next();
				bank.displayAccount(accNo);
				break;
			case 6:
				System.out.println("Thank you for using the app!");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

}
