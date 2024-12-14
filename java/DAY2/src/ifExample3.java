
public class ifExample3
{

	public static void main(String[] args) {
		
		
//		int a =10;
//		int b = 10;
//		
//		if(a == b)
//		{
//			System.out.println("both are equal");
//		}
		
		String uname="admin";
		String passwd="234";
		
		if(uname.equals("admin") && passwd.equals("1234"))
		{
			System.out.println("logged in sucessfully");
			
		}else if(!uname.equals("admin"))
				
			System.out.println("invalid user name ");
		else 
			System.out.println("invalid password");
		
		
	}
	
	
}
