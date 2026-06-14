import java.util.Scanner;
class B
{
	static B ob=new B();
	String a;
	boolean b;
	void m1(String c,boolean d)
	{
	a=c;
	b=d;
	}
	static void display()
	{
	System.out.print(ob.a+" "+ob.b);
	}

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	ob.m1(sc.next(),sc.nextBoolean());
	display();
	}
}
	