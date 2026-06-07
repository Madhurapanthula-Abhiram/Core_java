class Fifteen
{
	 void m1(float v,String name)
	{
	System.out.println("Hello "+name+" your avg is: "+v);
	}
	static void m2(boolean v1,long v2)
	{
	System.out.println("The boolean value is "+v1+" and long value is "+v2);
	}
	void m3(char a1,int a2)
	{
	System.out.println("The char value is "+a1+" and int value is "+a2);
	}
	
	public static void main(String[] args)
	{
	Fifteen obj=new Fifteen();
	obj.m1(10.245f,"Abhiram");
	m2(true,1722345654);
	obj.m3('A',34);
}
}

