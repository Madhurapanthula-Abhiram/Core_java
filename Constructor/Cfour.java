import java.util.Scanner;
class Cfour
{
	static Scanner sc=new Scanner(System.in);
	
	long a=sc.nextLong();
	
	Cfour(String a)
	{
	System.out.println(a);
	}
	
	public static void main(String[] args)
	{
	
	Cfour o=new Cfour(sc.next());
	System.out.println("Ok");
	}
}