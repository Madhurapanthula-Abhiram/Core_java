class Twentyone
{
	void m1()
	{
	System.out.println("This is M1 method");
	}

	void m2()
	{
	m1();
	System.out.print("This is m2 method");
	}

	public static void main(String[] args)
	{
	Twentyone obj=new Twentyone();
	obj.m2();
	}
}

