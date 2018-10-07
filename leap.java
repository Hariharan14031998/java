import java.util.Scanner; 
public class leap 
{
public static void main(String[] args) 
{
int year;
boolean leap = false;
Scanner s=new Scanner(System.in);
year=s.nextInt();
if(year % 4 == 0)
{
if( year % 100 == 0)
{
if ( year % 400 == 0)
leap = true;
else
leap = false;
}
else
leap = true;
}
else
leap = false;
if(leap)
System.out.println("Yes");
else
System.out.println("No");
}
}