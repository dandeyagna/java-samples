package Bank;

public class ICICIBankAccount extends BankAccount
{
		
	public ICICIBankAccount(int accountNumber, double balance, boolean Active)
	{	
		super(accountNumber, balance, Active);
	}

	public ICICIBankAccount(int accountNumber,  boolean active, double balance)
	{	
		super(accountNumber, balance, active);
	}

	public ICICIBankAccount(boolean active, int accountNumber, double balance)
	{	
		super(accountNumber, balance, active);
	}

}
