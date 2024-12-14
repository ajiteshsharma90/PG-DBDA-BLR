import java.util.Scanner;

public class Login
{

	public static void validate(String uname,String pwd)
	{
		
		
		if(uname.equals("admin") && pwd.equals("1234"))
		{
			
			System.out.println("login sucess");
		}
		else
			System.out.println("invalid user");
		
	}
	
	
	
	public static void main(String[] args) 
	{
	
		System.out.println("enter the user name passward");
		
		Scanner sc = new Scanner(System.in);
		String uname = sc.next();
		String pwd = sc.next();
		validate(uname,pwd);
		
		
	}
	
}
