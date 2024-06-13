import java.io.*;
public class pingip
{
public static void runSystemCommand(String Command)
{
try{
Process p=Runtime.getRuntime().exec(Command);
BufferedReader InputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
String s=" ";
while((s=InputStream.readLine())!=null)
{
System.out.println(s);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String[]args)
{
String Ip="localhost";

runSystemCommand("ping " +Ip);
java.util.Date date=new java.util.Date();
System.out.println(date);
}
}