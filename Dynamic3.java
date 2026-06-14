import java.util.Scanner;
class B{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	char c=sc.next().charAt(0);
	float F=sc.nextFloat();

	int m1(boolean b){
	System.out.print("b is : "+b+"\n");
	return sc.nextInt();
	}

	static void m2(long l,String s){
	System.out.print("long is :"+l+" String is : "+s+"\n");	
	}

	static double m3(float k ,char c){
	System.out.print("float f: "+k+" char is: "+c+"\n");
	return sc.nextDouble();}
	public static void main(String[] args)
	{
	B obj=new B();
	System.out.println("a is: " +a+ " c is :" +obj.c+ " float F is: " +obj.F);
	System.out.println(obj.m1(sc.nextBoolean()));
	m2(sc.nextLong(),sc.next());
	System.out.println(m3(sc.nextFloat(),sc.next().charAt(0)));
	
}
}

