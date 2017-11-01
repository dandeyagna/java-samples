package Encapsulation;

public class SBIBankAccount
{
	public int accountNumber;
	public boolean active;
	private double balance;
		
	public SBIBankAccount(int accountNumber, double balance, boolean active)
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
}

