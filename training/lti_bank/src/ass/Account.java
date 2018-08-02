package ass;

public  class Account implements Bank {
private int actno;
private String holder;



 static double balance;
private static int autogen = INIT_ACNT_NO;

protected Transaction[] txns;
protected int idx;
 Account() {
}
public Account(String holder, double balance) {
    this.actno = autogen ++;
	this.holder = holder;
	this.balance = balance;
	
	
	txns = new Transaction[10];
	
	txns[idx ++] = new Transaction("ob",balance,balance);
	
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
 }
 public  void withdraw(double amount) {
	 if(amount <= balance)
		 balance-=amount;
	 else
		 System.out.println("Insufficient Funds");
 }
 
 public void statement()
 {
	 System.out.println("Statement of account:"+actno);
	 for( int i=0;i<idx;i++)
		 System.out.println(txns[i]);
 }
 
}
