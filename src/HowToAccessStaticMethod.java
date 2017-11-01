public class HowToAccessStaticMethod
{
     int i;
     static int j;
	
     public static void staticMethod()
     {
	 HowToAccessStaticMethod.j = 9000;
         System.out.println("you can access a static method this way");
     }
  
    public void nonStaticMethod() 
    {
	int result = 0;
       this.i=100;
       HowToAccessStaticMethod.j=1000;
       System.out.println("Don't try to access a non static method");
    }

} 