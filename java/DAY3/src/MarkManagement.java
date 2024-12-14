
public class MarkManagement
{

	public static int[] createMarkArray() 
	{
		int[] marks = {23,45,24,57,78};
		System.out.println("marks created");
		return marks;
	}
	
	
	
	public static int findsumofmarks(int[] marks)
	{
		  int sum =0;
		  
		for(int i=0;i<4;i++)
		  {
		    
			  sum = sum +marks[i];

		  } 
		
		 return sum;
	}
	
	public static void displayMarks(int[] marks) 
	{
		  for( int ele :marks)
		  {
			  System.out.println(ele);
		  }
		
	}
	
}
