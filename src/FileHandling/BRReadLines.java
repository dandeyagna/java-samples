package FileHandling;


import java.io.*;

public class BRReadLines 
{
  public static void main(String args[]) throws IOException 
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;

    System.out.print("Enter text: ");
    str = br.readLine();
    System.out.println("You have entered: "+str);
  }
}
