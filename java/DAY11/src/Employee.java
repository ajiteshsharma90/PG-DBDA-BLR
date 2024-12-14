import java.io.Serializable;

public class Employee implements Serializable
{

	int id;
	String name;
	int sal;
	public Employee(int id, String name, int sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void displayEmployee()
	{
		System.out.println(id+name+sal);
	}
	
	
	
}
