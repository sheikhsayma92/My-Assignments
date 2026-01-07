package MinorProject01;

public class SavingsAccount extends Account {
	public SavingsAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// Method Overriding (Polymorphism)
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " into Savings Account.");
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Savings Account.");
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

}
