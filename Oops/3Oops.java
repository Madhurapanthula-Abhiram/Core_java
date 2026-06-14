import java.util.Scanner;
class Airtel
  {
	static User ob=new User();
	static Scanner sc=new Scanner(System.in);
	int recharge(int p)
	  {
		if(p==1)
		 {
		   	return 219;
		 }
		else if(p==2)
		 {
			return 319;
		 }
		else
		 {
		 	return 719;
		 }
	  }
  }
class Phonepe extends Airtel
 {
	 static int  re=0;
	 void select()
	  {
		ob.plans();
		System.out.print("Enter the plan you want (1 or 2 or 3) : ");
		re+=recharge(sc.nextInt());
		System.out.println("Do you want to recharge again :(Y/N) ");
		char op=sc.next().charAt(0);
		if(op=='Y'||op=='y')
		 {
			
			select();
		 }
		else
		 {
			Bill();
		 }
	   }
	void plans()
	  {
		System.out.println("Plan of 219");
		System.out.println("Plan of 319");
		System.out.println("Plan of 719");
	  }
	void Bill()
	  {
		System.out.println("Your Bill is :"+re);
	  }
  }
class User extends Phonepe
  {
	public static void main(String[] args)
	  {
		
		
		ob.select();
		
	  }
  }