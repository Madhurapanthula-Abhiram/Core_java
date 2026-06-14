import java.util.Scanner;
class Dynamic11
{
static Scanner sc=new Scanner(System.in);
static boolean m1()
{
System.out.println("Now in m1");
System.out.print("Enter boolean value: ");
return sc.nextBoolean();
}
static boolean m2()
{
System.out.println("Now in m2");
System.out.print("Enter boolean value: ");
return sc.nextBoolean();
}
static boolean m3()
{
System.out.println("Now in m3");
System.out.print("Enter boolean value: ");
return sc.nextBoolean();
}
public static void main(String[] args)
{
	if(m1()==true)
	{
	System.out.println("The boolean value in m2 is: "+m2());
	}
	else
	{
	System.out.println("The boolean value in m3 is: "+m3());
	}
}
}