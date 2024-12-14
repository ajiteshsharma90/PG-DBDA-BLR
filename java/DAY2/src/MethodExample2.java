
public class MethodExample2 
{

	public static int reverse(int num)
	{
		int digit=0;
		int reverseNumber=0;
		while(num>0)
			{					
				digit = num%10;
				reverseNumber = (reverseNumber*10 + digit);
				num = num/10;
				
			}
		return reverseNumber;
	}
	
	
	public static void main(String[] args) 
	{
	    int num = 1234;
		int rnum=reverse(num);
		System.out.println("inside the main");
		System.out.println(rnum);
	}
	
	
}
