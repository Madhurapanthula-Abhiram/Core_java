class Eight
{
	static double a;
	static int b;
	float c;
	String d;
	char e;
	public static void main(String[] args)
	{
	Eight obj=new Eight();
	System.out.println("Before Initialization");
	System.out.println("The double value is:"+a+"\nThe int value is :"+b+"\nThe float value is: "+obj.c+"\nThe String value is: "+obj.d+"\nTHe char value is: "+obj.e);
	a=45.678;
	b=67;
	obj.c=34.567f;
	obj.d="Abhiram";
	System.out.println("After Initialization");
	System.out.println("The double value is:"+a+"\nThe int value is :"+b+"\nThe float value is: "+obj.c+"\nThe String value is: "+obj.d+"\nTHe char value is: "+obj.e);
	
}
}

