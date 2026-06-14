import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	B()
	{
	this(sc.next());
	System.out.println("This is default");
	}
	B(String a)
	{
	System.out.println(a);
	}
	public static void main(String[] args)
	{
	new B();
	}
}