package Assignment02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Que2 {

	// Validate Mobile Number (10 digits, starts with 6-9)
	public static boolean validateMobile(String mobile) {
		String regex = "^[6-9]\\d{9}$";
		return Pattern.matches(regex, mobile);
	}

	// Validate Email ID
	public static boolean validateEmail(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return Pattern.matches(regex, email);
	}

	// Validate Username (alphanumeric, length 5-15)
	public static boolean validateUsername(String username) {
		String regex = "^[A-Za-z0-9]{5,15}$";
		return Pattern.matches(regex, username);
	}

	// Validate Password (at least 8 chars, one uppercase, one lowercase, one digit,
	// one special char)
	public static boolean validatePassword(String password) {
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
		return Pattern.matches(regex, password);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Input Validation Menu ---");
			System.out.println("1. Validate Mobile Number");
			System.out.println("2. Validate Email ID");
			System.out.println("3. Validate Username");
			System.out.println("4. Validate Password");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			try {
				choice = sc.nextInt();
				sc.nextLine(); // consume newline

				switch (choice) {
				case 1:
					System.out.print("Enter Mobile Number: ");
					String mobile = sc.nextLine();
					if (validateMobile(mobile)) {
						System.out.println("Welcome! Valid Mobile Number.");
					} else {
						System.out.println("Invalid Mobile Number!");
					}
					break;

				case 2:
					System.out.print("Enter Email ID: ");
					String email = sc.nextLine();
					if (validateEmail(email)) {
						System.out.println("Welcome! Valid Email ID.");
					} else {
						System.out.println("Invalid Email ID!");
					}
					break;

				case 3:
					System.out.print("Enter Username: ");
					String username = sc.nextLine();
					if (validateUsername(username)) {
						System.out.println("Welcome! Valid Username.");
					} else {
						System.out.println("Invalid Username!");
					}
					break;

				case 4:
					System.out.print("Enter Password: ");
					String password = sc.nextLine();
					if (validatePassword(password)) {
						System.out.println("Welcome! Valid Password.");
					} else {
						System.out.println("Invalid Password!");
					}
					break;

				case 5:
					System.out.println("Thank you for using the app...");
					break;

				default:
					System.out.println("Invalid choice! Please try again.");
				}
			} catch (Exception e) {
				System.out.println("Error: Invalid input. Please enter a valid choice.");
				sc.nextLine(); // clear buffer
				choice = 0; // reset choice
			}
		} while (choice != 5);

		sc.close();
	}
}