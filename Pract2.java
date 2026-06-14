import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	
	String n=sc.next();
	
	static void m1(String n)
	{
	System.out.println("The value is :"+n);
	}
	
	public static void main(String[] args)
	{
	A ob=new A();
	m1(ob.n);
	}
}