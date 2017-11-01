package Arrays;

public class Driver
{
	public static void main(String[] args)
	{
		Student[] s = new Student[3];
		s[0] = new Student("s1",1);
		s[1] = new Student("s2",2); 
		s[2] = new Student("s3",3);
		printStudentDetails(s);
	}				
	public static void printStudentDetails(Student s[])
	{
		for (int i=0;i<s.length;i++)
		{
			System.out.println("Student Name: "+s[i].getName());
			System.out.println("Student Roll: "+s[i].getRollNumber());
		}
	}
}