
public class TestReferenceMemory
{
	public static void change(int[] marks)
	{
		
		marks[2]++;
	}
	
	public static void main(String[] args) 
	{
	
		
		int[] marks = {23,45,24,57,78};
		
		
		for( int ele :marks)
		  {
			  System.out.println(ele);
		  }
		
		change(marks);
		
		System.out.println("after the change function");
		
		for( int ele :marks)
		  {
			  System.out.println(ele);
		  }
		
		
	}

	
	
}
