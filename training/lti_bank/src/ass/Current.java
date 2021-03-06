package ass;

public class Current extends Account {
	private double overdraft;

	public Current() {

	}

	public Current(String holder) {
		super(holder, balance);
		this.overdraft = OVERDRAFT_AMT;
	}

	@Override
	public void withdraw(double amount) {
		if (amount < (balance + overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				overdraft += balance;
				balance = MIN_CUR_BAL;
			}
		}

		else {
			System.out.println("in");

		}
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("overdraft =" + overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft >OVERDRAFT_AMT) {
			balance += (overdraft - OVERDRAFT_AMT);
			overdraft = OVERDRAFT_AMT;
			

		}

	}

}
