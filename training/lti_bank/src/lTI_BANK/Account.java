package lTI_BANK;

public  class Account implements Bank {
private int actno;
private String holder;
static double overdraft;


  static double balance;
private static int autogen = INIT_ACNT_NO;

protected Transaction[] txns;
protected CurrentTransaction[] ctxn;
protected int idx;
protected int cdx;
 Account() {
}
public Account(String holder, double balance) {
    this.actno = autogen ++;
	this.holder = holder;
	Account.balance = balance;
	txns = new Transaction[10];
	txns[idx ++] = new Transaction("ob",balance,balance);
	ctxn = new CurrentTransaction[20];
	ctxn[cdx ++] = new CurrentTransaction("cd",balance,balance,overdraft);
	
	
}
 public void summary() {
	 System.out.println("Act No"+actno);
	 System.out.println("Holder"+holder);
	 System.out.println("Balance"+balance);
 }
 public double getBalance() {
	 return balance;
 }
 public void deposit(double amount) {
	 balance += amount;
	 txns[idx ++] = new Transaction("cr",amount,balance);
	 ctxn[cdx ++] = new CurrentTransaction("ab",amount,balance,overdraft);
 }
 public  void withdraw(double amount) {
	 if(amount <= balance)
		 balance-=amount;
	 else
		 System.out.println("Insufficient Funds");
 }
 
// public void statement()
// {
//	 System.out.println("Statement of account:"+actno);
//	 for( int i=0;i<idx;i++)
//		 System.out.println(txns[i]);
// }
 
 public void statement()
 {
	 System.out.println("Statement of account:"+actno);
	 for( int i=0;i<cdx;i++)
		 System.out.println(ctxn[i]);
 }
 
}
