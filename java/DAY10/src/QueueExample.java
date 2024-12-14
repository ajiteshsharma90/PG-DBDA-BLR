import java.util.PriorityQueue;

public class QueueExample
{

	public static void main(String[] args) 
	{
	
		PriorityQueue<Integer> pq = new PriorityQueue();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		
		for(Integer ele :pq)
		{
			System.out.println(ele);
		}
		
		System.out.println(" poll");
		int n =pq.poll();
		
		System.out.println(n);
		
		System.out.println("after poll");
		for(Integer ele :pq)
		{
			System.out.println(ele);
		}
		
		System.out.println("after remove");
		
		pq.remove();
		
		for(Integer ele :pq)
		{
			System.out.println(ele);
		}
		
		
	}
	
}
