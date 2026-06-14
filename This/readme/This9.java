import java.util.Scanner;
class B
{
	String address;
	String name;
	static Scanner sc=new Scanner(System.in);

	B(String name,String address)
	{
		this.name=name;
		this.address=address;
	}

	B(B x)
	{
		this.address = x.address;
	}
	
	void display(B x)
	{
		System.out.println("The temp address is:"+x.address);
		System.out.println("The permenant address is:"+this.address);
	}

	public static void main(String[] args)
	{
		System.out.print("Enter your name and permenant address: ");

		B ob=new B(sc.next(),sc.next());

		System.out.print("Is your permenant address same as your temporaray address(Y/N): ");

		char op=sc.next().charAt(0);

		if(op=='Y'||op=='y')
		{
			B ob2=new B(ob);
			ob.display(ob2);
		}
		else
		{
			System.out.print("Enter your temp address:");
			B ob1=new B(ob.name,sc.next());
			ob.display(ob1);
		}

	}
}
	