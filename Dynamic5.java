import java.util.Scanner;
class Dynamic5
{
	static Scanner sc=new Scanner(System.in);
	static String m1()
	{
	System.out.print("Enter String value: ");
	String b=sc.next();
	return b;
	}
	
	static void m2(String a)
	{
	System.out.println("The String2 value is:"+a);
	}

	public static void main(String[] args)
	{
	System.out.println("The String value is: "+m1());
	System.out.println("Enter String 2 value: " );
	m2(sc.next());
	}
}

