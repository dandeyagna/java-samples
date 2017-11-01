package Multithreading.Synchronization;

public class ATMThread implements Runnable 
{
	private BankAccount ba;
	public ATMThread(BankAccount ba)
	{
		this.ba = ba;
	}
	public void run()
	{
		int counter=0;
		try{
			ba.withdraw(100);
		}catch(Exception e){
			System.out.println("No Sufficient Funds in your Account...");
		}
	}	
}