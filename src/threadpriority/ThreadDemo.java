package threadpriority;

public class ThreadDemo
{
	public static void main(String[] args)
	{
		
		Human h1 = new Human("Yagna");
		Thread t1 = new Thread(h1);
		t1.start();

		Human h2 = new Human("Narayana");
		Thread t2 = new Thread(h2);
		t2.setPriority(10); //Comment this and see difference
		t2.start();
	}
}