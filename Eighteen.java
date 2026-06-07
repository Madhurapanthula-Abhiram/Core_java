import java.util.Scanner;
class Eighteen
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a)
	{
	System.out.println("The  int value is: "+a);
	System.out.print("Enter the String value: ");
	return sc.next();
	}

	String m2(boolean b)
	{
	System.out.println("The boolean value is: "+b);
	System.out.print("Enter the integer value: ");
	return m1(sc.nextInt());
	}

	boolean m3(float c)
	{
	System.out.println("The float value is: "+c);
	System.out.print("The Boolean value: ");
	return sc.nextBoolean();
	}

	boolean m4(char d)
	{
	System.out.println("The character value is: "+d);
	System.out.print("Enter the float value: ");
	return m3(sc.nextFloat());
	}

	public static void main(String[] args)
	{
	Eighteen obj=new Eighteen();
	System.out.print("Enter the Boolean value: ");
	boolean b=sc.nextBoolean();
	System.out.println(obj.m2(b));
	System.out.print("Enter the character value: ");
	char d=sc.next().charAt(0);
	System.out.println(obj.m4(d));
	
	
	}
}

