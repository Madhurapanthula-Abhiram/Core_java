import java.util.Scanner;
class Twentythree{
	static Scanner sc=new Scanner(System.in);
	float m1()
	{
	System.out.println("Now in m1");
	System.out.print("Enter float value:");
	return sc.nextFloat();
	}

	boolean m2()
	{
	System.out.println("Now in m2");
	System.out.println("The float value is: "+m1());
	System.out.print("Enter boolean value :");
	return sc.nextBoolean();
	}

	public static void main(String[] args)
	{
	Twentythree obj=new Twentythree();
	System.out.println("The boolean value is: "+obj.m2());
	}
}

