package Inheritance;

public class TestDriver
{
	public static void main(String[] args)
	{
		Employee emp = new Manager("Subbu",4000,1000); 
		System.out.println("Bonus is Rs."+((Manager)emp).getBonus());
	}
}