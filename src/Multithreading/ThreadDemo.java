package Multithreading;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		//Thread t1 = new Thread();
		//t1.start();
		Human h1 = new Human("Yagna");
		Thread t1 = new Thread(h1);
		t1.start();

		Human h2 = new Human("Narayana");
		Thread t2 = new Thread(h2);
		t1.setPriority(10);
		t2.start();
		
	}
}