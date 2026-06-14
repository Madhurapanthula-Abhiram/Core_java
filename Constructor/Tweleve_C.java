import java.util.Scanner;
class B
{
	String a;
	char b;
	B(String c,char d)
	{
	a=c;
	b=d;
	}
	B(B x)
	{
	System.out.println("The default value of a is: "+a);
	System.out.println("The default value of b is: "+b);
	System.out.println(x.a);
	System.out.println(x.b);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	B ob1=new B(sc.next(),sc.next().charAt(0));
	B ob2=new B(ob1);
	}
}