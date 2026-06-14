

import java.util.Scanner;
class Six_C

{
	static Scanner sc=new Scanner(System.in);
	static int a =sc.nextInt();
	boolean b=sc.nextBoolean();
	double c=sc.nextDouble();
	Six_C()
	{
	System.out.println("This is a default constructor");
	}
	
	Six_C(String z)
	{
	System.out.println("The String value is : "+z);
	}
	
	
	static long m1(char d)
	{
	System.out.println("The char value is : "+d);
	System.out.print("Enter the long value:");
	return sc.nextLong();
	}
	
	public static void main(String[] args)
	{
	new Six_C();
	System.out.print("Enter String value:");
	Six_C ob2=new Six_C(sc.next());
	System.out.print("Enter char value:");
	m1(sc.next().charAt(0));
	Six_C ob=new Six_C();
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.c);
	}
}