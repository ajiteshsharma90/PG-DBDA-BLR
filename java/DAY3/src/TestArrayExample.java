import java.util.Scanner;

public class TestArrayExample 
{
	
	public static void main(String[] args) 
	{
		
		
		System.out.println("1: createMarkArray");
		System.out.println("2: display marks");
		System.out.println("3: findsumofmarks");
		System.out.println("4: exit");
		int[] marks=null;
		Scanner s = new Scanner(System.in);
		while(true)
		{
		System.out.println("enter the choice");
		int ch = s.nextInt();
		
		
		switch(ch)
		{
		
		case 1: marks=MarkManagement.createMarkArray();
     	break;        
		case 2: MarkManagement.displayMarks(marks);      
		break; 
		case 3: int sum=MarkManagement.findsumofmarks(marks); 
		        System.out.println("total marks "+sum );
		break; 
		
		case 4: System.out.println("end of process");  
			System.exit(0);
		default: System.out.println("invalid input");
		  
		}
		
		}
	}



	



	

	
	
	
}
