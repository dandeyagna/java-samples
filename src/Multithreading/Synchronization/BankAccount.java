package Multithreading.Synchronization;

public class BankAccount
{
	private static int accountNumber=1;
	private boolean active;
	private double balance;
		
	public BankAccount(double balance)
	{	
		BankAccount.accountNumber++;
		this.balance = balance;
		this.active = true;
	}

	public synchronized void  withdraw(double amount) throws Exception
	{
		if(balance>=amount)
		{
			System.out.println("Withdrawing Money Rs."+amount+"....");
			balance = balance - amount;
			System.out.println("Current Balance is Rs."+balance);
		}
		else
		{
			throw new Exception();
		}
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public double getBalance()
	{
		return balance;
	}


}