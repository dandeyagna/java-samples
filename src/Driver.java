public class Driver
{  
    public static void main(String[] args) 
    {
       HowToAccessStaticMethod hasm = new HowToAccessStaticMethod();
   
       hasm.i=100;
       HowToAccessStaticMethod.j=1000;

       hasm.nonStaticMethod();
       HowToAccessStaticMethod.staticMethod();
    }
}