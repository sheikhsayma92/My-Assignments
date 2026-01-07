package MinorProject01;

public class CurrentAccount extends Account {
	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// Method Overriding (Polymorphism)
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " into Current Account.");
	}

	@Override
	public void withdraw(double amount) {
		// Allow overdraft up to -5000
		if (balance - amount >= -5000) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Current Account.");
		} else {
			System.out.println("Overdraft limit exceeded!");
		}
	}
}
