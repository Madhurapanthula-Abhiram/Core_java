import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	void m1()
	{
	System.out.println("THIS IS M1");
	}
	void m1(String a)
	{
	this.m1();
	System.out.println("The string value is: "+a);
	}
	public static void main(String[] args)
	{
	new B().m1(sc.next());
	}
}