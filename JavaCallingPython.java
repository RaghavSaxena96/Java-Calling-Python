import java.io.*;
import java.util.*;
class JavaCallingPython
{
	public static void main(String[] args)
	{
	   try
	   {

        String command = "python3 test.py"; // Command Line Syntax

        Process p = Runtime.getRuntime().exec(command);

        p.waitFor();

        BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));

        BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));

          String line;

         while ((line = bri.readLine()) != null)
         {

            System.out.println(line);
         }

          bri.close();

          while ((line = bre.readLine()) != null)
          {

            System.out.println(line);

          }

          bre.close();

          p.waitFor();

          System.out.println("Done.");

          p.destroy();

     }

     catch(Exception e)
     {
        System.out.println(e);
     }

	}
}