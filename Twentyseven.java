class Twentyseven
{
	static Twentyseven obj=new Twentyseven();
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	Boolean m2(String a)
	{
	System.out.println("The String value is:"+a);
	System.out.print("Enter the Boolean value:");
	return sc.nextBoolean();
	}
	static char m3(int b)
	{
	System.out.println("The int value is :"+b);
	System.out.print("Enter the String value:");
	System.out.println("The Boolean value is:"+obj.m2(sc.next()));
	System.out.print("Enter the char value:");
	return sc.next().charAt(0);
	}
	public static void main(String[] args)
	{
	System.out.print("Enter the int value:");
	System.out.println("The char value is:"+m3(sc.nextInt()));
	}
}