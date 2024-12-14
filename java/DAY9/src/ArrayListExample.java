import java.util.ArrayList;

public class ArrayListExample
{

	
	public static void main(String[] args) 
	{
	
		ArrayList<Integer>  al = new ArrayList<>();
		System.out.println("adding data");
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("display the data");
		
		for( Integer ele :al)
		{
			System.out.println(ele);
		}
		
		System.out.println("update");
		
		al.set(1, 100);
		
		for( Integer ele :al)
		{
			System.out.println(ele);
		}
		
		System.out.println("remove");
		
		al.remove(3);
		
		for( Integer ele :al)
		{
			System.out.println(ele);
		}
		
	}
	
	
}
