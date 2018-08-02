package lTI_BANK;

public class CurrentTransaction extends Transaction {
	private String type;
	private double amount, balance,overdraft;

	public CurrentTransaction() {
		
	}

	public CurrentTransaction(String type, double amount, double balance,double overdraft) {
		super(type, amount, balance);
		this.overdraft= overdraft;
		
	}
	

	

}
