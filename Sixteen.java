class Sixteen
{
	static Sixteen obj=new Sixteen();
	int age=22;
	String name="Abhiram";
	static void m1()
	{
	System.out.println("I am "+obj.name+" i am "+obj.age+" years old");
	}
	static void m2()
	{
	System.out.println("I am "+obj.name+" i am "+obj.age+" years old");
	}
	public static void main(String[] args)
	{
	m1();
	m2();
	System.out.println(obj.age);
	System.out.println(obj.name);
}
}

