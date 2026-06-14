import java.util.Scanner;
class Bank
  {
	static Scanner sc=new Scanner(System.in);
	
	long accno=sc.nextLong();
	String ifsc=sc.next();
	int atmpin=sc.nextInt();
	float balance=sc.nextFloat();
	
	
  }
class Customer extends Bank
  {
	static Customer ob=new Customer();

	void display()
	  {
		System.out.println("Your account no is : "+ob.accno);
		System.out.println("Your IFSC no is : "+ob.ifsc);
		System.out.println("Your atm pin  no is : "+ob.atmpin);
		System.out.println("Your balance is : "+ob.balance);
	  }
		
		
	public static void main(String[] args)
	  {
		ob.display();
	  }
  }
	