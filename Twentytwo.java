import java.util.Scanner;
class Twentytwo
{
	static Scanner sc=new Scanner(System.in);
	void m1(String a)
	{
	System.out.println("Now in m1");
	System.out.println("The String value is :" +a);
	}

	void m2(boolean b)
	{
	System.out.println("Now in m2");
	System.out.println("The boolean value is :" +b);
	System.out.print("Enter String value: ");
	m1(sc.next());
	}

	public static void main(String[] args)
	{
	Twentytwo obj=new Twentytwo();
	System.out.print("Enter boolean value: ");
	obj.m2(sc.nextBoolean());
	}
}

