import java.util.Scanner;
class Seventeen
{
	 
	int add(int a,int b)
	{
;	return a+b;
	}
	int sub(int a ,int b)
	{
	return a-b;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Seventeen s=new Seventeen();
	System.out.println("The sum of 2 numbers is: "+s.add(sc.nextInt(),sc.nextInt()));
	System.out.println("The sub of 2 numbers is: "+s.sub(sc.nextInt(),sc.nextInt()));
	}
}

