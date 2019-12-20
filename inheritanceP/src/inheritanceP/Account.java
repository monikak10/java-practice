package inheritanceP;

public class Account {
	private String accountNumber;
	private int balance;
	
	
	public int getBalance() {
		return balance;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void deposit(int transactionAmount) {
		if(balance<transactionAmount) {
			System.out.println("insuffient balance");
		}else {
				balance=(balance+transactionAmount);
				System.out.println("Your balance after the transaction is: "+balance);
		}
	}
	
	public void withdraw(int amt) {
		
		if(balance>=amt)
		{ 
			balance=balance-amt;
			System.out.println("Your balance after the transaction is: "+balance);
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}
	
	
}
