package Bank;

public abstract class BankAccount
{
	protected int accountNumber;
	private boolean active;
	private double balance;
		
	public BankAccount(int accountNumber, double balance, boolean active)
	{	
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.active = active;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount -10;
	}
		
	public void deposit(double amount)
	{
		balance = balance + amount -10;
	}

	public void getBalance()
	{
		System.out.println("Balance is "+balance);
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}

}

