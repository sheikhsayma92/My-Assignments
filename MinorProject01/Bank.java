package MinorProject01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<String, Account> accounts = new HashMap<>();
	private final String fileName = "accounts.txt";

	// Load accounts from file
	public Bank() {
		loadAccounts();
	}

	// Create account (Method Overloading)
	public void createAccount(String accNo, String name, double balance, String type) {
		Account acc;
		if (type.equalsIgnoreCase("savings")) {
			acc = new SavingsAccount(accNo, name, balance);
		} else {
			acc = new CurrentAccount(accNo, name, balance);
		}
		accounts.put(accNo, acc);
		saveAccounts();
		System.out.println(type + " Account created successfully!");
	}

	// Deposit
	public void deposit(String accNo, double amount) {
		Account acc = accounts.get(accNo);
		if (acc != null) {
			acc.deposit(amount);
			saveAccounts();
		} else {
			System.out.println("Account not found!");
		}
	}

	// Withdraw
	public void withdraw(String accNo, double amount) {
		Account acc = accounts.get(accNo);
		if (acc != null) {
			acc.withdraw(amount);
			saveAccounts();
		} else {
			System.out.println("Account not found!");
		}
	}

	// Balance enquiry
	public void checkBalance(String accNo) {
		Account acc = accounts.get(accNo);
		if (acc != null) {
			System.out.println("Balance: " + acc.getBalance());
		} else {
			System.out.println("Account not found!");
		}
	}

	// Display account details
	public void displayAccount(String accNo) {
		Account acc = accounts.get(accNo);
		if (acc != null) {
			acc.displayDetails();
		} else {
			System.out.println("Account not found!");
		}
	}

	// Save accounts to file
	private void saveAccounts() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			for (Account acc : accounts.values()) {
				pw.println(acc.getAccountNumber() + "," + acc.getHolderName() + "," + acc.getBalance() + ","
						+ acc.getClass().getSimpleName());
			}
		} catch (IOException e) {
			System.out.println("Error saving accounts: " + e.getMessage());
		}
	}

	// Load accounts from file
	private void loadAccounts() {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String accNo = data[0];
				String name = data[1];
				double balance = Double.parseDouble(data[2]);
				String type = data[3];
				if (type.equals("SavingsAccount")) {
					accounts.put(accNo, new SavingsAccount(accNo, name, balance));
				} else {
					accounts.put(accNo, new CurrentAccount(accNo, name, balance));
				}
			}
		} catch (IOException e) {
			// Ignore if file doesn't exist yet
		}
	}

}
