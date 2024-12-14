import java.util.Scanner;

public class ArrayExample1
{

	
	public static void main(String[] args) 
	{
	
		int[] num = new int[4];	
		int sum =0;
//		  num[0] = 10;
//		  num[1] = 20;
//		  num[2] = 30;
//		  num[3] = 40;
		  
//		  for(int i=0;i<4;i++)
//		  {
//		     System.out.println((num[i]));
//
//		  } 
		
		Scanner s = new Scanner(System.in);
		//read array element
		
		System.out.println("enter the marks");
		  for(int i=0;i<4;i++)
		  {
		    
			  num[i]=s.nextInt();

		  } 
		//adding marks
		  for(int i=0;i<4;i++)
		  {
		    
			  sum = sum +num[i];

		  } 
		  
		  
		// display array element
		
		  System.out.println("student marks");
//		  for( int ele :num)
//		  {
//			  System.out.println(ele);
//		  }
		  
		  //iterate using for loop
		  
		  for(int i=0;i<num.length;i++)
		  {
		     System.out.println((num[i]));

		  } 
		  
		  System.out.println("total marks "+sum );
	}
	
	
}
