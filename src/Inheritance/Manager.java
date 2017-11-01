package Inheritance;

public class Manager extends Employee
{
	private int bonus;
	public Manager(String name, int salary, int bonus)
	{
		super(name,salary);
		this.bonus = bonus;
	}
	public int getSalary() //override method
	{
		return (super.getSalary()+bonus);
	}
	public int getBonus()
	{
		return bonus;
	}	
}