import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	String a=sc.next();
	char b=sc.next().charAt(0);
	void m1(String a,char b)
	{
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(a);
	System.out.println(b);
	}
	public static void main(String[] args)
	{
	B ob=new B();
	ob.m1(sc.next(),sc.next().charAt(0));
}
}