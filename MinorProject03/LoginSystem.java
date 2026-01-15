package MinorProject03;

import java.util.Scanner;

public class LoginSystem {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "1234";

	public static boolean login() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter Username: ");
			String u = sc.nextLine();
			System.out.print("Enter Password: ");
			String p = sc.nextLine();

			if (u.equals(USERNAME) && p.equals(PASSWORD)) {
				System.out.println("Login Successful!\n");
				return true;
			} else {
				System.out.println("Invalid Credentials! Please try again.\n");
			}
		}
	}
}