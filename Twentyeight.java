class Twentyeight{
	static Twentyeight obj=new Twentyeight();
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	int add(int a,int b)
	{
	return a+b;
	}
	int sub(int c,int d)
	{
	return c-d;
	}
	static int  multi()
	{
	return obj.add(sc.nextInt(),sc.nextInt())*obj.sub(sc.nextInt(),sc.nextInt());
	}

	public static void main(String[] args)
	{
	System.out.print(obj.multi());
	}
}