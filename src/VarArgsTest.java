
public class VarArgsTest {

	public static int add(int... values) {
		int sum = 0;
		for(int x: values){
			sum = sum + x;
		}
		return sum;
	}

	public static void main(String args[]) {
		System.out.println(add());
		System.out.println(add(10,10,10,20,40,10));
	}
}