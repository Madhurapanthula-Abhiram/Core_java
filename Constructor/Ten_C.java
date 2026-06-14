import java.util.Scanner;
class Ten_C
{
	Boolean a;
	String b;
	Ten_C(Boolean c,String d)
	{
	a=c;
	b=d;
	System.out.println(a+" "+b);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	new Ten_C(sc.nextBoolean(),sc.next());
	}
}
