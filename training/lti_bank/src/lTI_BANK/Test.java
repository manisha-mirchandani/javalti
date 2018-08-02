package lTI_BANK;

public class Test {

	public static void main(String[] args) {
		// Account ac =new Account("polo",5000);
		// ac.summary();
		// ac.deposit(3000);
		// System.out.println(ac.getBalance());
		// ac.withdraw(4000);
		// System.out.println(ac.getBalance());
		// ac.withdraw(7000);

		// Savings s=new Savings("mansha");
		// s.withdraw(5000);

		//
//		Current c = new Current("janet", 1000, 10000);
//		c.withdraw(5000);
//		c.deposit(5000);
//		c.summary();
		 Bank sav = AccountFactory.openAccount("savings","polo");
		 sav.summary();
		 sav.deposit(2000);
		 sav.deposit(4000);
		 sav.withdraw(3000);
		 sav.withdraw(7000);
		 sav.statement();
	}

}
