import java.util.Scanner;
class Eight_C
{
	static Scanner sc=new Scanner(System.in);
	Boolean a=sc.nextBoolean();
	Eight_C()
	{
	System.out.print("This is a default constructor\n");
	}
	Eight_C(String a)
	{
	new Eight_C();
	System.out.println("The name is:" +a);
	}
	
	Eight_C(String a,int b)
	{
	new Eight_C(sc.next());
	System.out.println("The name is: "+a+" age is : "+b);
	}
	Eight_C(String a,int b,int c)
	{
	new Eight_C(sc.next(),sc.nextInt());
	System.out.println("The name is: "+a+" age is : "+b+" id  is :"+c);
	}
	public static void main(String[] args)
	{
	System.out.println(new Eight_C(sc.next(),sc.nextInt(),sc.nextInt()).a);
	}
}