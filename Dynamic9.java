class Dynamic12
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);

	static Boolean a=sc.nextBoolean();
	char b=sc.next().charAt(0);
	String c=sc.next();

	static boolean m1(long d)
	{
	System.out.println("This is m1");
	System.out.println(new Dynamic12().b);
	System.out.println(new Dynamic12().c);
	System.out.println(a);
	System.out.println("The long value is : "+d);
	System.out.println("The byte value in m3 is : "+new Dynamic12().m3(sc.nextDouble()));
	System.out.print("Enter the Boolean value: ");
	return sc.nextBoolean();
	}


	static double m2(float d)
	{
	System.out.println("This is m2");
	System.out.println("The boolean value in m4 is : "+new Dynamic12().m4(sc.nextShort()));
	System.out.println(new Dynamic12().b);
	System.out.println(new Dynamic12().c);
	System.out.println(a);
	System.out.println("The float value is : "+d);
	System.out.print("Enter the double value: ");
	return sc.nextDouble();
	}


	byte m3(double d){
	System.out.println("This is m3");
	System.out.println(b+" "+c+" "+a);
	System.out.println("The double value in m3 is: "+d);
	System.out.print("Enter the byte value: ");
	return sc.nextByte();
	}
	boolean m4(short d){
	System.out.println("This is m4");
	System.out.println(b+" "+c+" "+a);
	System.out.println("The short value in m4 is: "+d);
	System.out.print("Enter the Boolean value: ");
	return sc.nextBoolean();
	}


	public static void main(String[] args)
	{
	System.out.println("This is main");
	System.out.print("Enter long value: ");
	System.out.println("The Boolean value in m1 is: "+m1(sc.nextLong()));
	System.out.print("Enter Float value: ");
	System.out.println("The double value in m2 is : "+ m2(sc.nextFloat()));
	System.out.print(new Dynamic12().b+" "+new Dynamic12().c+" "+a);
	}
}