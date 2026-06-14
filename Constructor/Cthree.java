class Cthree
{
	
	Cthree()
	{
	System.out.println("This is a default Constructor");
	}
	
	Cthree(String a,int b)
	{
	System.out.println("The name is: "+a+" age is : "+b);
	}
	
	public static void main(String[] args)
	{
	Cthree o1=new Cthree();
	Cthree o=new Cthree("Abhiram",5);
	}
}