package Multithreading.Synchronization;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		
		BankAccount yagnaAccount = new BankAccount(100);
		ATMThread BanerATM = new ATMThread(yagnaAccount);
		Thread t1 = new Thread(BanerATM);
		t1.start();

		ATMThread AundhATM = new ATMThread(yagnaAccount);
		Thread t2 = new Thread(AundhATM);
		t2.start();

	}
}