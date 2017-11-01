package ExceptionHandling;

public class Employee
{
	private static int EmployeeID;
	private double EmployeeSalary;
	
	public Employee()
	{
		Employee.EmployeeID = Employee.EmployeeID + 1;
		this.EmployeeSalary=0;
	}

	public int getEmployeeID()
	{
		return EmployeeID;
	}
	
	public double getEmployeeSalary()
	{
		return EmployeeSalary;
	}
	
	public void setEmployeeSalary(double EmployeeSalary) throws NegativeSalaryException
	{
		if(EmployeeSalary>0)
		{
			this.EmployeeSalary = EmployeeSalary;
		}
		else
		{
			//Create a New Exception Object and Throw Exception Object
			throw new NegativeSalaryException();
		}
	}	
}