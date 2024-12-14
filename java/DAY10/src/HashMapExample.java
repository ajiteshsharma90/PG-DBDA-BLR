import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample
{

	
	public static void main(String[] args) 
	{
	
		HashMap<Integer ,String> hm = new HashMap();
		
		
		hm.put(1, "blr dbda");
		hm.put(2, "pune dbda");
		hm.put(3, "blr dac");
		hm.put(4, "mumbai dbda");
		hm.put(5, "hyd dac");
		
			
		for(Map.Entry<Integer, String>  m :hm.entrySet())
		{
			System.out.print(m.getKey() + " ");
			
			System.out.print(m.getValue());
			System.out.println();
		}
		
		
		System.out.println("retrive");
		
		System.out.println("enter the key to get the value");
		
		String value=hm.get(2);
		System.out.println(value);
		
		
		
		System.out.println("update");
		
		hm.put(2, "pune dac");
	    
		for(Map.Entry<Integer, String>  m :hm.entrySet())
		{
			System.out.print(m.getKey() + " ");
			
			System.out.print(m.getValue());
			System.out.println();
		}
		
		
		System.out.println("delete");
		
		hm.remove(5);
	    
		for(Map.Entry<Integer, String>  m :hm.entrySet())
		{
			System.out.print(m.getKey() + " ");
			
			System.out.print(m.getValue());
			System.out.println();
		}
		
		
		System.out.println("insert");
		
		
		
	}
	
	
}
