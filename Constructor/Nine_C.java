import java.util.Scanner;
class Nine_C
{
	//Nine_C()
	//{
	//System.out.println("yo");
	//}
	Nine_C(Nine_C a)
	{
	System.out.println(a);
	}
	public static void main(String[] args)
	{
	new Nine_C(new Nine_C());
	}
}