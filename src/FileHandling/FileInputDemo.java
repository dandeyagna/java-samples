package FileHandling;

import java.io.*;

class FileInputDemo 
{
        public static void main(String args[])
	{
               try
	       {
                     // Open the file that is the first 
                     FileInputStream fstream = new FileInputStream("abc.txt");

                     // Convert our input stream to a
                     // DataInputStream 
		     DataInputStream in = new DataInputStream(fstream);

                     // Continue to read lines while 
                     // there are still some left to read
                    while (in.available() !=0)
		    {
                        // Print file line to screen
			System.out.println (in.readLine());
		    }
		    in.close();
		} 
                catch (Exception e)
	        {
			System.err.println("File input error");
		}
		
	}

}