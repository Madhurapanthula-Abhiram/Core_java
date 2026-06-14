import java.util.Scanner;
class Dynamic4
{
	static Scanner sc=new Scanner(System.in);
	static String m1(char a)
	{
	System.out.print("Enter String value: ");
	String b=sc.next();
	System.out.println("The char a value  is: "+a);
	return b;
	}

	public static void main(String[] args)
	{
	System.out.print("Enter a value:");
	char a=sc.next().charAt(0);
	System.out.println("The String value is: "+m1(a));
	}
}

