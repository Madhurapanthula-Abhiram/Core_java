import java.util.Scanner;
class A
{
	static A ob=new A();
	String a;
	boolean b;
	void m1(String c,boolean d)
	{
	a=c;
	b=d;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	ob.m1(sc.next(),sc.nextBoolean());
	System.out.print(ob.a+" "+ob.b);
	}
}
	