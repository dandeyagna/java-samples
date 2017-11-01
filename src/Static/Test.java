package Static;

public class Test
{
	public static void main(String args[])
	{
		ICICIBankAccount yagnaAccount = new ICICIBankAccount(125.50, true);
		System.out.println(ICICIBankAccount.getAccountNumber());

		ICICIBankAccount rahulAccount = new ICICIBankAccount(645.90, true); 
		System.out.println(ICICIBankAccount.getAccountNumber());

		
		ICICIBankAccount goerAccount = new ICICIBankAccount(345.90, true); 
		System.out.println(ICICIBankAccount.getAccountNumber());
	}
}