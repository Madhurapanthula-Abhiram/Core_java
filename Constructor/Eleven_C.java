import java.util.Scanner;
class Eleven_C
{
	Eleven_C()
	{
	System.out.println("default");
	}
	Eleven_C(Eleven_C a)
	{
	System.out.println(a);
	}
	Eleven_C(String b)
	{
	System.out.println(b);
	}
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	new Eleven_C(new Eleven_C(sc.next()));
	}
}