import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	B()
	{
	this(sc.nextInt());
	System.out.println("This is default constructor");	
	}
	B(int a)
	{
	System.out.println("The int value is :"+a);
	}
	B(String a,boolean b)
	{
	this();
	System.out.println("The String value is :"+a);
	System.out.println("The Boolean value is :"+b);
	}
	B(double a,long b,char c)
	{
	this(sc.next(),sc.nextBoolean());
	System.out.println("The double value is :"+a);
	System.out.println("The long value is :"+b);
	System.out.println("The char value is :"+c);
	}
	
	public static void main(String[] args)
	{
	new B(sc.nextDouble(),sc.nextLong(),sc.next().charAt(0));
	}
	}