import java.util.Scanner;

public class Employee
{

	int empno;
	String name;
	float sal;
	
	 	
	public Employee(int empno,String name ,float sal)
	{	this.empno = empno;
		this.name = name;
		this.sal = sal;
		
	}
	
	public void dispEmployee()
	{
		 System.out.println(this.empno +" "+ this.name +" " + this.sal);
	}
	
	public static void main(String[] args) 
	{
	
		Employee[] e = new Employee[3];
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
		 e[i] = new Employee(s.nextInt(),s.next(),s.nextFloat());
		 
		}

		for(int i=0;i<3;i++)
		{
		 e[i].dispEmployee(); 
		 
		}
		
	  
		
		
		
		
	}
	
}
