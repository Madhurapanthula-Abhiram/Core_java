import java.util.Scanner;
class B
{
	static Scanner sc=new Scanner(System.in);
	String a;
	char b;
	B(String a,char b)
	{
	this.a=a;
	this.b=b;
	System.out.println("The a value is :"+this.a+" The b value is :"+this.b);
	}
	public static void main(String[] args)
	{
	new B(sc.next(),sc.next().charAt(0));
	}
}