package threadpriority;

public class Human implements Runnable 
{
	private String name;
	private int counter;
	public Human(String name)
	{
		this.name = name;
		counter=0;
	}
	public void run()
	{
		while(true)
		{
			System.out.println("Running "+name+"....");
			if(counter>10)
			{
				break;
			}
			counter++;
		}
	}	
}
