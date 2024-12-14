
public class SwitchExample
{

	public static void main(String[] args) 
	{
	
		float feedback = 3.5f;
		
	 
		switch(Math.round(feedback))
		{
		case 1: System.out.println("satisfactory");
		break;
		case 2: System.out.println("good");
		break;
		case 3: System.out.println("very good");
		break;
		case 4: System.out.println("excellent");
		break;
		default:
			System.out.println("invalid data");
		}
		
		
		
		
		
		
	}
	
}
