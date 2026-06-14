import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	String a;
	int b=10;
	B(String a,int b)
	{
	this.a=a;
	this.b=b;
	}
	B(B x)
	{
	System.out.println("The a value is: "+x.a);
	System.out.println("The b value is: "+x.b);
	}
	public static void main(String[] args)
	{
	B ob=new B(sc.next(),sc.nextInt());
	new B(ob);
	}
}