class Fourteen
{
	 void m1(float value)
	{
	System.out.println("The float value is "+value);
	}
	static void m2(int value2)
	{
	System.out.println("The int value is "+value2);
	}
	void m3(boolean value3)
	{
	System.out.println("The boolean value is "+value3);
	}
	
	public static void main(String[] args)
	{
	Fourteen obj=new Fourteen();
	obj.m1(10.245f);
	m2(172);
	obj.m3(false);
}
}

