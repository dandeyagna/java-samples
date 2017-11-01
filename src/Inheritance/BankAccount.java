package Inheritance;

public abstract class BankAccount
{
	private int accountNumber;
	private boolean active;
	private double balance;
		
	public BankAccount(int accountNumber)
	{	
		System.out.println("Super Class Constructor is called"+accountNumber);
		this.accountNumber = accountNumber;
		this.balance = 345;
		this.active = true;
	}

}