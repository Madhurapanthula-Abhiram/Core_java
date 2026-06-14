import java.util.Scanner;
class C
{
	
	String a;
	boolean b;
	void m1(String c,boolean d)
	{
	a=c;
	b=d;
	}
	static void display(B ob)
	{
	System.out.print(ob.a+" "+ob.b);
	}

	public static void main(String[] args)
	{
	B ob=new B();
	Scanner sc=new Scanner(System.in);
	ob.m1(sc.next(),sc.nextBoolean());
	display(ob);
	}
}
	