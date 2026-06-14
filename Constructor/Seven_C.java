
import java.util.Scanner;
class Seven_C
{
	static Scanner sc=new Scanner(System.in);
	Seven_C()
	{
	
	System.out.println("This is a default constructor");
	new Seven_C(sc.next());
	}
	
	Seven_C(String z)
	{
	System.out.println("The String value is : "+z);
	}
	public static void main(String[] args)
	{
	new Seven_C();
	}
}
