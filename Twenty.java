import java.util.Scanner;
class Twenty
{
	static Scanner sc=new Scanner(System.in);
	boolean m(String a)
	{
	System.out.println("The  String value is: "+a);
	System.out.print("Enter the Boolean value: ");
	return sc.nextBoolean();
	}

	double n(boolean b)
	{
	System.out.println("The  boolean value is: "+b);
	System.out.print("Enter the String value: ");
	System.out.println("The boolean value is: "+ m(sc.next()));
	System.out.print("Enter double value: ");
	return sc.nextDouble();
	}

	public static void main(String[] args)
	{
	Twenty obj=new Twenty();
	System.out.print("Enter the boolean value: ");
	boolean b=sc.nextBoolean();
	System.out.println("The double value is: "+obj.n(b));
	}
}

