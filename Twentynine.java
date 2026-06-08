import java.util.Scanner;
class Twentynine
{
	static Scanner sc=new Scanner(System.in);
	static Twentynine obj=new Twentynine();
	Boolean a=sc.nextBoolean();
	char b=sc.next().charAt(0);
	int c=sc.nextInt();
	void m1(float c,boolean d)
	{
	System.out.println("This is m1");
	System.out.println("The float value is: "+c);
	System.out.println("The Boolean value is: "+d);
	System.out.println("The non static Boolean  value is : "+obj.a);
	System.out.println("The non static char value is :"+obj.b);
	System.out.println("The non static char value is :"+obj.c);
	
	}
	static Boolean m2(String a)
	{
	System.out.println("This is m2");
	System.out.println("The String value is: "+a);
	System.out.println("The non static Boolean  value is : "+obj.a);
	System.out.println("The non static char value is :"+obj.b);
	System.out.println("The non static char value is :"+obj.c);
	System.out.print("Enter Boolean for m2 method: ");
	return sc.nextBoolean();
	} 
	public static void main(String[] args)
	{
	System.out.print("Enter float value: ");
	float a=sc.nextFloat();
	System.out.print("Enter Boolean value: ");
	Boolean b=sc.nextBoolean();
	obj.m1(a,b);
	System.out.print("Enter String value: ");
	String c=sc.next();
	System.out.print("The Boolean in m2 is: "+m2(c));
	}
}