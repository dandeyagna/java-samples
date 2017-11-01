package Bank;

public class HDFCBankAccount extends BankAccount
{
	protected int yagna;
	public HDFCBankAccount(int AccountNumber, double Balance, boolean Active)
	{	
		super(AccountNumber, Balance, Active);
		yagna = 1500;
	}

}
