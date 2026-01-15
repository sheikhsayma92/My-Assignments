package Assignment02;

//Interface for banking operations
interface BankOperations {
	void deposit(double amount) throws IllegalArgumentException;

	void withdraw(double amount) throws IllegalArgumentException;

	double getBalance();
}

//Interface for customer operations
interface CustomerOperations {
	void displayAccountDetails();
}

//BankAccount class implementing both interfaces
class Que1 implements BankOperations, CustomerOperations {
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	// Constructor
	public Que1(String accountHolderName, String accountNumber, double initialBalance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative!");
		}
		this.balance = initialBalance;
	}

	// Deposit implementation
	@Override
	public void deposit(double amount) throws IllegalArgumentException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive!");
		}
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	// Withdraw implementation
	@Override
	public void withdraw(double amount) throws IllegalArgumentException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive!");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance!");
		}
		balance -= amount;
		System.out.println("Withdrawn: " + amount);
	}

	// Balance enquiry
	@Override
	public double getBalance() {
		return balance;
	}

	// Display account details
	@Override
	public void displayAccountDetails() {
		System.out.println("\n--- Account Details ---");
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}
}
