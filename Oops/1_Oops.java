import java.util.Scanner;

class A
  {
	static Scanner sc=new Scanner(System.in);
	
	String a=sc.next();
	
	static int m1(String b)
	{
		System.out.println("The String value is : "+b);
		System.out.print("Enter the Int value : ");
		return sc.nextInt();
	}
	
	char m2(long c)
	{
		System.out.println("The long value is : "+c);
		System.out.print("Enter the char value : ");
		return sc.next().charAt(0);
	}
  }
class B extends A
  {
	
	static String c=sc.next();

	boolean b=sc.nextBoolean();
	
	void m3()
	{
		System.out.println("This is m3 method in class B");
	}
	
	public static void main(String[] args)
	{
		B ob=new B();

		System.out.println("The value of a from class A is : "+ob.a);
		System.out.println("The value of c from class B is : "+ob.c);
		System.out.println("The value of b from class B is : "+ob.b);
		System.out.print("Enter the String value : ");
		System.out.println("The int value in m1 from class A is : "+ob.m1(sc.next()));
		System.out.print("Enter the Long value : ");
		System.out.println("The char value in m2 from class A is : "+ob.m2(sc.nextLong()));
		ob.m3();
	}
  }