package Inheritance;

public class ICICIBankAccount extends BankAccount
{
	public ICICIBankAccount(int accountNumber)
	{	
		super(accountNumber); //if you don't write this then compiler will throw error
		System.out.println("Sub Class Constructor is called");
		
	}

}