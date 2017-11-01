package Object;

public class TestDriver
{
	public static void main(String[] args)
	{
		Human hmn1 = new Human();
		System.out.println("Human Object is "+hmn1.hashCode());
		Human hmn2 = hmn1;
		System.out.println("Human Object is "+hmn2.hashCode());
	}
}