package Bank;
import Bank.ICICIBankAccount;
public class Test1
{
	public static void main(String args[])
	{
		ICICIBankAccount yagnaAccount = new ICICIBankAccount(345,600.60,true);
		System.out.println(yagnaAccount.getAccountNumber());

		//ICICIBankAccount rahulAccount = new ICICIBankAccount();
		//System.out.println(rahulAccount.getAccountNumber());
	}

}