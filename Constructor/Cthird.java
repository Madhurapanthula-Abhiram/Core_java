class Cthird
{
	
	Cthird()
	{
	System.out.println("This is a default Constructor");
	}
	
	Cthird(String a)
	{
	System.out.println("The name is:" +a);
	}
	
	Cthird(String a,int b)
	{
	System.out.println("The name is: "+a+" age is : "+b);
	}
	
	Cthird(String a,int b,int rollno)
	{
	System.out.println("The name is: "+a+" age is : "+b+" roll no is : "+rollno);
	}
	
	public static void main(String[] args)
	{
	Cthird o1=new Cthird();
	Cthird o2=new Cthird("Abhiram");
	Cthird o3=new Cthird("Abhiram",5);
	Cthird o4=new Cthird("Abhiram",5,1);
	}
}