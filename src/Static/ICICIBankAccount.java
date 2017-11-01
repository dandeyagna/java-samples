package Static;

//class definition
	public class ICICIBankAccount
	{
		//Attributes - Instance variables
		private static int accountNumber;
		private boolean active;
		private double balance;
		
		//Parameterized Constructor
		public ICICIBankAccount(double balance, boolean active)
		{	
			++accountNumber;
			this.balance = balance;
			this.active = active;
		}

		//Methods accessors(getter) and mutators(setter)
		public static int getAccountNumber()
		{
			return accountNumber;
		}

		public boolean getActive()
		{
			return active;
		}
	
		public double getBalance()
		{
			return balance;
		}

		public void setActive(boolean Active)
		{
			this.active = Active;
		}
	
	}