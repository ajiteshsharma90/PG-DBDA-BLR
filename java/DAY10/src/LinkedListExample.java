import java.util.LinkedList;

public class LinkedListExample 
{

	public static void main(String[] args) 
	{
	
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		
		for(Integer ele :ll)
		{
			System.out.println(ele);
		}
		
		ll.remove(2);
		System.out.println("after remove");
		
		for(Integer ele :ll)
		{
			System.out.println(ele);
		}
		
		
		System.out.println("after update");
		
		ll.set(1, 25);
		for(Integer ele :ll)
		{
			System.out.println(ele);
		}
		
		
		System.out.println("insert");
		
		ll.add(3, 100);
		for(Integer ele :ll)
		{
			System.out.println(ele);
		}
		
	}
	
}
