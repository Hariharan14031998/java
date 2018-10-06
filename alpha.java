import java.util.Scanner;

public class Main
{
public static void main(String args[])
{
char ch;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Character : ");
ch = sc.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
System.out.print("Alphabet");
else
System.out.print("No");
}
}