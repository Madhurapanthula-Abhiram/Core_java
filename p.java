import java.util.Scanner;
class A
{
char m1(char a)
{
return a;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
A ob=new A();
System.out.print("Enter char value: ");
System.out.println("The char value is: "+ob.m1(sc.next().charAt(0)));
}
}