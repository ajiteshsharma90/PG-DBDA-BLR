class Person
{
	int id;
	String name;
	String add;
	public Person(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	void dispDetails
	()
	{
		System.out.print(id + name+add);
	}
	
}

class Teacher extends Person
{
	int sal;
	
	Teacher(int id,String name,String add,int sal)
	{   super(id,name,add);
		this.sal = sal;
	}
	
	void dispsal()
	{
		System.out.print(sal+" " );
	}
	
	void findtax()
	{
		if(sal>=30000)
			System.out.print("5000");
		else
			System.out.print("1000");
	}
	
	
}

class Student extends Person
{
	
	int mark;
	  public Student(int id, String name, String add,int mark) 
	  {
		super(id, name, add);
		this.mark = mark;
		
	  }

	void dispmark()
	{
		System.out.print(mark);
	}
	
	
	void finresult()
	{
		if(mark>35)
			System.out.print("pass");
		else
			System.out.print("fail");
	}
	
}





public class TestInheritance2 
{

	public static void main(String[] args) 
	{
   System.out.println("teacher object");
		Teacher t = new Teacher(1001,"shan","blr",30000);
		t.dispDetails();
		t.dispsal();
		t.findtax();
		System.out.println();
	System.out.println("student object");	
		
	    Student s = new Student(101,"nathan","chennai",50);
		s.dispDetails();
		s.dispmark();
		s.finresult();
		
		
	}
	
}
