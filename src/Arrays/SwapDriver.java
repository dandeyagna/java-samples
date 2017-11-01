package Arrays;
public class SwapDriver
{
	public static void main(String[] args)
	{
		int[] A = {1,2};
		swap(A);
		System.out.println("Inside main: a = "+A[0]+" b = "+A[1]);
		
	}
	public static void swap(int[] A)
	{
		int temp;
		temp = A[0];
		A[0] = A[1];
		A[1] = temp;
		System.out.println("Inside swap: a = "+A[0]+" b = "+A[1]);
	}
}