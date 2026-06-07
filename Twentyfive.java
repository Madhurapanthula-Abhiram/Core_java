import java.util.Scanner;
class Twentyfive
{
	static Scanner sc=new Scanner(System.in);
	static Twentyfive obj=new Twentyfive();
	void m1()
	{
	System.out.println("In method m1");
	}

	static void m2()
	{
	System.out.println("In method m2");
	obj.m1();
	}
	void m3(float a){
	System.out.println("This is m3 method");
	m2();
	}
	static void m4(Boolean b)
	{
	System.out.println("This  is m4 method");
	System.out.println("The Boolean value is : "+b);
	System.out.print("Enter Float value: ");
	obj.m3(sc.nextFloat());
	}
	String m5()
	{
	System.out.println("In method m5");
	System.out.print("Enter Boolean value : ");
	m4(sc.nextBoolean());
	System.out.print("Enter String value: ");
	return sc.next();
	}
	static long  m6()
	{
	System.out.println("In method m6");
	System.out.println("The String value from m5 is  : "+obj.m5());
	System.out.print("Enter Long value: ");
	return sc.nextLong();
	}
	short m7(double c)
	{
	System.out.println("In method m7");
	System.out.println("The double value is: "+c);
	System.out.println("The Long value from m6 is : "+m6());
	System.out.print("Enter short value: ");
	return sc.nextShort();
	}
	static char m8(int d)
	{
	System.out.println("In method m8");
	System.out.println("The int value in m8 is: "+d);
	System.out.print("Enter double value is: ");
	System.out.println("The Short value from m7 is : "+obj.m7(sc.nextDouble()));
	System.out.println("The Long value from m6 is : "+m6());
	System.out.print("Enter char value: ");
	return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
	System.out.println("Enter int value: ");
	System.out.println("The char value from m8 is: "+m8(sc.nextInt()));
	
	}
}

