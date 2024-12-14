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
		this.dispEmployee();
	}
	
	public void dispEmployee()
	{
		 System.out.println(this.empno +" "+ this.name +" " + this.sal);
	}
	
	public static void main(String[] args) 
	{
	
		Employee e1 = new Employee(1001,"shan",30000);
		
		Employee e2 = new Employee(1002,"nsnathan",50000);
		
	  
		
		
		
		
	}
	
}
