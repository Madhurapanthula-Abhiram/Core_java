import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	
	
	static A m1()
	{
	A ob=new A();
	System.out.println("This is m1:");
	return ob;
	}
		void m2()
	{
	System.out.println("This is m2 and value is :");
	}
	
	public static void main(String[] args)
	{
	A n=m1();
	n.m2();
	}
}