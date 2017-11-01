package ExceptionHandling;

public class TestDriver
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		try
		{
			emp.setEmployeeSalary(-134.89);
			System.out.println("Salary is "+emp.getEmployeeSalary());
		}
		catch(NegativeSalaryException ne)
		{
			System.out.println("I am mad");
			ne.printStackTrace();
		}
	}
}