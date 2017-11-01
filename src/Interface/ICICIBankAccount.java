package Interface;

public class ICICIBankAccount implements BankAccount, LICPolicy 
{
	private int accountNumber;
	private boolean active;
	private double balance;
	private double amount;
	public ICICIBankAccount(int accountNumber, double balance, boolean active)
	{	
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.active = active;
	}
	public void withdraw(double amount)
	{
		balance = balance - amount + 0.05;
	}
	public void deposit(double amount) 
	//If this method is not here then compiler will give error
	{
		balance = balance + amount + 0.05;
	}
	public void payPolicypremium(double Amount)
	{
		this.amount = this.amount+Amount;
	}
}