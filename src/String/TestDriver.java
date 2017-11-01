package String;
public class TestDriver
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Java234");
		System.out.println("Before Change "+sb);
		sb.delete(0,sb.capacity());
		System.out.println("After Clear "+sb);
		sb.append("Technologies");
		System.out.println("After Change "+sb);
	}
}