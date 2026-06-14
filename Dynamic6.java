import java.util.Scanner;
class Dynamic8
{
	static Scanner sc=new Scanner(System.in);
	static String m1()
	{
	System.out.print("Enter String value: ");
	String b=sc.next();
	return b;
	}
	
	static String m2()
	{

	return m1();
	}

	public static void main(String[] args)
	{
	
	System.out.println("The String value is: "+m2());
	}
}

