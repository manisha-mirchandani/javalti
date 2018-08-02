package ass;

public interface Bank {
	void summary();

	double getBalance();

	void deposit(double amount);

	void withdraw(double amount);

	void statement();

}
