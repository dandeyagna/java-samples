public class ParameterPassing
{
	static int age = 20;
	static int age1 = 40;
	public static void main(String args[])
	{
		System.out.println("Current Age is "+ParameterPassing.age);
		ParameterPassing.add20();
		System.out.println("Age after 20 years is "+ParameterPassing.age);		
	}
	
	public static void add20()
	{
		ParameterPassing.age=ParameterPassing.age+20;
		System.out.println("Inside age20 method Age after 20 years is "+ParameterPassing.age);
	}

}