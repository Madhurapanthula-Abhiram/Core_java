import java.util.Scanner;
class Student
{

	String name;
	int id;
	int marks;
	Student(String a,int b,int c)
	{
	name=a;
	id=b;
	marks=c;
	}
	void display(Student x)
	{
	System.out.println("Name is: "+x.name);
	System.out.println("id is: "+x.id);
	System.out.println("marks is: "+x.marks);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Student ob1=new Student(sc.next(),sc.nextInt(),sc.nextInt());	
	Student ob2=new Student(sc.next(),sc.nextInt(),sc.nextInt());
	Student ob3=new Student(sc.next(),sc.nextInt(),sc.nextInt());
	Student ob4=new Student(sc.next(),sc.nextInt(),sc.nextInt());
	Student ob5=new Student(sc.next(),sc.nextInt(),sc.nextInt());
	System.out.println("Enter which Students details you want:");
	int n=sc.nextInt();
	if(n==1)
	{
	ob1.display(ob1);
	}
	else if(n==2)
	{
	ob2.display(ob2);
	}
	else if(n==3)
	{
	ob3.display(ob3);
	}
	else if(n==4)
	{
	ob4.display(ob4);
	}
	else
	{
	ob5.display(ob5);
	}
	}
}