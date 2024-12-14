import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeObject 
{

	
	public static void main(String[] args) 
	{
	
		HashMap<Integer ,Employee> hm = new HashMap();
	
		Employee e1 = new Employee(1001,"shan",30000);
		Employee e2 = new Employee(1002,"nsnathan",40000);
		Employee e3 = new Employee(1003,"kumar",50000);
		
		hm.put(e1.id, e1);
		hm.put(e2.id, e2);
		hm.put(e3.id, e3);
		
		for(Map.Entry<Integer, Employee>  m :hm.entrySet())
		{
			System.out.print(m.getKey() + " ");
			
			//m.getValue().displayemployee();
			
			Employee e =m.getValue();
			e.displayemployee();
			
			System.out.println();
		}
		
		
		System.out.println("retrive perticuler object");
		
		Employee e=hm.get(1002);
		e.displayemployee();
		
		
		System.out.println("delete perticuler object");
		
		hm.remove(1003);
		
		for(Map.Entry<Integer, Employee>  m :hm.entrySet())
		{
			System.out.print(m.getKey() + " ");
			
			//m.getValue().displayemployee();
			
			Employee obj =m.getValue();
			obj.displayemployee();
			
			System.out.println();
		}
		
		
		
		System.out.println("update perticuler object");
		
		Employee obj=hm.get(1001);
		obj.sal = 60000;
		
		for(Map.Entry<Integer, Employee>  m :hm.entrySet())
		{
			System.out.print(m.getKey() + " ");
			
			//m.getValue().displayemployee();
			
			Employee ele =m.getValue();
			ele.displayemployee();
			
			System.out.println();
		}
		
		
		
		
	} 
	
	
	
}
