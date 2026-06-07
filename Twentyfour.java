import java.util.Scanner;
class Twentyfour
{
	static Scanner sc=new Scanner(System.in);
	static Twentyfour obj=new Twentyfour();

	boolean m1(String a)
	{
	System.out.println("Now in m1");
	System.out.println("String value is : "+a);
	System.out.print("Enter boolean value:");
	return sc.nextBoolean();
	}

	static void m2(char b)
	{
	System.out.println("Now in m2");
	System.out.println("char value is : "+b);
	System.out.print("Enter String value:");
	System.out.println("The boolean value is: "+obj.m1(sc.next()));
	}
	
	int m3()
	{
	System.out.println("Now in m3");
	System.out.print("Enter char value:");
	m2(sc.next().charAt(0));
	System.out.print("Enter integer value :");
	return sc.nextInt();
	}
	
	static String m4(double c)
	{
	System.out.println("Now in m4");
	System.out.println("double value is : "+c);
	System.out.println("The int value is: "+obj.m3());
	System.out.print("Enter String value:");
	return sc.next();
	}

	public static void main(String[] args)
	{
	
	System.out.print("Enter Double value:");
	System.out.println("The String value is: "+m4(sc.nextDouble()));
	}
}

