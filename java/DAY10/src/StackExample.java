import java.util.Stack;



public class StackExample 
{

	public static void main(String[] args) 
	{
	
		Stack<Integer> s = new Stack<>();
		
		s.add(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		
		for(Integer ele :s)
		{
			System.out.println(ele);
		}
		
		System.out.println(" pop operation");
		Integer n =s.pop();
		System.out.println(n);
		System.out.println("after pop operation");
		for(Integer ele :s)
		{
			System.out.println(ele);
		}
		
		System.out.println(" peak operation");
		Integer n1 =s.peek();
		System.out.println(n1);
		System.out.println("after peak operation");
		for(Integer ele :s)
		{
			System.out.println(ele);
		}
		
		System.out.println("Third element");
		System.out.println(s.get(2));
		
		
	}
	
	
}
