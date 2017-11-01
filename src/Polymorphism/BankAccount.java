package Polymorphism;

public abstract class BankAccount
{
	protected int accountNumber;
	protected  boolean active;
	protected  double balance;
		
	public BankAccount(int accountNumber, double balance, boolean active)
	{	
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.active = active;
	}

	public void Withdraw(double amount)
	{
		balance = balance - amount;
	}
		
	public abstract void Deposit(double amount);

	public void getBalance()
	{
		System.out.println("Balance is "+balance);
	}

	public void setAccountNumber(int AccountNumber)
	{
		this.accountNumber = AccountNumber;
	}

}