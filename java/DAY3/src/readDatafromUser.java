import java.util.Scanner;

public class readDatafromUser
{

	public static void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public static int findsum() 
	{
		Scanner s = new Scanner(System.in);
		int sum =0;
		System.out.println("enter 5 mark ");
		for(int i=0;i<5;i++)
		{
			int n =s.nextInt();
			sum = sum+n;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) 
	{
	
//		System.out.println("enter the student details");
//		
		Scanner sc = new Scanner(System.in);
		   int  sid=sc.nextInt();
		   String name =sc.next();
		   float sal = sc.nextFloat();
		   char grade = sc.next().charAt(0);
		   
		   
		   
//		   
//		   System.out.println(sid);
//		   System.out.println(name);
//		   System.out.println(sal);
		
		//adding two numbers
		
//		System.out.println("enter the value of a ,b");
//		   int a = s.nextInt();
//		   int b = s.nextInt();
//		   add(a,b);
		   
		   
		//add 5 marks- read from user   
		   
		  int s=findsum();
		  System.out.println("sum of 5 subjects are "+s);
		  
		 
		  
	}

	
	
}
