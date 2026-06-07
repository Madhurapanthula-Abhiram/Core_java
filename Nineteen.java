import java.util.Scanner;
class Nineteen
{
	static Scanner sc=new Scanner(System.in);
	boolean m1(String a)
	{
	System.out.println("The  String value is: "+a);
	System.out.print("Enter the Boolean value: ");
	return sc.nextBoolean();
	}

	void m2(float b)
	{
	System.out.println("The float value is: "+b);
	System.out.print("Enter the String value: ");
	System.out.println("The boolean value is :"+ m1(sc.next()));
	}

	public static void main(String[] args)
	{
	Nineteen obj=new Nineteen();
	System.out.print("Enter the float value: ");
	float b=sc.nextFloat();
	obj.m2(b);
	}
}

