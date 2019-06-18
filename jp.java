import java.io.*;
import java.util.*;
class jp
{
void getconnection(String add,String port)
{
     try{
String command = "python3 test.py";
    Process p = Runtime.getRuntime().exec(command);
    p.waitFor();
    BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
    BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
          String line;
        while ((line = bri.readLine()) != null) {
            System.out.println(line);
          }
          bri.close();
          while ((line = bre.readLine()) != null) {
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
void publish(String type,String val)
{
   
    try
    {
    String command = "python3 test.py";
    Process p = Runtime.getRuntime().exec(command);
    p.waitFor();
    BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
    BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
          String line;
        while ((line = bri.readLine()) != null) {
            System.out.println(line);
          }
          bri.close();
          while ((line = bre.readLine()) != null) {
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
public String subscribe()
{
    try
    {
    String command = "python3 test.py";
    Process p = Runtime.getRuntime().exec(command);
    p.waitFor();
    BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
    BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
          String line;
        while ((line = bri.readLine()) != null) {
            System.out.println(line);
          }
          bri.close();
          while ((line = bre.readLine()) != null) {
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
  return "";

}
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Address and port number of AGV");
  String address=sc.next();
  String port=sc.next();

  jp j=new jp();

  j.getconnection(address,port);

}
}
