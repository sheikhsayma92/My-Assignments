package MinorProject01;

public abstract class Account {

	private String accountNumber;
	private String holderName;
	protected double balance;

	// Constructor
	public Account(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Encapsulation (getters/setters)
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	// Abstract methods (must be implemented by subclasses)
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	// Display account details
	public void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Balance: " + balance);
	}

}
