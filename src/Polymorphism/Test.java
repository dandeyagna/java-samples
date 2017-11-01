package Polymorphism;

public class Test
{
	public static void main(String args[])
	{
		ICICIBankAccount iciciAccount = new ICICIBankAccount(3456, 150.50, true);
		iciciAccount.Deposit(300); //450.50
		iciciAccount.getBalance();
		
	}
}
