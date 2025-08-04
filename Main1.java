import java.util.*;
class InvalidTimeException extends Exception 
{
InvalidTimeException(String err)
{
super(err);
}}
class Main1 
{
public static void main(String...args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter time:");
String time=s.nextLine();
try 
{
String f[]=time.split(":");
int hours=Integer.parseInt(f[0]);
String f1[]=f[1].split(" ");
int minutes=Integer.parseInt(f1[0]);
if(f[0].length()==2&&f1[0].length()==2)
{
if(hours>=0&&hours<=12&&minutes>=0&&minutes<=59&&(f1[1].equalsIgnoreCase("AM")||f1[1].equalsIgnoreCase("PM")))
System.out.println("Valid time:"+time);
else 
throw new InvalidTimeException("enter valid time");
}
else 
throw new InvalidTimeException("enter valid time");
}
catch(InvalidTimeException e) 
{
System.out.println("Invalid time: "+e);
}}}
