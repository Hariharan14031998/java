import java.util.Scanner;
public class count 
{
public static void main(String[] args) 
{
int num, Count=0;
Scanner sc = new Scanner(System.in);		
System.out.println("\n Please Enter any Number: ");
num = sc.nextInt();
while(Number > 0) 
{
num = num / 10;
Count = Count + 1; 
}
System.out.println( +Count);
}
}
}
