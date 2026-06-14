import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a)
	{
	System.out.println("The int value is: "+a);
	System.out.println("Enter the String value: ");
	return sc.next();
	}
	
	boolean m2(float a)
	{
	System.out.println("Enter the int value: ");
	this.m1(sc.nextInt());
	System.out.println("The float value is: "+a);
	System.out.println("Enter the Boolean value: ");
	return sc.nextBoolean();
	}
	
	double m3(String a)
	{
	System.out.println("Enter the Float value: ");
	this.m2(sc.nextFloat());
	System.out.println("The String value is: "+a);
	System.out.println("Enter the double value: ");
	return sc.nextDouble();
	}
	
	public static void main(String[] args)
	{
	
	System.out.println("Enter the String value: ");
	new B().m3(sc.next());
	}
}
	
	