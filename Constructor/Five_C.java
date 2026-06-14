




import java.util.Scanner;
class 	Five_C

{
	
	static Scanner sc=new Scanner(System.in);

	Five_C()
	{
	System.out.println("Enter the int value:");
	m1(sc.nextInt());
	System.out.println("This is a default Constructor");
	}
	
	Five_C(String a,int b)
	{
	System.out.println("Enter the String value:");
	m2(sc.next());
	System.out.println("The name is: "+a+" age is : "+b);
	}

	Five_C(String a,int b,int rollno)
	{
	System.out.println("Enter the Boolean value:");
	m3(sc.nextBoolean());
	System.out.println("The name is: "+a+" age is : "+b+" roll no is : "+rollno);
	}
	
	static boolean m1(int a)
	{
	System.out.println("This is m1 method");
	System.out.println("The int value is: "+a);
	System.out.println("Enter the Boolean value:");
	return sc.nextBoolean();
	}
	
	static int m2(String b)
	{
	System.out.println("This is m2 method");
	System.out.println("The String value is: "+b);
	System.out.println("Enter the int value:");
	return sc.nextInt();
	}
	
	static String m3(Boolean c)
	{
	System.out.println("This is m3 method");
	System.out.println("The Boolean value is: "+c);
	System.out.println("Enter the String value:");
	return sc.next();
	}
	
	public static void main(String[] args)
	{
	new Five_C();
	new Five_C(sc.next(),sc.nextInt());
	new Five_C(sc.next(),sc.nextInt(),sc.nextInt());
	
	}
}