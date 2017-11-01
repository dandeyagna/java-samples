package parameterPassing;

public class Driver
{
	public static void main(String args[])
	{
		Human hmn = new Human(20);
		System.out.println("Current Age is "+hmn.getAge());
		add20(hmn);
		System.out.println("Age after 20 years is "+hmn.getAge());		
	}
	
	public static void add20(Human hmn)
	{	
		hmn.setAge((hmn.getAge())+20);
		hmn = null; //hmn in main method will not become null;
	}

}