import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	B(String a)
	{
	System.out.println("The String value is: "+a);
	}
	B()
	{
	this(sc.next());
	System.out.println("This is default");
	}
	void m1()
	{
	this.m1(sc.nextInt());
	System.out.println("m1");
	}
	void m1(int a)
	{
	System.out.println("The int value in m1 is :"+a);
	System.out.println("This is non static a:"+this.a);
	}
	public static void main(String[] args)
	{
	new B().m1();
	}
}